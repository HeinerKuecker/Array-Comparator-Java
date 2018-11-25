package de.heinerkuecker.comparator.array.prm.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim2.Dim2ShortArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim3.Dim3ShortArrayComparator;

/**
 * {@link Comparator} for
 * four-dimensional arrays
 * whose elements are
 * primitive short.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim4ShortArrayComparator
extends ComparatorArrayComparator<short[][][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param sub1ArrayNulls Control handling of null sub arrays to sort
     * @param sub2ArrayNulls Control handling of null sub sub arrays to sort
     * @param sub3ArrayNulls Control handling of null sub sub sub arrays to sort
     */
    public Dim4ShortArrayComparator(
            final Nulls arrayNulls ,
            final Nulls sub1ArrayNulls ,
            final Nulls sub2ArrayNulls ,
            final Nulls sub3ArrayNulls )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                sub1ArrayNulls ,
                new Dim3ShortArrayComparator(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        sub2ArrayNulls ,
                        sub3ArrayNulls ) );
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
                "subSubArrayNulls=" + ( (Dim3ShortArrayComparator) this.comparator ).elementNulls + ", " +
                // TODO Test
                "subSubSubArrayNulls=" + ( (Dim2ShortArrayComparator) ( (Dim3ShortArrayComparator) this.comparator ).comparator ).elementNulls +
                "]";
    }

}