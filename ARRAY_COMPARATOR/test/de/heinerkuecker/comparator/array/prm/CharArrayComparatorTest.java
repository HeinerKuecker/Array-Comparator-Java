package de.heinerkuecker.comparator.array.prm;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link CharArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class CharArrayComparatorTest
{
	/**
	 * Test method for {@link CharArrayComparator#CharArrayComparator}.
	 */
	@Test
	public void testCharArrayComparator()
	{
		final CharArrayComparator comparator =
				new CharArrayComparator(
						Nulls.FORBIDDEN );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link CharArrayComparator#CharArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCharArrayComparator_ArrayNulls_is_null()
	{
		new CharArrayComparator(
				// arrayNulls
				null );
	}

	/**
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_1()
	{
		final char[] arr1 = { 'A' };
		final char[] arr2 = { 'B' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final char[] arr1 = { 'A' , 'B' };
		final char[] arr2 = { 'A' , 'C' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final char[] arr1 = null;
		final char[] arr2 = { 'A' , 'C' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final char[] arr1 = { 'A' , 'B' };
		final char[] arr2 = null;

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final char[] arr1 = { 'A' , 'B' };
		final char[] arr2 = null;

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final char[] arr1 = null;
		final char[] arr2 = { 'A' , 'C' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final char[] arr1 = null;
		final char[] arr2 = { 'A' , 'C' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
						Nulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_1()
	{
		final char[] arr1 = { 'A' , 'B' };
		final char[] arr2 = { 'A' , 'B' , 'C' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final char[] arr1 = { 'A' , 'B' , 'C' };
		final char[] arr2 = { 'A' , 'C' };

		final CharArrayComparator comparator =
				new CharArrayComparator(
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
	 * Test method for {@link CharArrayComparator#compare}.
	 */
	@Test
	public void testArraysSort()
	{
		final char[][] arr = { { 'A' , 'B' } , { 'A' , 'A' , 'B' } };

		final CharArrayComparator comparator =
				new CharArrayComparator(
						Nulls.FORBIDDEN );

		Arrays.sort(
				arr ,
				comparator );

		Assert.assertArrayEquals(
				//expecteds
				new char[][]
						{
							{ 'A' , 'A' , 'B' } ,
							{ 'A' , 'B' }
						} ,
				//actuals
				arr );
	}

}
