package de.heinerkuecker.comparator.array.obj.dim1;

import java.util.Comparator;
import java.util.Objects;

import de.heinerkuecker.comparator.array.HandleNullAs;

/**
 * {@link Comparator} for
 * 1-dimensional arrays
 * whose elements are
 * {@link Comparable}.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class ComparableArrayComparator<T extends Comparable<T>>
implements Comparator<T[]>
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
     * Control handling of null elements in arrays to sort.
     */
    public final HandleNullAs elementNulls;

    /**
     * Constructor.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param elementNulls Control handling of null elements in arrays to sort
     */
    public ComparableArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs elementNulls )
    {
        this.arrayNulls =
                Objects.requireNonNull(
                        arrayNulls ,
                        "arrayNulls" );

        this.elementNulls =
                Objects.requireNonNull(
                        elementNulls ,
                        "elementNulls" );
    }

    /**
     * Factory method.
     *
     * @param arrayNulls Control handling of null arrays to sort
     * @param elementNulls Control handling of null elements in arrays to sort
     * @return new instance
     */
    public static <T extends Comparable<T>> ComparableArrayComparator<T> newComparableArrayComparator(
            final HandleNullAs arrayNulls ,
            final HandleNullAs elementNulls )
    {
        return new ComparableArrayComparator<T>(
                arrayNulls ,
                elementNulls );
    }

    /**
     * @see Comparator#compare
     */
    @Override
    public int compare(
            final T[] arr1 ,
            final T[] arr2 )
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
            final T o1 = arr1[ index ];
            final T o2 = arr2[ index ];

            final int elementResult;

            switch ( this.elementNulls )
            // handle null elements
            {
                case LESSER :
                {
                    if ( o1 == null )
                    {
                        if ( o2 != null )
                        {
                            return LESSER;
                        }
                        elementResult = EQUAL;
                    }
                    else if ( o2 == null )
                    {
                        return GREATER;
                    }
                    else
                    {
                        elementResult = o1.compareTo( o2 );
                    }
                    break;
                }

                case GREATER :
                {
                    if ( o1 == null )
                    {
                        if ( o2 != null )
                        {
                            return GREATER;
                        }
                        elementResult = EQUAL;
                    }
                    else if ( o2 == null )
                    {
                        return LESSER;
                    }
                    else
                    {
                        elementResult = o1.compareTo( o2 );
                    }
                    break;
                }

                case FORBIDDEN :
                {
                    // Attention, not save for null array elements
                    elementResult = o1.compareTo( o2 );
                    break;
                }

                default:
                {
                    throw new IllegalStateException( "unreachable code" );
                }
            }

            if ( elementResult != EQUAL )
            {
                return elementResult;
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
                "arrayNulls=" + this.arrayNulls + ", " +
                "elementNulls=" + this.elementNulls +
                "]";
    }

}
