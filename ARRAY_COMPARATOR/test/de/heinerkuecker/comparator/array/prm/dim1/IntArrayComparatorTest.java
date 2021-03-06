package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.HandleNullAs;

/**
 * JUnit4 test case for class {@link IntArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class IntArrayComparatorTest
{
    /**
     * Test method for {@link IntArrayComparator#IntArrayComparator}.
     */
    @Test
    public void testIntArrayComparator()
    {
        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link IntArrayComparator#IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testIntArrayComparator_arrayNulls_is_null()
    {
        new IntArrayComparator(
                // arrayNulls
                null );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final int[] arr1 = { 1 };
        final int[] arr2 = { 1 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final int[] arr1 = {};
        final int[] arr2 = { 2 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final int[] arr1 = { 1 };
        final int[] arr2 = {};

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Equal()
    {
        final int[] arr1 = {};
        final int[] arr2 = {};

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final int[] arr1 = { 1 };
        final int[] arr2 = { 2 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final int[] arr1 = { 1 , 2 };
        final int[] arr2 = { 1 , 3 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final int[] arr1 = null;
        final int[] arr2 = { 1 , 3 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final int[] arr1 = { 1 , 2 };
        final int[] arr2 = null;

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final int[] arr1 = { 1 , 2 };
        final int[] arr2 = null;

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final int[] arr1 = null;
        final int[] arr2 = { 1 , 3 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final int[] arr1 = null;
        final int[] arr2 = { 1 , 3 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final int[] arr1 = { 1 , 2 };
        final int[] arr2 = null;

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final int[] arr1 = null;
        final int[] arr2 = null;

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final int[] arr1 = { 1 , 2 };
        final int[] arr2 = { 1 , 2 , 3 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final int[] arr1 = { 1 , 2 , 3 };
        final int[] arr2 = { 1 , 3 };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link IntArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final int[][] arr = { { 0 , 1 } , { 0 , 0 , 1 } };

        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new int[][]
                        {
                            { 0 , 0 , 1 } ,
                            { 0 , 1 }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link IntArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final IntArrayComparator comparator =
                new IntArrayComparator(
                        HandleNullAs.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "IntArrayComparator[arrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
