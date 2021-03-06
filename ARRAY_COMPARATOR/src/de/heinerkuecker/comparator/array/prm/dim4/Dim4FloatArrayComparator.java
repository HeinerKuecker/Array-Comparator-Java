package de.heinerkuecker.comparator.array.prm.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim2.Dim2FloatArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim3.Dim3FloatArrayComparator;

/**
 * {@link Comparator} for
 * four-dimensional arrays
 * whose elements are
 * primitive float.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim4FloatArrayComparator
extends ComparatorArrayComparator<float[][][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param sub1ArrayNulls Control handling of null sub arrays to sort
     * @param sub2ArrayNulls Control handling of null sub sub arrays to sort
     * @param sub3ArrayNulls Control handling of null sub sub sub arrays to sort
     */
    public Dim4FloatArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs sub1ArrayNulls ,
            final HandleNullAs sub2ArrayNulls ,
            final HandleNullAs sub3ArrayNulls )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                sub1ArrayNulls ,
                new Dim3FloatArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
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
                "subSubArrayNulls=" + ( (Dim3FloatArrayComparator) this.comparator ).elementNulls + ", " +
                // TODO Test
                "subSubSubArrayNulls=" + ( (Dim2FloatArrayComparator) ( (Dim3FloatArrayComparator) this.comparator ).comparator ).elementNulls +
                "]";
    }

}
