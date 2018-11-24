package de.heinerkuecker.comparator.array;

/**
 * {@link Enum} to control
 * handling of null arrays
 * or of null elements
 * in arrays to compare.
 *
 * @author Heiner K&uuml;cker
 */
public enum Nulls
{
    /**
     * Handle null arrays or null elements
     * as lesser than
     * existing arrays or elements.
     */
    LESSER ,

    /**
     * Handle null arrays or null elements
     * as greater than
     * existing arrays or elements.
     */
    GREATER ,

    /**
     * Null arrays or elements are forbidden,
     * an {@link NullPointerException}
     * will be throwed.
     */
    FORBIDDEN;
}
