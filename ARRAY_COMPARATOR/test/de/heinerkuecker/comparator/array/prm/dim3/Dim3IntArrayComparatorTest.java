package de.heinerkuecker.comparator.array.prm.dim3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;

/**
 * JUnit4 test case for class {@link Dim3IntArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim3IntArrayComparatorTest
{
    /**
     * Test method for {@link Dim3IntArrayComparator#Dim3IntArrayComparator}.
     */
    @Test
    public void testDim3IntArrayComparator()
    {
        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#Dim3IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim3IntArrayComparator_arrayNulls_is_null()
    {
        new Dim3IntArrayComparator(
                // arrayNulls
                null ,
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#Dim3IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim3IntArrayComparator_sub1ArrayNulls_is_null()
    {
        new Dim3IntArrayComparator(
                HandleNullAs.FORBIDDEN ,
                // sub1ArrayNulls
                null ,
                HandleNullAs.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#Dim3IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim3IntArrayComparator_sub2ArrayNulls_is_null()
    {
        new Dim3IntArrayComparator(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                // sub2ArrayNulls
                null );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final int[][][] arr1 = { { { 1 } } };
        final int[][][] arr2 = { { { 1 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final int[][][] arr1 = {};
        final int[][][] arr2 = { { { 2 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final int[][][] arr1 = { { { 1 } } };
        final int[][][] arr2 = {};

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Equal()
    {
        final int[][][] arr1 = {};
        final int[][][] arr2 = {};

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final int[][][] arr1 = { { { 1 } } };
        final int[][][] arr2 = { { { 2 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_3()
    {
        final int[][][] arr1 = { { { 1 , 2 } } };
        final int[][][] arr2 = { { { 1 , 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = { { { 1 , 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final int[][][] arr1 = { { { 1 , 2 } } };
        final int[][][] arr2 = null;

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final int[][][] arr1 = { { { 1 , 2 } } };
        final int[][][] arr2 = null;

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = { { { 1 , 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub1ArrayNulls_LESSER_1()
    {
        final int[][][] arr1 = { { { 1 } } , null };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub1ArrayNulls_LESSER_2()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , null };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub1ArrayNulls_GREATER_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , null };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub1ArrayNulls_GREATER_2()
    {
        final int[][][] arr1 = { { { 1 } } , null };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub2ArrayNulls_LESSER_1()
    {
        final int[][][] arr1 = { { { 1 } } , { null } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub2ArrayNulls_LESSER_2()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , { null } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub2ArrayNulls_GREATER_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , { null } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_sub2ArrayNulls_GREATER_2()
    {
        final int[][][] arr1 = { { { 1 } } , { null } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = { { { 1 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final int[][][] arr1 = { { { 1 } } };
        final int[][][] arr2 = null;

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = null;

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_sub1Array_is_null_0()
    {
        final int[][][] arr1 = { null };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_sub1Array_is_null_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { null };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_sub1Array_is_null_2()
    {
        final int[][][] arr1 = { null };
        final int[][][] arr2 = { null };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_sub2Array_is_null_0()
    {
        final int[][][] arr1 = { { null } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_sub2Array_is_null_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { null } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_sub2Array_is_null_2()
    {
        final int[][][] arr1 = { { null } };
        final int[][][] arr2 = { { null } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.GREATER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , { { 2 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } , { { 3 } } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final int[][][][] arr =
            {
                { { { 1 } , { 2 } } , { { 1 , 1 , 2 } } } ,
                { { { 0 } , { 1 } } , { { 0 , 0 , 1 } } }
            };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new int[][][][]
                        {
                            { { { 0 } , { 1 } } , { { 0 , 0 , 1 } } } ,
                            { { { 1 } , { 2 } } , { { 1 , 1 , 2 } } }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#toString}.
     */
    @Test
    public void testToString_0()
    {
        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "Dim3IntArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=FORBIDDEN, subSubArrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#toString}.
     */
    @Test
    public void testToString_1()
    {
        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.LESSER ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "Dim3IntArrayComparator[arrayNulls=LESSER, subArrayNulls=GREATER, subSubArrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#toString}.
     */
    @Test
    public void testToString_2()
    {
        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.LESSER );

        Assert.assertEquals(
                //expected
                "Dim3IntArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=GREATER, subSubArrayNulls=LESSER]" ,
                //actual
                comparator.toString() );
    }

}
