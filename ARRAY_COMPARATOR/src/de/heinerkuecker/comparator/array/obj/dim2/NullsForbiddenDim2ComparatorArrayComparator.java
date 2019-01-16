package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 2-dimensional arrays
 * with an dedicated
 * {@link Comparator} for
 * array elements
 * with throwing
 * {@link NullPointerException}
 * for null arrays and null
 * elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsForbiddenDim2ComparatorArrayComparator<T>
extends ComparatorArrayComparator<T[]>
{
    // TODO singleton

    /**
     * Constructor.
     *
     * @param comparator Comparator to compare array elements
     */
    public NullsForbiddenDim2ComparatorArrayComparator(
            final Comparator<? super T> comparator )
    {
        super(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                ComparatorArrayComparator.<T>newComparatorArrayComparator(
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
