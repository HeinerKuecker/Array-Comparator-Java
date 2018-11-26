package de.heinerkuecker.combinator.array;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.heinerkuecker.iterator.CartesianProductIterable;
import de.heinerkuecker.util.array.ArrayDeepToString;

/**
 * JUnit4 test case for {@link TestArrayJoinFunction}.
 *
 * @author Heiner K&uuml;cker
 */
public class TestArrayJoinFunctionTest
{

    /**
     * Test method for {@link TestArrayJoinFunction#apply(java.lang.Object[], java.lang.Object[])}.
     */
    @Test
    public void testApply()
    {
        final TestArrayJoinFunction f = new TestArrayJoinFunction();

        final List<Object[]> left =
                Arrays.asList(
                        null ,
                        new Object[ 0 ] ,
                        new Object[] { null } ,
                        new Object[] { null , null } );

        final List<Object[]> right =
                Arrays.asList(
                        null ,
                        new Object[ 0 ] ,
                        new Object[] { null } ,
                        new Object[] { "a" } ,
                        new Object[] { "b" } );

        final CartesianProductIterable<Object[], Object[], Object[]> cartesian =
                new CartesianProductIterable<>(
                        left ,
                        right ,
                        f );

        for ( final Object[] combination : cartesian )
        {
            System.out.println(
                    ArrayDeepToString.deepToString(
                            combination ) );
        }
    }

}
