package de.heinerkuecker.comparator.array;

import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayNulls;
import de.heinerkuecker.comparator.array.ComparatorArrayComparator;
import de.heinerkuecker.comparator.array.ElementNulls;

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
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link ComparatorArrayComparator#ComparatorArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testComparableArrayComparator_ArrayNulls_is_null()
	{
		new ComparatorArrayComparator<>(
				// arrayNulls
				null ,
				ElementNulls.FORBIDDEN ,
				Comparator.<String>naturalOrder() );
	}

	/**
	 * Test method for {@link ComparatorArrayComparator#ComparatorArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testComparableArrayComparator_ElementNulls_is_null()
	{
		new ComparatorArrayComparator<>(
				ArrayNulls.FORBIDDEN ,
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
				ArrayNulls.FORBIDDEN ,
				ElementNulls.FORBIDDEN ,
				// comparator
				null );
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
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final String[] arr1 = { "a" , "b" };
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final String[] arr1 = null;
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FIRST ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final String[] arr1 = { "a" , "b" };
		final String[] arr2 = null;

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FIRST ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final String[] arr1 = { "a" , "b" };
		final String[] arr2 = null;

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.LAST ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final String[] arr1 = null;
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.LAST ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_FIRST_1()
	{
		final String[] arr1 = { "a" , null };
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FIRST ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_FIRST_2()
	{
		final String[] arr1 = { "a" , "b" };
		final String[] arr2 = { "a" , null };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FIRST ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_LAST_1()
	{
		final String[] arr1 = { "a" , "b" };
		final String[] arr2 = { "a" , null };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.LAST ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_LAST_2()
	{
		final String[] arr1 = { "a" , null };
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.LAST ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final String[] arr1 = null;
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
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
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
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
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
	 * Test method for {@link ComparatorArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final String[] arr1 = { "a" , "b" , "c" };
		final String[] arr2 = { "a" , "c" };

		final ComparatorArrayComparator<String> comparator =
				new ComparatorArrayComparator<>(
						ArrayNulls.FORBIDDEN ,
						ElementNulls.FORBIDDEN ,
						Comparator.<String>naturalOrder() );

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
