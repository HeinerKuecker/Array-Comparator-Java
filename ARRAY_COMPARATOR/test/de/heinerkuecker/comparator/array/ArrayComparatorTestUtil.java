package de.heinerkuecker.comparator.array;

import org.junit.Assert;

/**
 * Util class for unit tests.
 *
 * @author Heiner K&uuml;cker
 */
public class ArrayComparatorTestUtil
{
	/**
	 * Constructor for util class with only static methods.
	 */
	private ArrayComparatorTestUtil()
	{
		super();
	}

	static void assertLesser(
			final int actualCompareResult )
	{
		Assert.assertTrue(
				actualCompareResult < 0 );
	}

	static void assertGreater(
			final int actualCompareResult )
	{
		Assert.assertTrue(
				actualCompareResult > 0 );
	}

	static void assertEqual(
			final int actualCompareResult )
	{
		Assert.assertEquals(
				0 ,
				actualCompareResult );
	}

}
