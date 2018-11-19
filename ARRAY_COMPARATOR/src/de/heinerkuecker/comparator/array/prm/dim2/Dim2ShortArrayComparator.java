package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.ShortArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive short.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2ShortArrayComparator
extends ComparatorArrayComparator<short[]>
{

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param subArrayNulls Control handling of null sub arrays to sort
     */
    public Dim2ShortArrayComparator(
            final Nulls arrayNulls ,
            final Nulls subArrayNulls )
    {
        super(
                arrayNulls ,
                subArrayNulls ,
                new ShortArrayComparator(
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
