package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.HandleNullAs;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;

/**
 * JUnit4 test case for class {@link Dim2ComparableArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2ComparableArrayComparatorTest
{
    /**
     * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
     */
    @Test
    public void testDim2ComparableArrayComparator()
    {
        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparableArrayComparator_arrayNulls_is_null()
    {
        new Dim2ComparableArrayComparator<>(
                // arrayNulls
                null ,
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparableArrayComparator_subArrayNulls_is_null()
    {
        new Dim2ComparableArrayComparator<>(
                HandleNullAs.FORBIDDEN ,
                // subArrayNulls
                null ,
                HandleNullAs.FORBIDDEN );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testDim2ComparableArrayComparator_elementNulls_is_null()
    {
        new Dim2ComparableArrayComparator<>(
                HandleNullAs.FORBIDDEN ,
                HandleNullAs.FORBIDDEN ,
                // elementNulls
                null );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final String[][] arr1 = { { "a" } };
        final String[][] arr2 = { { "a" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final String[][] arr1 = {};
        final String[][] arr2 = { { "b" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final String[][] arr1 = { { "a" } };
        final String[][] arr2 = {};

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Equal()
    {
        final String[][] arr1 = {};
        final String[][] arr2 = {};

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final String[][] arr1 = { { "a" } };
        final String[][] arr2 = { { "b" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final String[][] arr1 = { { "a" } , { "b" } };
        final String[][] arr2 = { { "a" } , { "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_2_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LESSER_1()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_LESSER_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_GREATER_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_subArrayNulls_GREATER_2()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LESSER_1()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LESSER_2()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_GREATER_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_GREATER_2()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = null;

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final String[][] arr1 = null;
        final String[][] arr2 = null;

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_0()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { null };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_subArray_is_null_2()
    {
        final String[][] arr1 = { null };
        final String[][] arr2 = { null };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_0()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_2()
    {
        final String[][] arr1 = { { "a" , null } };
        final String[][] arr2 = { { "a" , null } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final String[][] arr1 = { { "a" , "b" } };
        final String[][] arr2 = { { "a" , "b" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final String[][] arr1 = { { "a" , "b" , "c" } };
        final String[][] arr2 = { { "a" , "c" } };

        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
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
     * Test method for {@link Dim2ComparableArrayComparator#toString}.
     */
    @Test
    public void testToString_0()
    {
        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "Dim2ComparableArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=FORBIDDEN, elementNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#toString}.
     */
    @Test
    public void testToString_1()
    {
        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.FORBIDDEN ,
                        HandleNullAs.LESSER ,
                        HandleNullAs.GREATER );

        Assert.assertEquals(
                //expected
                "Dim2ComparableArrayComparator[arrayNulls=FORBIDDEN, subArrayNulls=LESSER, elementNulls=GREATER]" ,
                //actual
                comparator.toString() );
    }

    /**
     * Test method for {@link Dim2ComparableArrayComparator#toString}.
     */
    @Test
    public void testToString_2()
    {
        final Dim2ComparableArrayComparator<String> comparator =
                new Dim2ComparableArrayComparator<>(
                        HandleNullAs.LESSER ,
                        HandleNullAs.GREATER ,
                        HandleNullAs.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "Dim2ComparableArrayComparator[arrayNulls=LESSER, subArrayNulls=GREATER, elementNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
