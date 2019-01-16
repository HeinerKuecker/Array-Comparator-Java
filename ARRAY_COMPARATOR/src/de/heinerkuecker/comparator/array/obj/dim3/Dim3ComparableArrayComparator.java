package de.heinerkuecker.comparator.array.obj.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim2.Dim2ComparableArrayComparator;

/**
 * {@link Comparator} for
 * 3-dimensional arrays
 * whose elements are
 * {@link Comparable}.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim3ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param sub1ArrayNulls Control handling of null sub arrays to sort
     * @param sub2ArrayNulls Control handling of null sub sub arrays to sort
     * @param elementNulls Control handling of null elements in arrays to sort
     */
    public Dim3ComparableArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs sub1ArrayNulls ,
            final HandleNullAs sub2ArrayNulls ,
            final HandleNullAs elementNulls )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                sub1ArrayNulls ,
                //ComparatorArrayComparator.<T[]>newComparatorArrayComparator(
                //        HandleNullAs.FORBIDDEN ,
                //        subSubArrayNulls ,
                //        ComparableArrayComparator.<T>newComparableArrayComparator(
                //                HandleNullAs.FORBIDDEN ,
                //                elementNulls ) ) );
                new Dim2ComparableArrayComparator<T>(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        sub2ArrayNulls ,
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
                "subSubArrayNulls=" + ( (Dim2ComparableArrayComparator<?>) this.comparator ).arrayNulls + ", " +
                "elementNulls=" + ( (Dim2ComparableArrayComparator<?>) this.comparator ).elementNulls +
                "]";
    }

}
