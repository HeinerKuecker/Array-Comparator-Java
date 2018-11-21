package de.heinerkuecker.comparator.array.obj.dim1;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link ComparatorArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class ComparatorArrayComparatorTest
{
    /**
     * Test method for {@link ComparatorArrayComparator#ComparatorArrayComparator}.
     */
    @Test
    public void testComparableArrayComparator()
    {
        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testComparableArrayComparator_arrayNulls_is_null()
    {
        new ComparatorArrayComparator<>(
                // arrayNulls
                null ,
                Nulls.FORBIDDEN ,
                Comparator.<String>naturalOrder() );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testComparableArrayComparator_elementNulls_is_null()
    {
        new ComparatorArrayComparator<>(
                Nulls.FORBIDDEN ,
                // elementNulls
                null ,
                Comparator.<String>naturalOrder() );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#ComparatorArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testComparableArrayComparator_Comparator_is_null()
    {
        new ComparatorArrayComparator<>(
                Nulls.FORBIDDEN ,
                Nulls.FORBIDDEN ,
                // comparator
                null );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final String[] arr1 = { "a" };
        final String[] arr2 = { "a" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_0()
    {
        final String[] arr1 = {};
        final String[] arr2 = { "b" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_1()
    {
        final String[] arr1 = { "a" };
        final String[] arr2 = {};

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final String[] arr1 = { "a" };
        final String[] arr2 = { "b" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_1()
    {
        final String[] arr1 = null;
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_2()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = null;

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FIRST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = null;

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_2()
    {
        final String[] arr1 = null;
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.LAST ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_FIRST_0_0()
    {
        final String[] arr1 = { null , "a" };
        final String[] arr2 = { null , "b" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_FIRST_1_0()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_FIRST_1_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_FIRST_2()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FIRST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LAST_0_0()
    {
        final String[] arr1 = { null , "a" };
        final String[] arr2 = { null , "b" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LAST_0_1()
    {
        final String[] arr1 = { null , "b" };
        final String[] arr2 = { null , "a" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LAST_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , null };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_elementNulls_LAST_2()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.LAST ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final String[] arr1 = null;
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_element_is_null()
    {
        final String[] arr1 = { "a" , null };
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final String[] arr1 = { "a" , "b" };
        final String[] arr2 = { "a" , "b" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final String[] arr1 = { "a" , "b" , "c" };
        final String[] arr2 = { "a" , "c" };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ComparatorArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final String[][] arr = { { "a" , "c" } , { "a" , "b" , "c" } };

        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

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
     * Test method for {@link ComparatorArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final ComparatorArrayComparator<String> comparator =
                new ComparatorArrayComparator<>(
                        Nulls.FORBIDDEN ,
                        Nulls.FORBIDDEN ,
                        Comparator.<String>naturalOrder() );

        Assert.assertEquals(
                //expected
                "ComparatorArrayComparator[arrayNulls=FORBIDDEN, elementNulls=FORBIDDEN, comparator=INSTANCE]" ,
                //actual
                comparator.toString() );
    }

}
