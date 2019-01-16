package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.FloatArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive float
 * with throwing
 * {@link NullPointerException}
 * for null arrays:
 *
 * @author Heiner K&uuml;cker
 */
public class NullsForbiddenDim2FloatArrayComparator
extends ComparatorArrayComparator<float[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsForbiddenDim2FloatArrayComparator()
    {
        super(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                new FloatArrayComparator(
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
