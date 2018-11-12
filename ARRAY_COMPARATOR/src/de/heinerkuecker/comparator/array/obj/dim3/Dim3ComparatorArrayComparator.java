package de.heinerkuecker.comparator.array.obj.dim3;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for three dimensional
 * with an dedicated {@link Comparator}
 * for array elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim3ComparatorArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[][]>
{

	/**
	 * Constructor.
	 *
	 * @param arrayNulls Control handling of null arrays to sort
	 * @param subArrayNulls Control handling of null sub arrays to sort
	 * @param subSubArrayNulls Control handling of null sub sub arrays to sort
	 * @param elementNulls Control handling of null elements in arrays to sort
	 * @param comparator Comparator to compare array elements
	 */
	public Dim3ComparatorArrayComparator(
			final Nulls arrayNulls ,
			final Nulls subArrayNulls ,
			final Nulls subSubArrayNulls ,
			final Nulls elementNulls ,
			final Comparator<? super T> comparator )
	{
		// TODO test
		// TODO null handling params correct???
		super(
				arrayNulls ,
				subArrayNulls ,
				ComparatorArrayComparator.<T[]>newComparatorArrayComparator(
						Nulls.FORBIDDEN ,
						subSubArrayNulls ,
						ComparatorArrayComparator.<T>newComparatorArrayComparator(
								Nulls.FORBIDDEN ,
								elementNulls ,
								comparator ) ) );
	}

}
