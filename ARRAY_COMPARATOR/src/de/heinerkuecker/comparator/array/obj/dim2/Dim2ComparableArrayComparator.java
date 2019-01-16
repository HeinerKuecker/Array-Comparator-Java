package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 2-dimensional arrays
 * whose elements are
 * {@link Comparable}.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim2ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param subArrayNulls Control handling of null sub arrays to sort
     * @param elementNulls Control handling of null elements in arrays to sort
     */
    public Dim2ComparableArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs subArrayNulls ,
            final HandleNullAs elementNulls )
    {
        super(
                arrayNulls ,
                subArrayNulls ,
                ComparableArrayComparator.<T>newComparableArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        elementNulls ) );
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString()
    {
        return
                this.getClass().getSimpleName() +
                "[" +
                "arrayNulls=" + this.arrayNulls + ", " +
                "subArrayNulls=" + this.elementNulls + ", " +
                "elementNulls=" + ( (ComparableArrayComparator<?>) this.comparator ).elementNulls +
                "]";
    }

}
