package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.DoubleArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive double.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2DoubleArrayComparator
extends ComparatorArrayComparator<double[]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param subArrayNulls Control handling of null sub arrays to sort
     */
    public Dim2DoubleArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs subArrayNulls )
    {
        super(
                arrayNulls ,
                subArrayNulls ,
                new DoubleArrayComparator(
                        // null arrays already handled by one level higher
                        HandleNullAs.FORBIDDEN ) );
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
                "subArrayNulls=" + this.elementNulls +
                "]";
    }

}
