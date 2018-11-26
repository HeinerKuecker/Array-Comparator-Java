package de.heinerkuecker.comparator.array.obj.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
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
                Nulls.GREATER ,
                Nulls.GREATER ,
                new Dim3ComparableArrayComparator<T>(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        Nulls.GREATER ,
                        Nulls.GREATER ,
                        Nulls.GREATER ) );
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
