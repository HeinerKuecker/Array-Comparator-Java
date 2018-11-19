package de.heinerkuecker.combinator;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 test case for {@link Combinator}.
 *
 * @author Heiner K&uuml;cker
 */
public class CombinatorTest
{

    /**
     * Test method for {@link Combinator#Combinator(java.util.List)}.
     */
    @Test( expected = NullPointerException.class )
    public void testCombinator_null_Param()
    {
        new Combinator<>( null );
    }

    /**
     * Test method for {@link Combinator#iterator()}.
     */
    @Test
    public void testIterator_0()
    {
        // expected: []
        final Combinator<Object> combinator =
                new Combinator<>(
                        Collections.emptyList() );

        //for (final Iterable<?> combination : combinator )
        //{
        //    System.out.println( combination );
        //}
        //System.out.println();

        assertIterableSize(
                (int) Math.pow(
                        2 ,
                        0 ) ,
                combinator );

        assertCombinationsUniqueness(
                combinator );

        final Iterator<Iterable<Object>> combinatorIterator =
                combinator.iterator();

        Assert.assertTrue(
                combinatorIterator.hasNext() );

        final Iterable<Object> actual = combinatorIterator.next();

        assertIterableIsEmpty(
                actual );

        Assert.assertFalse(
                combinatorIterator.hasNext() );
    }

    /**
     * Test method for {@link Combinator#iterator()}.
     */
    @Test
    public void testIterator_1()
    {
        // expected: [], [1]
        final Combinator<Integer> combinator =
                new Combinator<>(
                        Arrays.asList(
                                1 ) );

        //for (final Iterable<?> combination : combinator )
        //{
        //    System.out.println( combination );
        //}
        //System.out.println();

        assertIterableSize(
                (int) Math.pow(
                        2 ,
                        1 ) ,
                combinator );

        assertCombinationsUniqueness(
                combinator );

        final Iterator<Iterable<Integer>> combinatorIterator =
                combinator.iterator();

        {
            final Iterable<Integer> actual0 =
                    combinatorIterator.next();

            assertIterableIsEmpty(
                    actual0 );
        }

        {
            final Iterable<Integer> actual1 =
                    combinatorIterator.next();

            // Assert one element iterable
            assertIterableSize(
                    1 ,
                    actual1 );

            final Integer actual1Element = actual1.iterator().next();

            Assert.assertEquals(
                    //expected
                    1 ,
                    //actual
                    actual1Element.intValue() );
        }

        Assert.assertFalse(
                combinatorIterator.hasNext() );
    }

    /**
     * Test method for {@link Combinator#iterator()}.
     */
    @Test
    public void testIterator_2()
    {
        // expected: [], [1], [2], [1, 2]
        final Combinator<Integer> combinator =
                new Combinator<>(
                        Arrays.asList(
                                1 ,
                                2 ) );

        //for (final Iterable<?> combination : combinator )
        //{
        //    System.out.println( combination );
        //}
        //System.out.println();

        assertIterableSize(
                (int) Math.pow(
                        2 ,
                        2 ) ,
                combinator );

        assertCombinationsUniqueness(
                combinator );
    }

    /**
     * Test method for {@link Combinator#iterator()}.
     */
    @Test
    public void testIterator_3()
    {
        // expected: [], [1], [2], [3], [1, 2], [1, 3], [1, 2, 3], [2, 3]
        final Combinator<Integer> combinator =
                new Combinator<>(
                        Arrays.asList(
                                1 ,
                                2 ,
                                3 ) );

        //for (final Iterable<?> combination : combinator )
        //{
        //    System.out.println( combination );
        //}
        //System.out.println();

        assertIterableSize(
                (int) Math.pow(
                        2 ,
                        3 ) ,
                combinator );

        assertCombinationsUniqueness(
                combinator );
    }

    /**
     * Test method for {@link Combinator#iterator()}.
     */
    @Test
    public void testIterator_4()
    {
        // TODO expected: [], [1], [2], [3], [1, 2], [1, 3], [1, 2, 3], [2, 3]
        final Combinator<Integer> combinator =
                new Combinator<>(
                        Arrays.asList(
                                1 ,
                                2 ,
                                3 ,
                                4 ) );

        //for (final Iterable<?> combination : combinator )
        //{
        //    System.out.println( combination );
        //}
        //System.out.println();

        assertIterableSize(
                (int) Math.pow(
                        2 ,
                        4 ) ,
                combinator );

        assertCombinationsUniqueness(
                combinator );
    }

    /**
     * Test method for {@link Combinator#iterator()}.
     */
    @Test
    public void testIterator_5()
    {
        // TODO expected: [], [1], [2], [3], [1, 2], [1, 3], [1, 2, 3], [2, 3]
        final Combinator<Integer> combinator =
                new Combinator<>(
                        Arrays.asList(
                                1 ,
                                2 ,
                                3 ,
                                4 ,
                                5 ) );

        //for (final Iterable<?> combination : combinator )
        //{
        //    System.out.println( combination );
        //}
        //System.out.println();

        assertIterableSize(
                (int) Math.pow(
                        2 ,
                        5 ) ,
                combinator );

        assertCombinationsUniqueness(
                combinator );
    }

    private void assertIterableIsEmpty(
            final Iterable<?> actual )
    {
        Assert.assertFalse(
                actual.iterator().hasNext() );
    }

    private void assertIterableSize(
            final int expected ,
            final Iterable<?> actualIterable )
    {
        int actual = 0;

        final Iterator<?> actualIterator = actualIterable.iterator();

        while ( actualIterator.hasNext() )
        {
            actualIterator.next();
            actual++;
        }

        Assert.assertEquals(
                expected ,
                actual );
    }

    private <T> Set<T> iterableToSetWithAssertUniquness(
            final Iterable<? extends T> actualIterable )
    {
        final Set<T> result = new HashSet<>();

        int elementCount = 0;

        for ( final T actualElement : actualIterable )
        {
            result.add( actualElement );

            elementCount++;

            // assert uniqueness of elements to add
            Assert.assertEquals(
                    //expected
                    elementCount ,
                    //actual
                    result.size() );
        }

        return result;
    }

    private <T> void assertCombinationsUniqueness(
            final Iterable<? extends Iterable<? extends T>> actualCombinations )
    {
        final Set<Set<T>> result = new HashSet<>();

        int combinationCount = 0;

        for ( final Iterable<? extends T> actualCombination : actualCombinations )
        {
            result.add(
                    iterableToSetWithAssertUniquness(
                            actualCombination ) );

            combinationCount++;

            // assert uniqueness of combinations
            Assert.assertEquals(
                    //expected
                    combinationCount ,
                    //actual
                    result.size() );
        }
    }

}
