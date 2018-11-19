package de.heinerkuecker.comparator.array.prm.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim2.Dim2BooleanArrayComparator;

/**
 * {@link Comparator} for
 * three-dimensional arrays
 * whose elements are
 * primitive boolean.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim3BooleanArrayComparator
extends ComparatorArrayComparator<boolean[][]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param subArrayNulls Control handling of null sub arrays to sort
     * @param subSubArrayNulls Control handling of null sub sub arrays to sort
     */
    public Dim3BooleanArrayComparator(
            final Nulls arrayNulls ,
            final Nulls subArrayNulls ,
            final Nulls subSubArrayNulls )
    {
        // TODO test
        // TODO null handling params correct???
        super(
                arrayNulls ,
                subArrayNulls ,
                new Dim2BooleanArrayComparator(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ,
                        subSubArrayNulls ) );
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
                "subSubArrayNulls=" + ( (Dim2BooleanArrayComparator) this.comparator ).elementNulls +
                "]";
    }

}