package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * two-dimensional arrays
 * whose elements are
 * {@link Comparable}
 * with sorting null
 * arrays and null
 * elements at first.
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
                Nulls.LESSER ,
                Nulls.LESSER ,
                ComparableArrayComparator.<T>newComparableArrayComparator(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER ) );
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
