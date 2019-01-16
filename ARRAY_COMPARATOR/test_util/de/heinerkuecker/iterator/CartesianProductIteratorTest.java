package de.heinerkuecker.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiFunction;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Heiner K&uuml;cker
 */
public class CartesianProductIteratorTest
{
    /**
     * Test method for {@link CartesianProductIterator#CartesianProductIterator(Iterator, Iterable, BiFunction)}.
     */
    @Test
    public void testCartesianProductIterator_Left_Empty()
    {
        final Iterator<String> iterator =
                new CartesianProductIterator<String, String, String>(
                        Arrays.asList( new String[ 0 ] ) ,
                        Arrays.asList( "a" ) ,
                        ( left , right ) -> left + right );

        Assert.assertFalse( iterator.hasNext() );

        //Assert.fail("Not yet implemented");
    }

    /**
     * Test method for {@link CartesianProductIterator#CartesianProductIterator(Iterator, Iterable, BiFunction)}.
     */
    @Test
    public void testCartesianProductIterator_Right_Empty()
    {
        final Iterator<String> iterator =
                new CartesianProductIterator<String, String, String>(
                        Arrays.asList( "1" ) ,
                        Arrays.asList( new String[ 0 ] ) ,
                        ( left , right ) -> left + right );

        Assert.assertFalse( iterator.hasNext() );

        //Assert.fail("Not yet implemented");
    }

    /**
     * Test method for {@link CartesianProductIterator#CartesianProductIterator(Iterator, Iterable, BiFunction)}.
     */
    @Test
    public void testCartesianProductIterator()
    {
        final Iterator<String> iterator =
                new CartesianProductIterator<String, String, String>(
                        Arrays.asList( "1" ,  "2" , "3" ) ,
                        Arrays.asList( "a" ,  "b" , "c" ) ,
                        ( left , right ) -> left + right );

        Assert.assertEquals( "1a" , iterator.next() );
        Assert.assertEquals( "1b" , iterator.next() );
        Assert.assertEquals( "1c" , iterator.next() );

        Assert.assertEquals( "2a" , iterator.next() );
        Assert.assertEquals( "2b" , iterator.next() );
        Assert.assertEquals( "2c" , iterator.next() );

        Assert.assertEquals( "3a" , iterator.next() );
        Assert.assertEquals( "3b" , iterator.next() );
        Assert.assertEquals( "3c" , iterator.next() );

        Assert.assertFalse( iterator.hasNext() );

        //Assert.fail("Not yet implemented");
    }

}
