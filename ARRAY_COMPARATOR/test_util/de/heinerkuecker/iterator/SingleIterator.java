package de.heinerkuecker.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleIterator<E>
implements Iterator<E>
{
	private final E element;
	
	private boolean hasNext = true;

	public SingleIterator(
			final E element )
	{
		this.element = element;
	}

	@Override
	public boolean hasNext()
	{
		return hasNext;
	}

	@Override
	public E next()
	{
		if ( ! hasNext() )
		{
			throw new NoSuchElementException();
		}
		hasNext = false;		
		return element;
	}

}
