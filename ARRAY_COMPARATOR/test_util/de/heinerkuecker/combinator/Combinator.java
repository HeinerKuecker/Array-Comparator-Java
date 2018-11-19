package de.heinerkuecker.combinator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class to generate all combinations
 * <a href="https://de.wikipedia.org/wiki/Kombination_(Kombinatorik)">Wikipedia Kombination (Kombinatorik)</a>
 * <a href="https://en.wikipedia.org/wiki/Combination">Wikipedia Combination</a>
 *
 * @author Heiner K&uuml;cker
 */
class Combinator<T>
implements Iterable<Iterable<T>>
{
    private final ArrayList<T> allElements;

    /**
     * Constructor.
     */
    public Combinator(
            final List<T> allElements )
    {
        this.allElements =
                // create clone to avoid unwanted changes
                new ArrayList<>(
                        allElements );
    }

    /**
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<Iterable<T>> iterator()
    {
        return new CombinatorIterator<T>( allElements );
        //throw new RuntimeException( "not implemented" );
    }

}
