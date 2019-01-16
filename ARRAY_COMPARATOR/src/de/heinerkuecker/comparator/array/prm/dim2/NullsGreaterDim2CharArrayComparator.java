package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.CharArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive char
 * with handling
 * null arrays
 * as greater.
 *
 * @author Heiner K&uuml;cker
 */
public class NullsGreaterDim2CharArrayComparator
extends ComparatorArrayComparator<char[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsGreaterDim2CharArrayComparator()
    {
        super(
                HandleNullAs.GREATER ,
                HandleNullAs.GREATER ,
                new CharArrayComparator(
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
