package de.heinerkuecker.comparator.array.obj.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim2.Dim2ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 3-dimensional arrays
 * with an dedicated
 * {@link Comparator} for
 * array elements
 * with throwing
 * {@link NullPointerException}
 * for null arrays and
 * null elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsForbiddenDim3ComparatorArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][]>
{
    // TODO singleton

    /**
     * Constructor.
     *
     * @param comparator Comparator to compare array elements
     */
    public NullsForbiddenDim3ComparatorArrayComparator(
            final Comparator<? super T> comparator )
    {
        super(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                new Dim2ComparatorArrayComparator<T>(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
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
