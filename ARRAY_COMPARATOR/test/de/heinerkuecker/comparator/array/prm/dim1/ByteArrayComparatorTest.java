package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link ByteArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class ByteArrayComparatorTest
{
    /**
     * Test method for {@link ByteArrayComparator#ByteArrayComparator}.
     */
    @Test
    public void testByteArrayComparator()
    {
        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link ByteArrayComparator#ByteArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testByteArrayComparator_arrayNulls_is_null()
    {
        new ByteArrayComparator(
                // arrayNulls
                null );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self()
    {
        final byte[] arr1 = { 1 };
        final byte[] arr2 = { 1 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_0()
    {
        final byte[] arr1 = {};
        final byte[] arr2 = { 2 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_1()
    {
        final byte[] arr1 = { 1 };
        final byte[] arr2 = {};

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final byte[] arr1 = { 1 };
        final byte[] arr2 = { 2 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final byte[] arr1 = { 1 , 2 };
        final byte[] arr2 = { 1 , 3 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final byte[] arr1 = null;
        final byte[] arr2 = { 1 , 3 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final byte[] arr1 = { 1 , 2 };
        final byte[] arr2 = null;

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final byte[] arr1 = { 1 , 2 };
        final byte[] arr2 = null;

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final byte[] arr1 = null;
        final byte[] arr2 = { 1 , 3 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final byte[] arr1 = null;
        final byte[] arr2 = { 1 , 3 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final byte[] arr1 = { 1 , 2 };
        final byte[] arr2 = { 1 , 2 , 3 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final byte[] arr1 = { 1 , 2 , 3 };
        final byte[] arr2 = { 1 , 3 };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link ByteArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final byte[][] arr = { { 0 , 1 } , { 0 , 0 , 1 } };

        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new byte[][]
                        {
                            { 0 , 0 , 1 } ,
                            { 0 , 1 }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link ByteArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final ByteArrayComparator comparator =
                new ByteArrayComparator(
                        Nulls.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "ByteArrayComparator[arrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
