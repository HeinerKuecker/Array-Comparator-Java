package de.heinerkuecker.util.array;

/**
 * Util class to clone multi-dimensional arrays.
 *
 * @author Heiner Kücker
 */
public final class ArrayDeepClone
{

    /**
     *
     */
    private ArrayDeepClone()
    {
        super();
    }

    /**
     * Util method to clone multi-dimensional arrays.
     * Nicht Array Elemente werden nicht geclont.
     *
     * @param arrToClone array to clone
     * @return clone
     */
    public static Object[] deepClone(
            final Object[] arrToClone )
    {
        if ( arrToClone == null )
        {
            return null;
        }

        if ( arrToClone.getClass().getComponentType().isArray() )
        {
            if ( arrToClone.getClass().getComponentType().getComponentType().isArray() )
            {
                final Object[] shallowCopy = arrToClone.clone();

                for ( int i = 0 ; i < arrToClone.length ; i++ )
                {
                    shallowCopy[ i ] =
                            deepClone(
                                    (Object[]) arrToClone[ i ] );
                }

                return shallowCopy;
            }
            else
            {
                final Object[] shallowCopy = arrToClone.clone();

                for ( int i = 0 ; i < arrToClone.length ; i++ )
                {
                    final Object elementToClone = arrToClone[ i ];

                    Object clonedElement;
                    if ( elementToClone instanceof Object[] )
                    {
                        clonedElement =
                                deepClone(
                                        (Object[]) arrToClone[ i ] );
                    }
                    else if ( elementToClone instanceof boolean[] )
                    {
                        clonedElement =
                                ( (boolean[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof byte[] )
                    {
                        clonedElement =
                                ( (byte[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof short[] )
                    {
                        clonedElement =
                                ( (short[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof char[] )
                    {
                        clonedElement =
                                ( (char[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof int[] )
                    {
                        clonedElement =
                                ( (int[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof long[] )
                    {
                        clonedElement =
                                ( (long[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof float[] )
                    {
                        clonedElement =
                                ( (float[]) elementToClone ).clone();
                    }
                    else if ( elementToClone instanceof double[] )
                    {
                        clonedElement =
                                ( (double[]) elementToClone ).clone();
                    }
                    else
                    {
                        clonedElement =
                                // leider nicht kompilierbar
                                //( (Cloneable) arrToClone[ i ] ).clone();
                                elementToClone;
                    }

                    shallowCopy[ i ] = clonedElement;
                }

                return shallowCopy;
            }
        }

        return arrToClone.clone();
    }

}
