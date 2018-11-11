package de.heinerkuecker.comparator.array;

/**
 * {@link Enum} to control
 * handling of null arrays
 * to sort or of null elements
 * in arrays to sort.
 *
 * @author Heiner K&uuml;cker
 */
public enum Nulls
{
	/**
	 * Order null arrays or elements first.
	 */
    FIRST ,

	/**
	 * Order null arrays or elements last.
	 */
    LAST ,

    /**
     * Null arrays or elements forbidden,
     * an {@link NullPointerException}
     * will be throwed.
     */
    FORBIDDEN;
}
