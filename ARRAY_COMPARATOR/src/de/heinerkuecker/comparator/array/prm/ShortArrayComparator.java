package de.heinerkuecker.comparator.array.prm;

import java.util.Comparator;
import java.util.Objects;

import de.heinerkuecker.comparator.array.ArrayNulls;

/**
 * {@link Comparator} for arrays
 * whose elements are primitive short.
 *
 * @author Heiner K&uuml;cker
 */
public class ShortArrayComparator
implements Comparator<short[]>
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
	 * Constructor.
	 *
	 * @param arrayNulls Control handling of null arrays to sort
	 */
	public ShortArrayComparator(
			final ArrayNulls arrayNulls )
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
			final short[] arr1 ,
			final short[] arr2 )
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
            final short value1 = arr1[ index ];
            final short value2 = arr2[ index ];

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
				"arrayNulls=" + this.arrayNulls + ", " +
				"]";
	}

}
