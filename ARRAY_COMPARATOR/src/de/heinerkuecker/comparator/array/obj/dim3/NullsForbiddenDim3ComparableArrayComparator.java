package de.heinerkuecker.comparator.array.obj.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim2.NullsForbiddenDim2ComparableArrayComparator;

/**
 * {@link Comparator} for
 * 3-dimensional arrays
 * whose elements are
 * {@link Comparable}
 * with throwing
 * {@link NullPointerException}
 * for null arrays and
 * null elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsForbiddenDim3ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsForbiddenDim3ComparableArrayComparator()
    {
        super(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                new NullsForbiddenDim2ComparableArrayComparator<T>() );
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
