package de.heinerkuecker.comparator.array.prm.mlt;

import java.util.Comparator;

import de.heinerkuecker.comparator.array.Nulls;
import de.heinerkuecker.comparator.array.obj.ComparatorArrayComparator;

/**
 * {@link Comparator} for three
 * dimensional arrays whose
 * elements are primitive int.
 *
 * @author Heiner K&uuml;cker
 */
public class Dim3IntArrayComparator
extends ComparatorArrayComparator<int[][]>
{

	/**
	 * Constructor.
	 *
	 * @param arrayNulls Control handling of null arrays to sort
	 * @param subArrayNulls Control handling of null sub arrays to sort
	 * @param subSubArrayNulls Control handling of null sub sub arrays to sort
	 * @param elementNulls Control handling of null elements in arrays to sort
	 */
	public Dim3IntArrayComparator(
			final Nulls arrayNulls ,
			final Nulls subArrayNulls ,
			final Nulls subSubArrayNulls )
	{
		// TODO test
		// TODO null handling params correct???
		super(
				arrayNulls ,
				subArrayNulls ,
				new Dim2IntArrayComparator(
						Nulls.FORBIDDEN ,
						subSubArrayNulls ) );
	}

}
