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
 * as lesser.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsLesserDim2ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsLesserDim2ComparableArrayComparator()
    {
        super(
                HandleNullAs.LESSER ,
                HandleNullAs.LESSER ,
                ComparableArrayComparator.<T>newComparableArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ) );
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
