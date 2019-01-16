package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Comparator;
import java.util.Objects;

import de.heinerkuecker.comparator.array.HandleNullAs;

/**
 * {@link Comparator} for arrays
 * whose elements are primitive double.
 *
 * @author Heiner K&uuml;cker
 */
public class DoubleArrayComparator
implements Comparator<double[]>
{

    /**
     * Result of method {@link #compare} for lesser.
     */
    public static final int LESSER = -1;

    /**
     * Result of method {@link #compare} for greater.
     */
    public static final int GREATER = 1;

    /**
     * Result of method {@link #compare} for equal.
     */
    public static final int EQUAL = 0;

    /**
     * Control handling of null arrays to sort.
     */
    public final HandleNullAs arrayNulls;

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     */
    public DoubleArrayComparator(
            final HandleNullAs arrayNulls )
    {
        this.arrayNulls =
                Objects.requireNonNull(
                        arrayNulls ,
                        "arrayNulls" );
    }

    /**
     * @see Comparator#compare
     */
    @Override
    public int compare(
            final double[] arr1 ,
            final double[] arr2 )
    {
        // handle null arrays
        switch ( this.arrayNulls )
        {
            case LESSER :
            {
                if ( arr1 == null )
                {
                    return ( arr2 == null ) ? EQUAL : LESSER;
                }
                else if ( arr2 == null )
                {
                    return GREATER;
                }
                break;
            }

            case GREATER :
            {
                if ( arr1 == null )
                {
                    return ( arr2 == null ) ? EQUAL : GREATER;
                }
                else if ( arr2 == null )
                {
                    return LESSER;
                }
                break;
            }

            case FORBIDDEN :
            {
                if ( arr1 == null || arr2 == null )
                {
                    throw new NullPointerException();
                }
            }
        }

        if ( arr1 == arr2 )
        {
            return EQUAL;
        }

        final int minArrlength =
                // Attention, not save for null arrays
                Math.min(
                        arr1.length ,
                        arr2.length );

        for ( int index = 0 ; index < minArrlength ; index++ )
        {
            final double value1 = arr1[ index ];
            final double value2 = arr2[ index ];

            final int indexResult;

            if ( value1 < value2 )
            {
                indexResult = LESSER;
            }
            else if ( value1 > value2 )
            {
                indexResult = GREATER;
            }
            else
            {
                indexResult = EQUAL;
            }

            if ( indexResult != EQUAL )
            {
                return indexResult;
            }
        }

        if ( arr1.length != arr2.length )
        {
            if ( arr1.length < arr2.length )
                // the shorter array is lesser
            {
                return LESSER;
            }
            else
            {
                return GREATER;
            }
        }

        return EQUAL;
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
                "arrayNulls=" + this.arrayNulls +
                "]";
    }

}
