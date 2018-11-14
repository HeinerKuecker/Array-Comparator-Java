package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;

/**
 * JUnit4 test case for class {@link Dim2ComparatorArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2ComparatorArrayComparatorTest
{
    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test
    public void testDim2ComparableArrayComparator()
    {
        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparableArrayComparator_arrayNulls_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                // arrayNulls
                null ,
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                Comparator.<String>naturalOrder() );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparableArrayComparator_subArrayNulls_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                Nulls.FORBIDDEN ,
                // subArrayNulls
                null ,
                Nulls.FORBIDDEN ,
                Comparator.<String>naturalOrder() );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparableArrayComparator_elementNulls_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                // elementNulls
                null ,
                Comparator.<String>naturalOrder() );
    }


    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testComparableArrayComparator_Comparator_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                // comparator
                null );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final String[][] arr1 = { { "a" } };
        final String[][] arr2 = { { "b" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final String[][] arr1 = { { "a" } , { "b" } };
        final String[][] arr2 = { { "a" } , { "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_2_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_1()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_2()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_FIRST_1()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_FIRST_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LAST_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LAST_2()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_FIRST_1()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_FIRST_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LAST_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LAST_2()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_element_is_null()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , "b" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final String[][] arr1 = { { "a" , "b" , "c" } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
    public void testArraysSort()
    {
        final String[][] arr = { { "a" , "c" } , { "a" , "b" , "c" } };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new String[][]
                        {
                            { "a" , "b" , "c" } ,
                            { "a" , "c" }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertEquals(
                //expected
                "Dim2ComparatorArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=FORBIDDEN, elementNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}