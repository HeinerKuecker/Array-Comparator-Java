package de.heinerkuecker.comparator.array;

import java.util.Comparator;
import java.util.Objects;

/**
 * {@link Comparator} for arrays
 * whose elements are {@link Comparable}.
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
	public final ArrayNulls arrayNulls;

	/**
	 * Control handling of null elements in arrays to sort.
	 */
	public final ElementNulls elementNulls;

	/**
	 * Constructor.
	 * @param arrayNulls Control handling of null arrays to sort
	 * @param elementNulls Control handling of null elements in arrays to sort
	 */
	public ComparableArrayComparator(
			final ArrayNulls arrayNulls ,
			final ElementNulls elementNulls )
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
	 * @see Comparator#compare
	 */
	@Override
    @SuppressWarnings( "incomplete-switch" )
	public int compare(
			final T[] arr1 ,
			final T[] arr2 )
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
            final T o1 = arr1[ index ];
            final T o2 = arr2[ index ];

            final int indexResult;

            switch ( this.elementNulls )
            // handle null elements
            {
                case FIRST :
                {
                    if ( o1 == null )
                    {
                        return ( o2 == null ) ? EQUAL : LESSER;
                    }
                    else if ( o2 == null )
                    {
                        return GREATER;
                    }
                    else
                    {
                        indexResult = o1.compareTo( o2 );
                    }
                    break;
                }

                case LAST :
                {
                    if (o1 == null)
                    {
                        return ( o2 == null ) ? EQUAL : GREATER;
                    }
                    else if ( o2 == null )
                    {
                        return LESSER;
                    }
                    else
                    {
                        indexResult = o1.compareTo( o2 );
                    }
                    break;
                }

                case FORBIDDEN :
                {
                    // Attention, not save for null array elements
                    indexResult = o1.compareTo( o2 );
                    break;
                }

                default:
                    throw new IllegalStateException( "unreachable code" );
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
				"arrayNulls=" + this.arrayNulls + ", " +
				"elementNulls=" + this.elementNulls +
				"]";
	}

}
