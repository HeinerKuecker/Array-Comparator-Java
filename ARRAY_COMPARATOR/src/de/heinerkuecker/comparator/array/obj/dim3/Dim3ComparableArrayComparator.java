package de.heinerkuecker.comparator.array.obj.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for two dimensional
 * arrays whose elements are {@link Comparable}.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim3ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][]>
{

	/**
	 * Constructor.
	 *
	 * @param arrayNulls Control handling of null arrays to sort
	 * @param subArrayNulls Control handling of null sub arrays to sort
	 * @param subSubArrayNulls Control handling of null sub sub arrays to sort
	 * @param elementNulls Control handling of null elements in arrays to sort
	 */
	public Dim3ComparableArrayComparator(
			final Nulls arrayNulls ,
			final Nulls subArrayNulls ,
			final Nulls subSubArrayNulls ,
			final Nulls elementNulls )
	{
		// TODO test
		// TODO null handling params correct???
		super(
				arrayNulls ,
				subArrayNulls ,
				ComparatorArrayComparator.<T[]>newComparatorArrayComparator(
						Nulls.FORBIDDEN ,
						subSubArrayNulls ,
						ComparableArrayComparator.<T>newComparableArrayComparator(
								Nulls.FORBIDDEN ,
								elementNulls ) ) );
	}

}