package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.prm.dim1.DoubleArrayComparator;

/**
 * {@link Comparator} for two
 * dimensional arrays whose
 * elements are primitive double
 * with throwing
 * {@link NullPointerException}
 * for null arrays:
 *
 * @author Heiner K&uuml;cker
 */
public class NullsForbiddenDim2DoubleArrayComparator
extends ComparatorArrayComparator<double[]>
{
    // TODO singleton

    /**
     * Constructor.
     */
    public NullsForbiddenDim2DoubleArrayComparator()
    {
        super(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
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
                this.getClass().getSimpleName();
    }

}
