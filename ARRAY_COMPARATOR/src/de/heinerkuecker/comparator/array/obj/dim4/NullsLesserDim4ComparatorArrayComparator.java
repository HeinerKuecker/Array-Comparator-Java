package de.heinerkuecker.comparator.array.obj.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim3.Dim3ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 4-dimensional arrays
 * with an dedicated
 * {@link Comparator} for
 * array elements
 * with handling
 * null arrays and
 * null elements
 * as lesser.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsLesserDim4ComparatorArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][][]>
{
    // TODO singleton

    /**
     * Constructor.
     *
     * @param comparator Comparator to compare array elements
     */
    public NullsLesserDim4ComparatorArrayComparator(
            final Comparator<? super T> comparator )
    {
        super(
                Nulls.LESSER ,
                Nulls.LESSER ,
                new Dim3ComparatorArrayComparator<T>(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER ,
                        Nulls.LESSER ,
                        Nulls.LESSER ,
                        comparator ) );
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString()
    {
        return
                this.getClass().getSimpleName();
    }

}
