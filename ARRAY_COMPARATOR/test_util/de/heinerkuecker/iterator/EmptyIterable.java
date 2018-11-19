package de.heinerkuecker.iterator;

import java.util.Iterator;

/**
 * {@link Iterable} over
 * {qlink EmptyIterator}.
 *
 * @author Heiner K&uuml;cker
 */
public class EmptyIterable<T>
implements Iterable<T>
{

    /**
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<T> iterator()
    {
        return new EmptyIterator<>();
    }

}
