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
 * with handling
 * null arrays and
 * null elements
 * as greater.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsGreaterDim2ComparatorArrayComparator<T>
extends ComparatorArrayComparator<T[]>
{
    // TODO singleton

    /**
     * Constructor.
     *
     * @param comparator Comparator to compare array elements
     */
    public NullsGreaterDim2ComparatorArrayComparator(
            final Comparator<? super T> comparator )
    {
        super(
                HandleNullAs.GREATER ,
                HandleNullAs.GREATER ,
                ComparatorArrayComparator.<T>newComparatorArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
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
