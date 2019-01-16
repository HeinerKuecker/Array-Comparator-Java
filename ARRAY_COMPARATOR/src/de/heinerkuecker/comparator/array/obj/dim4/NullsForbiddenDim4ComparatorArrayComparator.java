package de.heinerkuecker.comparator.array.obj.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim3.Dim3ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 4-dimensional arrays
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
public class NullsForbiddenDim4ComparatorArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][][]>
{
    // TODO singleton

    /**
     * Constructor.
     *
     * @param comparator Comparator to compare array elements
     */
    public NullsForbiddenDim4ComparatorArrayComparator(
            final Comparator<? super T> comparator )
    {
        super(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                new Dim3ComparatorArrayComparator<T>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
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
