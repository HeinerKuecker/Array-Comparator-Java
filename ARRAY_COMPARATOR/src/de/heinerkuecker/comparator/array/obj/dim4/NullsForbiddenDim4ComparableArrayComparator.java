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
 * with throwing
 * {@link NullPointerException}
 * for null arrays and
 * null elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class NullsForbiddenDim4ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][][]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsForbiddenDim4ComparableArrayComparator()
    {
        super(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                new Dim3ComparableArrayComparator<T>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ) );
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
