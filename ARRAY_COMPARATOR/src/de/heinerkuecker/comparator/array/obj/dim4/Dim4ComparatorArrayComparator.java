package de.heinerkuecker.comparator.array.obj.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim2.Dim2ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim3.Dim3ComparatorArrayComparator;

/**
 * {@link Comparator} for
 * 4-dimensional arrays
 * with an dedicated
 * {@link Comparator} for
 * array elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim4ComparatorArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param sub1ArrayNulls Control handling of null sub arrays to sort
     * @param sub2ArrayNulls Control handling of null sub sub arrays to sort
     * @param sub3ArrayNulls Control handling of null sub sub sub arrays to sort
     * @param elementNulls Control handling of null elements in arrays to sort
     * @param comparator Comparator to compare array elements
     */
    public Dim4ComparatorArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs sub1ArrayNulls ,
            final HandleNullAs sub2ArrayNulls ,
            final HandleNullAs sub3ArrayNulls ,
            final HandleNullAs elementNulls ,
            final Comparator<? super T> comparator )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                sub1ArrayNulls ,
                new Dim3ComparatorArrayComparator<T>(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        sub2ArrayNulls ,
                        sub3ArrayNulls ,
                        elementNulls ,
                        comparator ) );
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
                "subSubArrayNulls=" + ( (Dim3ComparatorArrayComparator<?>) this.comparator ).arrayNulls + ", " +
                "subSubSubArrayNulls=" + ( (Dim2ComparatorArrayComparator<?>) ( (Dim3ComparatorArrayComparator<?>) this.comparator ).comparator ).arrayNulls + ", " +
                "elementNulls=" + ( (ComparatorArrayComparator<?>) ( (Dim2ComparatorArrayComparator<?>) ( (Dim3ComparatorArrayComparator<?>) this.comparator ).comparator ).comparator ).elementNulls + ", " +
                "comparator=" + ( (ComparatorArrayComparator<?>) ( (Dim2ComparatorArrayComparator<?>) ( (Dim3ComparatorArrayComparator<?>) this.comparator ).comparator ).comparator ).comparator + ", " +
                "]";
    }

}
