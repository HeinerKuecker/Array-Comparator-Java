package de.heinerkuecker.comparator.array.prm.dim4;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim2.Dim2ByteArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim3.Dim3ByteArrayComparator;

/**
 * {@link Comparator} for
 * four-dimensional arrays
 * whose elements are
 * primitive byte.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim4ByteArrayComparator
extends ComparatorArrayComparator<byte[][][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param sub1ArrayNulls Control handling of null sub arrays to sort
     * @param sub2ArrayNulls Control handling of null sub sub arrays to sort
     * @param sub3ArrayNulls Control handling of null sub sub sub arrays to sort
     */
    public Dim4ByteArrayComparator(
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
                new Dim3ByteArrayComparator(
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
                "subSubArrayNulls=" + ( (Dim3ByteArrayComparator) this.comparator ).elementNulls + ", " +
                // TODO Test
                "subSubSubArrayNulls=" + ( (Dim2ByteArrayComparator) ( (Dim3ByteArrayComparator) this.comparator ).comparator ).elementNulls +
                "]";
    }

}
