package de.heinerkuecker.comparator.array.prm.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim2.Dim2CharArrayComparator;

/**
 * {@link Comparator} for
 * three-dimensional arrays
 * whose elements are
 * primitive char.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim3CharArrayComparator
extends ComparatorArrayComparator<char[][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param sub1ArrayNulls Control handling of null sub arrays to sort
     * @param sub2ArrayNulls Control handling of null sub sub arrays to sort
     */
    public Dim3CharArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs sub1ArrayNulls ,
            final HandleNullAs sub2ArrayNulls )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                sub1ArrayNulls ,
                new Dim2CharArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ,
                        sub2ArrayNulls ) );
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
                "subSubArrayNulls=" + ( (Dim2CharArrayComparator) this.comparator ).elementNulls +
                "]";
    }

}
