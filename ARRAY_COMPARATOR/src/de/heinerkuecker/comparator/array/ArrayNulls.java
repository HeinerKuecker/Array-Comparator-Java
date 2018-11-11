package de.heinerkuecker.comparator.array;

/**
 * {@link Enum} to control
 * handling of null arrays
 * to sort.
 *
 * @author Heiner K&uuml;cker
 */
public enum ArrayNulls
{
	/**
	 * Order null arrays first.
	 */
    FIRST ,

	/**
	 * Order null arrays last.
	 */
    LAST ,

    /**
     * Null arrays forbidden,
     * an {@link NullPointerException}
     * will will be throwed.
     */
    FORBIDDEN;
}
