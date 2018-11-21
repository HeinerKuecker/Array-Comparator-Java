package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * two-dimensional arrays
 * with an dedicated
 * {@link Comparator} for
 * array elements
 * with sorting null
 * arrays and null
 * elements at last.
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
                Nulls.GREATER ,
                Nulls.GREATER ,
                ComparatorArrayComparator.<T>newComparatorArrayComparator(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        Nulls.GREATER ,
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
