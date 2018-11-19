package de.heinerkuecker.comparator.array.obj.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim2.Dim2ComparableArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim3.Dim3ComparableArrayComparator;

/**
 * {@link Comparator} for
 * four-dimensional arrays
 * whose elements are
 * {@link Comparable}.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim4ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param subArrayNulls Control handling of null sub arrays to sort
     * @param subSubArrayNulls Control handling of null sub sub arrays to sort
     * @param subSubSubArrayNulls Control handling of null sub sub sub arrays to sort
     * @param elementNulls Control handling of null elements in arrays to sort
     */
    public Dim4ComparableArrayComparator(
            final Nulls arrayNulls ,
            final Nulls subArrayNulls ,
            final Nulls subSubArrayNulls ,
            final Nulls subSubSubArrayNulls ,
            final Nulls elementNulls )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                subArrayNulls ,
                new Dim3ComparableArrayComparator<T>(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        subSubArrayNulls ,
                        subSubSubArrayNulls ,
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
                "subSubArrayNulls=" + ( (Dim3ComparableArrayComparator<?>) this.comparator ).elementNulls +
                "subSubSubArrayNulls=" + ( (Dim2ComparableArrayComparator<?>) ( (Dim3ComparableArrayComparator<?>) this.comparator ).comparator ).elementNulls +
                "]";
    }

}
