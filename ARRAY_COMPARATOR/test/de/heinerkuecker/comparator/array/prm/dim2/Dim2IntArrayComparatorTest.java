package de.heinerkuecker.comparator.array.prm.dim2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;

/**
 * JUnit4 test case for class {@link Dim2IntArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2IntArrayComparatorTest
{
    /**
     * Test method for {@link Dim2IntArrayComparator#Dim2IntArrayComparator}.
     */
    @Test
    public void testDim2IntArrayComparator()
    {
        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#Dim2IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2IntArrayComparator_arrayNulls_is_null()
    {
        new Dim2IntArrayComparator(
                // arrayNulls
                null ,
                Nulls.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#Dim2IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2IntArrayComparator_subArrayNulls_is_null()
    {
        new Dim2IntArrayComparator(
                Nulls.FORBIDDEN ,
                // subArrayNulls
                null );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final int[][] arr1 = { { 1 } };
        final int[][] arr2 = { { 1 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final int[][] arr1 = {};
        final int[][] arr2 = { { 2 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final int[][] arr1 = { { 1 } };
        final int[][] arr2 = {};

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Equal()
    {
        final int[][] arr1 = {};
        final int[][] arr2 = {};

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final int[][] arr1 = { { 1 } };
        final int[][] arr2 = { { 2 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final int[][] arr1 = { { 1 } , { 2 } };
        final int[][] arr2 = { { 1 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_3()
    {
        final int[][] arr1 = { { 1 , 2 } };
        final int[][] arr2 = { { 1 , 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = { { 1 , 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.LESSER ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final int[][] arr1 = { { 1 , 2 } };
        final int[][] arr2 = null;

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.LESSER ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final int[][] arr1 = { { 1 , 2 } };
        final int[][] arr2 = null;

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.GREATER ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = { { 1 , 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.GREATER ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }


    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LESSER_1()
    {
        final int[][] arr1 = { { 1 } , null };
        final int[][] arr2 = { { 1 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LESSER_2()
    {
        final int[][] arr1 = { { 1 } , { 2 } };
        final int[][] arr2 = { { 1 } , null };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_GREATER_1()
    {
        final int[][] arr1 = { { 1 } , { 2 } };
        final int[][] arr2 = { { 1 } , null };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_GREATER_2()
    {
        final int[][] arr1 = { { 1 } , null };
        final int[][] arr2 = { { 1 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = { { 1 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final int[][] arr1 = { { 1 } };
        final int[][] arr2 = null;

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = null;

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_0()
    {
        final int[][] arr1 = { null };
        final int[][] arr2 = { { 1 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_1()
    {
        final int[][] arr1 = { { 1 } };
        final int[][] arr2 = { null };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_2()
    {
        final int[][] arr1 = { null };
        final int[][] arr2 = { null };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final int[][] arr1 = { { 1 } , { 2 } };
        final int[][] arr2 = { { 1 } , { 2 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final int[][] arr1 = { { 1 } , { 2 } , { 3 } };
        final int[][] arr2 = { { 1 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final int[][][] arr =
            {
                { { 1 , 2 } , { 1 , 1 , 2 } } ,
                { { 0 , 1 } , { 0 , 0 , 1 } }
            };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new int[][][]
                        {
                            { { 0 , 1 } , { 0 , 0 , 1 } } ,
                            { { 1 , 2 } , { 1 , 1 , 2 } }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#toString}.
     */
    @Test
    public void testToString_0()
    {
        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "Dim2IntArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#toString}.
     */
    @Test
    public void testToString_1()
    {
        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.LESSER ,
                        Nulls.GREATER );

        Assert.assertEquals(
                //expected
                "Dim2IntArrayComparator[arrayNulls=LESSER, subArrayNulls=GREATER]" ,
                //actual
                comparator.toString() );
    }

}
