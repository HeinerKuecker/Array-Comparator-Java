package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 2-dimensional arrays
 * whose elements are
 * {@link Comparable}
 * with handling
 * null arrays and
 * null elements
 * as greater.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsGreaterDim2ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsGreaterDim2ComparableArrayComparator()
    {
        super(
                HandleNullAs.GREATER ,
                HandleNullAs.GREATER ,
                ComparableArrayComparator.<T>newComparableArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ) );
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
