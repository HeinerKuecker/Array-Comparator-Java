package de.heinerkuecker.comparator.array.obj.mlt;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.ComparableArrayComparator;
import de.heinerkuecker.comparator.array.obj.ComparatorArrayComparator;

/**
 * {@link Comparator} for two dimensional
 * arrays whose elements are {@link Comparable}.
 *
 * @param <T> Element type of arrays to compare
 * @author Heiner K&uuml;cker
 */
public class Dim2ComparableArrayComparator<T extends Comparable<T>>
extends ComparatorArrayComparator<T[]>
{

	/**
	 * Constructor.
	 *
	 * @param arrayNulls Control handling of null arrays to sort
	 * @param subArrayNulls Control handling of null sub arrays to sort
	 * @param elementNulls Control handling of null elements in arrays to sort
	 */
	public Dim2ComparableArrayComparator(
			final Nulls arrayNulls ,
			final Nulls subArrayNulls ,
			final Nulls elementNulls )
	{
		super(
				arrayNulls ,
				subArrayNulls ,
				ComparableArrayComparator.<T>newComparableArrayComparator(
						Nulls.FORBIDDEN ,
						elementNulls ) );
	}

}
