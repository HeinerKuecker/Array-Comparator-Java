package de.heinerkuecker.combinator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

import de.heinerkuecker.iterator.CartesianProductIterable;

/**
 * Class to generate all combinations
 * <a href="https://de.wikipedia.org/wiki/Kombination_(Kombinatorik)">Wikipedia Kombination (Kombinatorik)</a>
 * <a href="https://en.wikipedia.org/wiki/Combination">Wikipedia Combination</a>
 *
 * @author Heiner K&uuml;cker
 */
public class CombinatorIterator<T>
implements Iterator<Iterable<T>>
{
    private final ArrayList<T> restElements;

    private final Iterator<? extends Iterable<T>> innerIterator;

    /**
     * Constructor.
     */
    public CombinatorIterator(
            final List<T> allElements )
    {
        if ( allElements.isEmpty() )
        {
            this.restElements = null;

            // only one empty list
            this.innerIterator =
                    Arrays.asList(
                            Collections.<T>emptyList() ).iterator();
        }
        else if ( allElements.size() == 1 )
        {
            this.restElements = null;
            // combinations for one element: [] and [e]
            this.innerIterator =
                    Arrays.asList(
                            Collections.<T>emptyList() ,
                            Arrays.asList(
                                    allElements.get( 0 ) ) ).iterator();
        }
        else
        {
            this.restElements =
                    // create clone to avoid unwanted changes
                    new ArrayList<>(
                            allElements );

            final T currentElement =
                    restElements.remove(
                            0 );

            // combinations for one element: [] and [e]
            final List<List<T>> currentElementCombinations =
                    Arrays.asList(
                            Collections.emptyList() ,
                            Arrays.asList( currentElement ) );

            final Combinator<T> restElementCombinations =
                    new Combinator<>(
                    restElements );

            final BiFunction<? super Iterable<T>, ? super Iterable<T>, ? extends Iterable<T>> combineFunction =
                    new BiFunction<Iterable<T>, Iterable<T>, Iterable<T>>()
                    {

                        @Override
                        public Iterable<T> apply(
                                Iterable<T> left ,
                                Iterable<T> right )
                        {
                            final ArrayList<T> result = new ArrayList<>();

                            for ( final T rightElem : right )
                            {
                                result.add( rightElem );
                            }

                            for ( final T leftElem : left )
                            {
                                result.add( leftElem );
                            }

                            return result;
                        }

                    };

            this.innerIterator =
                    CartesianProductIterable.<Iterable<T>, Iterable<T>, Iterable<T>>newCartesianProductIterable(
                            restElementCombinations ,
                            currentElementCombinations ,
                            combineFunction ).iterator();

            //throw new RuntimeException( "not implemented" );
        }
    }

    /* (non-Javadoc)
     * @see java.util.Iterator#hasNext()
     */
    @Override
    public boolean hasNext()
    {
        /*
        return
                isFirst ||
                currentElementIndex < allElements.size();
         */
        //throw new RuntimeException( "not implemented" );
        return this.innerIterator.hasNext();
    }

    /* (non-Javadoc)
     * @see java.util.Iterator#next()
     */
    @Override
    public Iterable<T> next()
    {
        /*
        if ( ! hasNext() )
        {
            throw new NoSuchElementException();
        }

        if ( isFirst )
        {
            isFirst = false;

            return new EmptyIterable<T>();
        }

        @SuppressWarnings("unchecked")
        final ArrayList<T> tmpElements =
                (ArrayList<T>) allElements.clone();

        final T currentElement =
                tmpElements.remove(
                        currentElementIndex++ );

        // combinations for one element: [] and [e]
        final List<List<T>> currentElementCombinations =
                Arrays.asList(
                        Collections.emptyList() ,
                        Arrays.asList( currentElement ) );

        if ( tmpElements.isEmpty() )
        {
            return currentElementCombinations.iterator();
        }

        final CombinatorIterator<T> restCombinatorIterator =
                new CombinatorIterator<T>(
                        tmpElements );

        final BiFunction<List<T>, List<T>, List<T>> combineFunction = null;

        return new CartesianProductIterable<List<T>, List<T>, List<T>>(
                currentElement ,
                tmpElements ,
                combineFunction );
         */
        //throw new RuntimeException( "not implemented" );
        return this.innerIterator.next();
    }

}
