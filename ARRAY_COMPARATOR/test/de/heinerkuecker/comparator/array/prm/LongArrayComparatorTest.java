package de.heinerkuecker.comparator.array.prm;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.ArrayNulls;

/**
 * JUnit4 test case for class {@link LongArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class LongArrayComparatorTest
{
	/**
	 * Test method for {@link LongArrayComparator#LongArrayComparator}.
	 */
	@Test
	public void testComparableArrayComparator()
	{
		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FORBIDDEN );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link LongArrayComparator#LongArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testComparableArrayComparator_ArrayNulls_is_null()
	{
		new LongArrayComparator(
				// arrayNulls
				null );
	}

	/**
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_1()
	{
		final long[] arr1 = { 1 };
		final long[] arr2 = { 2 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FORBIDDEN );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final long[] arr1 = { 1 , 2 };
		final long[] arr2 = { 1 , 3 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FORBIDDEN );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final long[] arr1 = null;
		final long[] arr2 = { 1 , 3 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FIRST );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final long[] arr1 = { 1 , 2 };
		final long[] arr2 = null;

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FIRST );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final long[] arr1 = { 1 , 2 };
		final long[] arr2 = null;

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.LAST );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final long[] arr1 = null;
		final long[] arr2 = { 1 , 3 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.LAST );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final long[] arr1 = null;
		final long[] arr2 = { 1 , 3 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_1()
	{
		final long[] arr1 = { 1 , 2 };
		final long[] arr2 = { 1 , 2 , 3 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FORBIDDEN );

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
	 * Test method for {@link LongArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final long[] arr1 = { 1 , 2 , 3 };
		final long[] arr2 = { 1 , 3 };

		final LongArrayComparator comparator =
				new LongArrayComparator(
						ArrayNulls.FORBIDDEN );

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

}
