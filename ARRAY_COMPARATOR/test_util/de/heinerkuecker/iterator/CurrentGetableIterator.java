package de.heinerkuecker.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CurrentGetableIterator<E>
implements Iterator<E>
{
	private final Iterator<E> wrappedIterator;
	
	private boolean hasCurrent = false;
	
	private E current;


	public CurrentGetableIterator(
			final Iterator<E> iteratorToWrap )
	{
		this.wrappedIterator = iteratorToWrap;
	}


	@Override
	public boolean hasNext()
	{
		return wrappedIterator.hasNext();
	}


	@Override
	public E next()
	{
		this.current = wrappedIterator.next();
		hasCurrent = true;
		return this.current;
	}
	
	public E current()
	{
		if ( ! this.hasCurrent )
		{
			throw new NoSuchElementException();
		}
		return this.current;
	}

}
