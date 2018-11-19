package de.heinerkuecker.iterator;

import java.util.Iterator;
import java.util.function.BiFunction;

public class CartesianProductIterable<RESULT, LEFT, RIGHT>
implements Iterable<RESULT>
{
    private final Iterator<? extends LEFT> left;
    private final Iterable<? extends RIGHT> right;
    private final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction;

    public CartesianProductIterable(
            final Iterator<? extends LEFT> left ,
            final Iterable<? extends RIGHT> right ,
            final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction )
    {
        this.left = left;
        this.right = right;
        this.combineFunction = combineFunction;
    }

    public CartesianProductIterable(
            final Iterable<? extends LEFT> left ,
            final Iterable<? extends RIGHT> right ,
            final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction )
    {
        this.left = left.iterator();
        this.right = right;
        this.combineFunction = combineFunction;
    }

    public static <RESULT, LEFT, RIGHT> CartesianProductIterable<RESULT, LEFT, RIGHT> newCartesianProductIterable(
            final Iterable<? extends LEFT> left ,
            final Iterable<? extends RIGHT> right ,
            final BiFunction<? super LEFT, ? super RIGHT, ? extends RESULT> combineFunction )
    {
        return new CartesianProductIterable<RESULT, LEFT, RIGHT>(
                left ,
                right ,
                combineFunction );
    }

    @Override
    public Iterator<RESULT> iterator()
    {
        return new CartesianProductIterator<RESULT, LEFT, RIGHT>(
                left ,
                right ,
                combineFunction );
    }

}
