package de.heinerkuecker.comparator.array.obj.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link ComparableArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class ComparableArrayComparatorTest
{
    /**
     * Test method for {@link ComparableArrayComparator#ComparableArrayComparator}.
     */
    @Test
    public void testComparableArrayComparator()
    {
        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link ComparableArrayComparator#ComparableArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testComparableArrayComparator_arrayNulls_is_null()
    {
        new ComparableArrayComparator<>(
                // arrayNulls
                null ,
                Nulls.FORBIDDEN );
    }

    /**
     * Test method for {@link ComparableArrayComparator#ComparableArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testComparableArrayComparator_elementNulls_is_null()
    {
        new ComparableArrayComparator<>(
                Nulls.FORBIDDEN ,
                // elementNulls
                null );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final String[] arr1 = { "a" };
        final String[] arr2 = { "a" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final String[] arr1 = {};
        final String[] arr2 = { "b" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final String[] arr1 = { "a" };
        final String[] arr2 = {};

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
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
    public void testCompare_EmptyArray_Equal()
    {
        final String[] arr1 = {};
        final String[] arr2 = {};

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final String[] arr1 = { "a" };
        final String[] arr2 = { "b" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final String[] arr1 = null;
        final String[] arr2 = { "a" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.LESSER ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = null;

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.LESSER ,
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
    public void testCompare_arrayNulls_GREATER_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = null;

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.GREATER ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final String[] arr1 = null;
        final String[] arr2 = { "a" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_LESSER_0_0()
    {
        final String[] arr1 = { null , "a" };
        final String[] arr2 = { null , "b" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_LESSER_1_0()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , "b" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_LESSER_1_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_LESSER_2()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_GREATER_0_0()
    {
        final String[] arr1 = { null , "a" };
        final String[] arr2 = { null , "b" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_GREATER_0_1()
    {
        final String[] arr1 = { null , "b" };
        final String[] arr2 = { null , "a" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_GREATER_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
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
    public void testCompare_elementNulls_GREATER_2()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , "b" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final String[] arr1 = null;
        final String[] arr2 = { "a" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = null;

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final String[] arr1 = null;
        final String[] arr2 = null;

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LESSER );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_0()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.LESSER ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.LESSER ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Element_is_null_2()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , null };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.LESSER ,
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , "b" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparableArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final String[] arr1 = { "a" , "b" , "c" };
        final String[] arr2 = { "a" , "c" };

        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

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
     * Test method for {@link ComparableArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final ComparableArrayComparator<String> comparator =
                new ComparableArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "ComparableArrayComparator[arrayNulls=FORBIDDEN, elementNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
