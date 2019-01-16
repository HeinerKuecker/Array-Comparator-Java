package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.HandleNullAs;

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
                        HandleNullAs.FORBIDDEN );

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
    public void testCompare_Equal_but_not_self_false()
    {
        final boolean[] arr1 = { false };
        final boolean[] arr2 = { false };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_Equal_but_not_self_true()
    {
        final boolean[] arr1 = { true };
        final boolean[] arr2 = { true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Lesser()
    {
        final boolean[] arr1 = {};
        final boolean[] arr2 = { true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_notEmptyArray_Greater()
    {
        final boolean[] arr1 = { false };
        final boolean[] arr2 = {};

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_EmptyArray_Equal()
    {
        final boolean[] arr1 = {};
        final boolean[] arr2 = {};

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertEqualAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_1()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_LESSER_2()
    {
        final boolean[] arr1 = { false , true };
        final boolean[] arr2 = null;

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.LESSER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_1()
    {
        final boolean[] arr1 = { false , true };
        final boolean[] arr2 = null;

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test
    public void testCompare_arrayNulls_GREATER_2()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.GREATER );

        ArrayComparatorTestUtil.assertGreaterAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_0()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = { false , true };

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_1()
    {
        final boolean[] arr1 = { false , true };
        final boolean[] arr2 = null;

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

        comparator.compare(
                arr1 ,
                arr2 );
    }

    /**
     * Test method for {@link BooleanArrayComparator#compare}.
     */
    @Test( expected = NullPointerException.class )
    public void testCompare_Negative_Array_is_null_2()
    {
        final boolean[] arr1 = null;
        final boolean[] arr2 = null;

        final BooleanArrayComparator comparator =
                new BooleanArrayComparator(
                        HandleNullAs.FORBIDDEN );

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
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN );

        ArrayComparatorTestUtil.assertLesserAndViceVersa(
                comparator ,
                arr1 ,
                arr2 );
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
                        HandleNullAs.FORBIDDEN );

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
                        HandleNullAs.FORBIDDEN );

        Assert.assertEquals(
                //expected
                "BooleanArrayComparator[arrayNulls=FORBIDDEN]" ,
                //actual
                comparator.toString() );
    }

}
