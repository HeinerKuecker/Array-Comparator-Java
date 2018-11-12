package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Comparator;
import java.util.Objects;

import de.heinerkuecker.comparator.array.Nulls;

/**
 * {@link Comparator} for arrays
 * whose elements are primitive boolean.
 *
 * False is lesser than true.
 *
 * @author Heiner K&uuml;cker
 */
public class BooleanArrayComparator
implements Comparator<boolean[]>
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
    public final Nulls arrayNulls;

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     */
    public BooleanArrayComparator(
            final Nulls arrayNulls )
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
    @SuppressWarnings( "incomplete-switch" )
    public int compare(
            final boolean[] arr1 ,
            final boolean[] arr2 )
    {
        // handle null arrays
        switch ( this.arrayNulls )
        {
            case FIRST :
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

            case LAST :
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
            final boolean value1 = arr1[ index ];
            final boolean value2 = arr2[ index ];

            final int indexResult;

            if ( ( ! value1 ) && value2 )
                // false is lesser than true
            {
                indexResult = LESSER;
            }
            else if ( value1 && ( ! value2 ) )
                // true is greater than false
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
