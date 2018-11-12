package de.heinerkuecker.comparator.array.prm.dim1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.prm.dim1.ShortArrayComparator;

/**
 * JUnit4 test case for class {@link ShortArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class ShortArrayComparatorTest
{
	/**
	 * Test method for {@link ShortArrayComparator#ShortArrayComparator}.
	 */
	@Test
	public void testShortArrayComparator()
	{
		final ShortArrayComparator comparator =
				new ShortArrayComparator(
						Nulls.FORBIDDEN );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link ShortArrayComparator#ShortArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testShortArrayComparator_ArrayNulls_is_null()
	{
		new ShortArrayComparator(
				// arrayNulls
				null );
	}

	/**
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_1()
	{
		final short[] arr1 = { 1 };
		final short[] arr2 = { 2 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final short[] arr1 = { 1 , 2 };
		final short[] arr2 = { 1 , 3 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final short[] arr1 = null;
		final short[] arr2 = { 1 , 3 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final short[] arr1 = { 1 , 2 };
		final short[] arr2 = null;

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final short[] arr1 = { 1 , 2 };
		final short[] arr2 = null;

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final short[] arr1 = null;
		final short[] arr2 = { 1 , 3 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final short[] arr1 = null;
		final short[] arr2 = { 1 , 3 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
						Nulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_1()
	{
		final short[] arr1 = { 1 , 2 };
		final short[] arr2 = { 1 , 2 , 3 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final short[] arr1 = { 1 , 2 , 3 };
		final short[] arr2 = { 1 , 3 };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
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
	 * Test method for {@link ShortArrayComparator#compare}.
	 */
	@Test
	public void testArraysSort()
	{
		final short[][] arr = { { 0 , 1 } , { 0 , 0 , 1 } };

		final ShortArrayComparator comparator =
				new ShortArrayComparator(
						Nulls.FORBIDDEN );

		Arrays.sort(
				arr ,
				comparator );

		Assert.assertArrayEquals(
				//expecteds
				new short[][]
						{
							{ 0 , 0 , 1 } ,
							{ 0 , 1 }
						} ,
				//actuals
				arr );
	}

}
