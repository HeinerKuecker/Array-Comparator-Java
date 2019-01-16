package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.IntArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive int
 * with handling
 * null arrays
 * as greater.
 *
 * @author Heiner K&uuml;cker
 */
public class NullsGreaterDim2IntArrayComparator
extends ComparatorArrayComparator<int[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsGreaterDim2IntArrayComparator()
    {
        super(
                HandleNullAs.GREATER ,
                HandleNullAs.GREATER ,
                new IntArrayComparator(
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
                this.getClass().getSimpleName();
    }

}
