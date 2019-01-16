package de.heinerkuecker.comparator.array.obj.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim3.Dim3ComparableArrayComparator;

/**
 * {@link Comparator} for
 * 4-dimensional arrays
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
public class NullsGreaterDim4ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][][]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsGreaterDim4ComparableArrayComparator()
    {
        super(
                HandleNullAs.GREATER ,
                HandleNullAs.GREATER ,
                new Dim3ComparableArrayComparator<T>(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.GREATER ,
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
