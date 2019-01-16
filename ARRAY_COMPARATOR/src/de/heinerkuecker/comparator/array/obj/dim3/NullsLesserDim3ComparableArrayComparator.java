package de.heinerkuecker.comparator.array.obj.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim2.NullsLesserDim2ComparableArrayComparator;

/**
 * {@link Comparator} for
 * 3-dimensional arrays
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
public class NullsLesserDim3ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsLesserDim3ComparableArrayComparator()
    {
        super(
                HandleNullAs.LESSER ,
                HandleNullAs.LESSER ,
                new NullsLesserDim2ComparableArrayComparator<T>() );
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
