package de.heinerkuecker.comparator.array.prm.dim3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;
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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

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
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#Dim3IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim3IntArrayComparator_subArrayNulls_is_null()
    {
        new Dim3IntArrayComparator(
                Nulls.FORBIDDEN ,
                // subArrayNulls
                null ,
                Nulls.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#Dim3IntArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim3IntArrayComparator_subSubArrayNulls_is_null()
    {
        new Dim3IntArrayComparator(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                // subSubArrayNulls
                null );
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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_1()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = { { { 1 , 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_2()
    {
        final int[][][] arr1 = { { { 1 , 2 } } };
        final int[][][] arr2 = null;

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_1()
    {
        final int[][][] arr1 = { { { 1 , 2 } } };
        final int[][][] arr2 = null;

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_2()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = { { { 1 , 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_FIRST_1()
    {
        final int[][][] arr1 = { { { 1 } } , null };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_FIRST_2()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , null };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LAST_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , null };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LAST_2()
    {
        final int[][][] arr1 = { { { 1 } } , null };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subSubArrayNulls_FIRST_1()
    {
        final int[][][] arr1 = { { { 1 } } , { null } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subSubArrayNulls_FIRST_2()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , { null } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subSubArrayNulls_LAST_1()
    {
        final int[][][] arr1 = { { { 1 } } , { { 2 } } };
        final int[][][] arr2 = { { { 1 } } , { null } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.LAST );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subSubArrayNulls_LAST_2()
    {
        final int[][][] arr1 = { { { 1 } } , { null } };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.LAST );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final int[][][] arr1 = null;
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim3IntArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null()
    {
        final int[][][] arr1 = { null };
        final int[][][] arr2 = { { { 1 } } , { { 3 } } };

        final Dim3IntArrayComparator comparator =
                new Dim3IntArrayComparator(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesser(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertGreater(
                comparator.compare(
                        arr2 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr1 ) );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr2 ,
                        arr2 ) );
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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

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
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

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
                        Nulls.FIRST ,
                        Nulls.LAST ,
                        Nulls.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "Dim3IntArrayComparator[arrayNulls=FIRST, subArrayNulls=LAST, subSubArrayNulls=FORBIDDEN]" ,
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
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Nulls.FIRST );

        Assert.assertEquals(
                //expected
                "Dim3IntArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=LAST, subSubArrayNulls=FIRST]" ,
                //actual
                comparator.toString() );
    }

}
