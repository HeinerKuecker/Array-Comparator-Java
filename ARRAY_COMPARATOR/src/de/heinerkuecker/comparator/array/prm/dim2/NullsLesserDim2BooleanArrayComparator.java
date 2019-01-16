package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.BooleanArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive boolean
 * with handling
 * null arrays
 * as lesser.
 *
 * @author Heiner K&uuml;cker
 */
public class NullsLesserDim2BooleanArrayComparator
extends ComparatorArrayComparator<boolean[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsLesserDim2BooleanArrayComparator()
    {
        super(
                HandleNullAs.LESSER ,
                HandleNullAs.LESSER ,
                new BooleanArrayComparator(
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
