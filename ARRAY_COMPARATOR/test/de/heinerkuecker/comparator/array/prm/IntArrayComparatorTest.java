package de.heinerkuecker.comparator.array.prm;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.ArrayNulls;

/**
 * JUnit4 test case for class {@link IntArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class IntArrayComparatorTest
{
	/**
	 * Test method for {@link IntArrayComparator#IntArrayComparator}.
	 */
	@Test
	public void testComparableArrayComparator()
	{
		final IntArrayComparator comparator =
				new IntArrayComparator(
						ArrayNulls.FORBIDDEN );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link IntArrayComparator#IntArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testComparableArrayComparator_ArrayNulls_is_null()
	{
		new IntArrayComparator(
				// arrayNulls
				null );
	}

	/**
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_1()
	{
		final int[] arr1 = { 1 };
		final int[] arr2 = { 2 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final int[] arr1 = { 1 , 2 };
		final int[] arr2 = { 1 , 3 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final int[] arr1 = null;
		final int[] arr2 = { 1 , 3 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final int[] arr1 = { 1 , 2 };
		final int[] arr2 = null;

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final int[] arr1 = { 1 , 2 };
		final int[] arr2 = null;

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final int[] arr1 = null;
		final int[] arr2 = { 1 , 3 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final int[] arr1 = null;
		final int[] arr2 = { 1 , 3 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
						ArrayNulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_1()
	{
		final int[] arr1 = { 1 , 2 };
		final int[] arr2 = { 1 , 2 , 3 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
	 * Test method for {@link IntArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final int[] arr1 = { 1 , 2 , 3 };
		final int[] arr2 = { 1 , 3 };

		final IntArrayComparator comparator =
				new IntArrayComparator(
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
