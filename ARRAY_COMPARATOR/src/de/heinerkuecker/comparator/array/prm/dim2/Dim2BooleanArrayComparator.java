package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.BooleanArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive boolean.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2BooleanArrayComparator
extends ComparatorArrayComparator<boolean[]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param subArrayNulls Control handling of null sub arrays to sort
     */
    public Dim2BooleanArrayComparator(
            final Nulls arrayNulls ,
            final Nulls subArrayNulls )
    {
        super(
                arrayNulls ,
                subArrayNulls ,
                new BooleanArrayComparator(
                        // null arrays already handled by one level higher
                        Nulls.FORBIDDEN ) );
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
