package de.heinerkuecker.comparator.array.mlt;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import de.heinerkuecker.comparator.array.ArrayComparatorTestUtil;
import de.heinerkuecker.comparator.array.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.Nulls;

/**
 * JUnit4 test case for class {@link Dim2ComparableArrayComparator}.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim2ComparableArrayComparatorTest
{
	/**
	 * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
	 */
	@Test
	public void testDim2ComparableArrayComparator()
	{
		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

		Assert.assertNotNull(
				comparator );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testDim2ComparableArrayComparator_arrayNulls_is_null()
	{
		new Dim2ComparableArrayComparator<>(
				// arrayNulls
				null ,
				Nulls.FORBIDDEN ,
				Nulls.FORBIDDEN );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testDim2ComparableArrayComparator_subArrayNulls_is_null()
	{
		new Dim2ComparableArrayComparator<>(
				Nulls.FORBIDDEN ,
				// subArrayNulls
				null ,
				Nulls.FORBIDDEN );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#Dim2ComparableArrayComparator}.
	 */
	@Test( expected = NullPointerException.class )
	public void testDim2ComparableArrayComparator_elementNulls_is_null()
	{
		new Dim2ComparableArrayComparator<>(
				Nulls.FORBIDDEN ,
				Nulls.FORBIDDEN ,
				// elementNulls
				null );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_1()
	{
		final String[][] arr1 = { { "a" } };
		final String[][] arr2 = { { "b" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2()
	{
		final String[][] arr1 = { { "a" } , { "b" } };
		final String[][] arr2 = { { "a" } , { "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_2_1()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_1()
	{
		final String[][] arr1 = null;
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FIRST ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_FIRST_2()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = null;

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FIRST ,
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_1()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = null;

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.LAST ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ArrayNulls_LAST_2()
	{
		final String[][] arr1 = null;
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.LAST ,
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_subArrayNulls_FIRST_1()
	{
		final String[][] arr1 = { null };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FIRST ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_subArrayNulls_FIRST_2()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = { null };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FIRST ,
						Nulls.FORBIDDEN );

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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_subArrayNulls_LAST_1()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = { null };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.LAST ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_subArrayNulls_LAST_2()
	{
		final String[][] arr1 = { null };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.LAST ,
						Nulls.FORBIDDEN );

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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_FIRST_1()
	{
		final String[][] arr1 = { { "a" , null } };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_FIRST_2()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = { { "a" , null } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_LAST_1()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = { { "a" , null } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_ElementNulls_LAST_2()
	{
		final String[][] arr1 = { { "a" , null } };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_is_null()
	{
		final String[][] arr1 = null;
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_subArray_is_null()
	{
		final String[][] arr1 = null;
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test( expected = NullPointerException.class )
	public void testCompare_Negative_Array_element_is_null()
	{
		final String[][] arr1 = { { "a" , null } };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

		comparator.compare(
				arr1 ,
				arr2 );
	}

	/**
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_1()
	{
		final String[][] arr1 = { { "a" , "b" } };
		final String[][] arr2 = { { "a" , "b" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link Dim2ComparableArrayComparator#compare}.
	 */
	@Test
	public void testCompare_Different_array_length_2()
	{
		final String[][] arr1 = { { "a" , "b" , "c" } };
		final String[][] arr2 = { { "a" , "c" } };

		final Dim2ComparableArrayComparator<String> comparator =
				new Dim2ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN ,
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
	 * Test method for {@link ComparableArrayComparator#compare}.
	 */
	@Test
	public void testArraysSort()
	{
		final String[][] arr = { { "a" , "c" } , { "a" , "b" , "c" } };

		final ComparableArrayComparator<String> comparator =
				new ComparableArrayComparator<>(
						Nulls.FORBIDDEN ,
						Nulls.FORBIDDEN );

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

}
