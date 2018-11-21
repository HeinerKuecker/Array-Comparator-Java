package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link LongArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class LongArrayComparatorTest
{
    /**
     * Test method for {@link LongArrayComparator#LongArrayComparator}.
     */
    @Test
    public void testLongArrayComparator()
    {
        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link LongArrayComparator#LongArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testLongArrayComparator_arrayNulls_is_null()
    {
        new LongArrayComparator(
                // arrayNulls
                null );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final long[] arr1 = { 1 };
        final long[] arr2 = { 1 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_0()
    {
        final long[] arr1 = {};
        final long[] arr2 = { 2 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_1()
    {
        final long[] arr1 = { 1 };
        final long[] arr2 = {};

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final long[] arr1 = { 1 };
        final long[] arr2 = { 2 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final long[] arr1 = { 1 , 2 };
        final long[] arr2 = { 1 , 3 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final long[] arr1 = null;
        final long[] arr2 = { 1 , 3 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final long[] arr1 = { 1 , 2 };
        final long[] arr2 = null;

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final long[] arr1 = { 1 , 2 };
        final long[] arr2 = null;

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final long[] arr1 = null;
        final long[] arr2 = { 1 , 3 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final long[] arr1 = null;
        final long[] arr2 = { 1 , 3 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final long[] arr1 = { 1 , 2 };
        final long[] arr2 = { 1 , 2 , 3 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final long[] arr1 = { 1 , 2 , 3 };
        final long[] arr2 = { 1 , 3 };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link LongArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final long[][] arr = { { 0 , 1 } , { 0 , 0 , 1 } };

        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new long[][]
                        {
                            { 0 , 0 , 1 } ,
                            { 0 , 1 }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link LongArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final LongArrayComparator comparator =
                new LongArrayComparator(
                        Nulls.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "LongArrayComparator[arrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
