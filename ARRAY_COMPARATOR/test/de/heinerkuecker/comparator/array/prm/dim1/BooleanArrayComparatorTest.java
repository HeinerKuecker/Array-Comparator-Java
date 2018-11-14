package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link BooleanArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class BooleanArrayComparatorTest
{
    /**
     * Test method for {@link BooleanArrayComparator#BooleanArrayComparator}.
     */
    @Test
    public void testBooleanArrayComparator()
    {
        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        Nulls.FORBIDDEN );

        Assert.assertNotNull(
                comparator );
    }

    /**
     * Test method for {@link BooleanArrayComparator#BooleanArrayComparator}.
     */
    @Test( expected = NullPointerException.class )
    public void testBooleanArrayComparator_arrayNulls_is_null()
    {
        new BooleanArrayComparator(
                // arrayNulls
                null );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_0()
    {
        final boolean[] arr1 = { false };
        final boolean[] arr2 = { false };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_0_1()
    {
        final boolean[] arr1 = { true };
        final boolean[] arr2 = { true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        Nulls.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqual(
                comparator.compare(
                        arr1 ,
                        arr2 ) );

        ArrayComparatorTestUtil.assertEqual(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_1()
    {
        final boolean[] arr1 = { false };
        final boolean[] arr2 = { true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_2()
    {
        final boolean[] arr1 = { false , false };
        final boolean[] arr2 = { false , true  };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_1()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_FIRST_2()
    {
        final boolean[] arr1 = { false , true };
        final boolean[] arr2 = null;

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_1()
    {
        final boolean[] arr1 = { false , true };
        final boolean[] arr2 = null;

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LAST_2()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        Nulls.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_1()
    {
        final boolean[] arr1 = { false , true };
        final boolean[] arr2 = { false , true , false };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_Different_array_length_2()
    {
        final boolean[] arr1 = { false , false , true };
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
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
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testArraysSort()
    {
        final boolean[][] arr = { { false , true } , { false , false , true } };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        Nulls.FORBIDDEN );

        Arrays.sort(
                arr ,
                comparator );

        Assert.assertArrayEquals(
                //expecteds
                new boolean[][]
                        {
                            { false , false , true } ,
                            { false , true }
                        } ,
                //actuals
                arr );
    }

    /**
     * Test method for {@link BooleanArrayComparator#toString}.
     */
    @Test
    public void testToString()
    {
        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        Nulls.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "BooleanArrayComparator[arrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
