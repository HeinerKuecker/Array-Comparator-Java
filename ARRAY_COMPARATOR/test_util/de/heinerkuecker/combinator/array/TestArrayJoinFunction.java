package de.heinerkuecker.combinator.array;

import java.util.function.BiFunction;

import de.heinerkuecker.util.array.ArrayDeepClone;

/**
 * {@link BiFunction} to generate
 * test data for comparators.
 */
public class TestArrayJoinFunction
implements BiFunction</*LEFT*/Object[], /*RIGHT*/Object[], /*RESULT*/Object[]>
{

    /**
     * @see BiFunction#apply(java.lang.Object, java.lang.Object)
     */
    @Override
    public Object[] apply(
            final Object[] left ,
            final Object[] right )
    {
        if ( left == null )
        {
            return null;
        }

        if ( left.length == 0 )
        {
            return left;
        }

        final Object[] leftClone =
                ArrayDeepClone.deepClone(
                        left );

        for ( int i = 0 ; i < leftClone.length ; i++ )
        {
            leftClone[ i ] =
                    ArrayDeepClone.deepClone(
                            right );
        }

        return leftClone;
    }

}
