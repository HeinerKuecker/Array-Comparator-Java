package de.heinerkuecker.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;

public class CartesianProductIterator<RESULT, LEFT, RIGHT>
implements Iterator<RESULT>
{
    private final Iterator<? extends LEFT> left;
    private final Iterable<? extends RIGHT> right;
    private final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction;

    private LEFT currentLeft;
    private Iterator<? extends RIGHT> currentRight;

    private boolean hasNext = false;

    public CartesianProductIterator(
            final Iterator<? extends LEFT> left ,
            final Iterable<? extends RIGHT> right ,
            final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction )
    {
        this.left = left;
        this.right = right;
        this.combineFunction = combineFunction;

        while ( left.hasNext() )
            // Vorlaufen bis zum ersten kombinierbaren Paar
        {
            currentLeft = left.next();

            this.currentRight = right.iterator();

            if ( currentRight.hasNext() )
                // der rechte Iterator könnte leer sein
            {
                hasNext = true;
                return;
            }
        }
    }

    public CartesianProductIterator(
            final Iterable<? extends LEFT> left ,
            final Iterable<? extends RIGHT> right ,
            final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction )
    {
        this(
                left.iterator() ,
                right ,
                combineFunction );
    }

    @Override
    public boolean hasNext()
    {
        return hasNext;
    }

    @Override
    public RESULT next()
    {
        if ( ! hasNext() )
        {
            throw new NoSuchElementException();
        }

        final RESULT result =
                combineFunction.apply(
                        currentLeft ,
                        currentRight.next() );

        if ( ! currentRight.hasNext() )
        {
            if ( left.hasNext() )
            {
                currentLeft = left.next();
                this.currentRight = right.iterator();
                hasNext = this.currentRight.hasNext();
            }
            else
            {
                hasNext = false;
            }
        }
        return result;
    }

}
