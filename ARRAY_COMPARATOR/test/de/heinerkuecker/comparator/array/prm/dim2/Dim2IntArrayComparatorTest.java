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
    public void testDim2IntArrayComparator_elementNulls_is_null()
    {
        new Dim2IntArrayComparator(
                Nulls.FORBIDDEN ,
                // elementNulls
                null );
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
    public void testCompare_arrayNulls_FIRST_1()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = { { 1 , 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FIRST ,
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
    public void testCompare_arrayNulls_FIRST_2()
    {
        final int[][] arr1 = { { 1 , 2 } };
        final int[][] arr2 = null;

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FIRST ,
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
    public void testCompare_arrayNulls_LAST_1()
    {
        final int[][] arr1 = { { 1 , 2 } };
        final int[][] arr2 = null;

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.LAST ,
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
    public void testCompare_arrayNulls_LAST_2()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = { { 1 , 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.LAST ,
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
    public void testCompare_subArrayNulls_FIRST_1()
    {
        final int[][] arr1 = { { 1 } , null };
        final int[][] arr2 = { { 1 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_FIRST_2()
    {
        final int[][] arr1 = { { 1 } , { 2 } };
        final int[][] arr2 = { { 1 } , null };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LAST_1()
    {
        final int[][] arr1 = { { 1 } , { 2 } };
        final int[][] arr2 = { { 1 } , null };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LAST_2()
    {
        final int[][] arr1 = { { 1 } , null };
        final int[][] arr2 = { { 1 } , { 3 } };

        final Dim2IntArrayComparator comparator =
                new Dim2IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final int[][] arr1 = null;
        final int[][] arr2 = { { 1 } , { 3 } };

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
    public void testCompare_Negative_subArray_is_null()
    {
        final int[][] arr1 = { null };
        final int[][] arr2 = { { 1 } , { 3 } };

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
                        Nulls.FIRST ,
                        Nulls.LAST );

        Assert.assertEquals(
                //expected
                "Dim2IntArrayComparator[arrayNulls=FIRST, subArrayNulls=LAST]" ,
                //actual
                comparator.toString() );
    }

}
