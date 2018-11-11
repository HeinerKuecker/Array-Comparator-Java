package de.heinerkuecker.comparator.array;

/**
 * {@link Enum} to control
 * handling of null elements
 * in arrays to sort.
 *
 * @author Heiner K&uuml;cker
 */
public enum ElementNulls
{
	/**
	 * Order null elements first.
	 */
    FIRST ,

	/**
	 * Order null elements last.
	 */
    LAST ,

    /**
     * Null elements forbidden,
     * an {@link NullPointerException}
     * will will be throwed.
     */
    FORBIDDEN;
}
