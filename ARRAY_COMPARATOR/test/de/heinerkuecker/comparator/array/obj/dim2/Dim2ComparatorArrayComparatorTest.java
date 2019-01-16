package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.HandleNullAs;
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
    public void testDim2ComparatorArrayComparator()
    {
        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparatorArrayComparator_arrayNulls_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                // arrayNulls
                null ,
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                Comparator.<String>naturalOrder() );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparatorArrayComparator_subArrayNulls_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                HandleNullAs.FORBIDDEN ,
                // subArrayNulls
                null ,
                HandleNullAs.FORBIDDEN ,
                Comparator.<String>naturalOrder() );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#Dim2ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparatorArrayComparator_elementNulls_is_null()
    {
        new Dim2ComparatorArrayComparator<>(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
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
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                // comparator
                null );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final String[][] arr1 = { { "a" } };
        final String[][] arr2 = { { "a" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final String[][] arr1 = {};
        final String[][] arr2 = { { "b" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final String[][] arr1 = { { "a" } };
        final String[][] arr2 = {};

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Equal()
    {
        final String[][] arr1 = {};
        final String[][] arr2 = {};

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LESSER_1()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LESSER_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_GREATER_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_GREATER_2()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LESSER_1()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LESSER_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_GREATER_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_GREATER_2()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final String[][] arr1 = { { "a" , "c" } };
        final String[][] arr2 = null;

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = null;

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_0()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_2()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { null };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_0()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
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
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

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
    public void testToString_0()
    {
        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertEquals(
                //expected
                "Dim2ComparatorArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=FORBIDDEN, elementNulls=FORBIDDEN, comparator=INSTANCE]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#toString}.
     */
    @Test
    public void testToString_1()
    {
        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.GREATER ,
                        Comparator.<String>naturalOrder() );

        Assert.assertEquals(
                //expected
                "Dim2ComparatorArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=LESSER, elementNulls=GREATER, comparator=INSTANCE]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim2ComparatorArrayComparator#toString}.
     */
    @Test
    public void testToString_2()
    {
        final Dim2ComparatorArrayComparator<String> comparator =
                new Dim2ComparatorArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertEquals(
                //expected
                "Dim2ComparatorArrayComparator[arrayNulls=LESSER, subArrayNulls=GREATER, elementNulls=FORBIDDEN, comparator=INSTANCE]" ,
                //actual
                comparator.toString() );
    }

}
