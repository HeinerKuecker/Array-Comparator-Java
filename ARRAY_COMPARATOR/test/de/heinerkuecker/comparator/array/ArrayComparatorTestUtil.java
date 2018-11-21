package de.heinerkuecker.comparator.array;

import java.util.Comparator;

import org.junit.Assert;

/**
 * Util class for unit tests.
 *
 * @author Heiner K&uuml;cker
 */
public class ArrayComparatorTestUtil
{
    /**
     * Constructor for util class with only static methods.
     */
    private ArrayComparatorTestUtil()
    {
        super();
    }

    public static void assertLesser(
            final int actualCompareResult )
    {
        Assert.assertTrue(
                actualCompareResult < 0 );
    }

    public static void assertGreater(
            final int actualCompareResult )
    {
        Assert.assertTrue(
                actualCompareResult > 0 );
    }

    public static void assertEqual(
            final int actualCompareResult )
    {
        Assert.assertEquals(
                0 ,
                actualCompareResult );
    }

    public static <T> void assertEqualAndViceVersa(
            final Comparator<T> comparator ,
            final T o1 ,
            final T o2 )
    {
        assertEqual(
                comparator.compare(
                        o1 ,
                        o2 ) );

        assertEqual(
                comparator.compare(
                        o2 ,
                        o1 ) );

        assertEqual(
                comparator.compare(
                        o1 ,
                        o1 ) );

        assertEqual(
                comparator.compare(
                        o2 ,
                        o2 ) );
    }

    public static <T> void assertLesserAndViceVersa(
            final Comparator<T> comparator ,
            final T o1 ,
            final T o2 )
    {
        assertLesser(
                comparator.compare(
                        o1 ,
                        o2 ) );

        assertGreater(
                comparator.compare(
                        o2 ,
                        o1 ) );

        assertEqual(
                comparator.compare(
                        o1 ,
                        o1 ) );

        assertEqual(
                comparator.compare(
                        o2 ,
                        o2 ) );
    }

    public static <T> void assertGreaterAndViceVersa(
            final Comparator<T> comparator ,
            final T o1 ,
            final T o2 )
    {
        assertLesserAndViceVersa(
                comparator ,
                o2 ,
                o1 );
    }

}
