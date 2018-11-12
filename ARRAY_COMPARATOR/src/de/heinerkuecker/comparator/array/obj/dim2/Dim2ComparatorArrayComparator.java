package de.heinerkuecker.comparator.array.obj.dim2;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.dim1.ComparatorArrayComparator;

/**
 * {@link Comparator} for two dimensional
 * with an dedicated {@link Comparator}
 * for array elements.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim2ComparatorArrayComparator<T>
extends ComparatorArrayComparator<T[]>
{

	/**
	 * Constructor.
	 *
	 * @param arrayNulls Control handling of null arrays to sort
	 * @param subArrayNulls Control handling of null sub arrays to sort
	 * @param elementNulls Control handling of null elements in arrays to sort
	 * @param comparator Comparator to compare array elements
	 */
	public Dim2ComparatorArrayComparator(
			final Nulls arrayNulls ,
			final Nulls subArrayNulls ,
			final Nulls elementNulls ,
			final Comparator<? super T> comparator )
	{
		super(
				arrayNulls ,
				subArrayNulls ,
				ComparatorArrayComparator.<T>newComparatorArrayComparator(
						Nulls.FORBIDDEN ,
						elementNulls ,
						comparator ) );
	}

}
