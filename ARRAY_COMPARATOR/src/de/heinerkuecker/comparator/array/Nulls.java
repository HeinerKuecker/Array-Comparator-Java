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
     * Handle null arrays or
     * null elements as lesser.
     */
    LESSER ,

    /**
     * Handle null arrays or
     * null elements as greater.
     */
    GREATER ,

    /**
     * Null arrays or elements forbidden,
     * an {@link NullPointerException}
     * will be throwed.
     */
    FORBIDDEN;
}
