package de.heinerkuecker.comparator.array;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayNulls;
import de.heinerkuecker.comparator.array.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.ElementNulls;

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
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link ComparableArrayComparator#ComparableArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testComparableArrayComparator_ArrayNulls_is_null()
	{
		new ComparableArrayComparator<>(
				// arrayNulls
				null ,
				ElementNulls.FORBIDDEN );
	}

	/**
	 * Test method for {@link ComparableArrayComparator#ComparableArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testComparableArrayComparator_ElementNulls_is_null()
	{
		new ComparableArrayComparator<>(
				ArrayNulls.FORBIDDEN ,
				// elementNulls
				null );
	}

	/**
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_1()
	{
		final String[] arr1 = new String[] { "a" };
		final String[] arr2 = new String[] { "b" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final String[] arr1 = new String[] { "a" , "b" };
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final String[] arr1 = null;
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FIRST ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final String[] arr1 = new String[] { "a" , "b" };
		final String[] arr2 = null;

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FIRST ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final String[] arr1 = new String[] { "a" , "b" };
		final String[] arr2 = null;

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.LAST ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final String[] arr1 = null;
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.LAST ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_FIRST_1()
	{
		final String[] arr1 = new String[] { "a" , null };
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FIRST );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_FIRST_2()
	{
		final String[] arr1 = new String[] { "a" , "b" };
		final String[] arr2 = new String[] { "a" , null };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FIRST );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_LAST_1()
	{
		final String[] arr1 = new String[] { "a" , "b" };
		final String[] arr2 = new String[] { "a" , null };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.LAST );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_LAST_2()
	{
		final String[] arr1 = new String[] { "a" , null };
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.LAST );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final String[] arr1 = null;
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_element_is_null()
	{
		final String[] arr1 = new String[] { "a" , null };
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

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
		final String[] arr1 = new String[] { "a" , "b" };
		final String[] arr2 = new String[] { "a" , "b" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final String[] arr1 = new String[] { "a" , "b" , "c" };
		final String[] arr2 = new String[] { "a" , "c" };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN );

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