package de.heinerkuecker.util.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 test case for class {@link ArrayDeepClone}
 *
 * @author Heiner Kücker
 */
public class ArrayDeepCloneTest
{

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim1_null()
    {
        final Object[] expecteds = null;

        final Object[] actuals =
                ArrayDeepClone.deepClone(
                        null );

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim1_Empty()
    {
        final Object[] expecteds = {};

        final Object[] actuals =
                ArrayDeepClone.deepClone(
                        expecteds.clone() );

        Assert.assertFalse(
                expecteds == actuals );

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim1()
    {
        final Object[] expecteds = { "a" };

        final Object[] actuals =
                ArrayDeepClone.deepClone(
                        expecteds.clone() );

        Assert.assertFalse(
                expecteds == actuals );

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim1_with_null()
    {
        final Object[] expecteds = { null };

        final Object[] actuals =
                ArrayDeepClone.deepClone(
                        expecteds.clone() );

        Assert.assertFalse(
                expecteds == actuals );

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }


    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim2_Empty()
    {
        final Object[][] toClone = { {} };

        // TODO avoid changing of argument array
        final Object[][] actuals =
                (Object[][]) ArrayDeepClone.deepClone(
                        toClone );

        Assert.assertFalse(
                toClone == actuals );

        Assert.assertFalse(
                toClone[ 0 ] == actuals[ 0 ] );

        // elements won't clone
        //Assert.assertFalse(
        //        expecteds[ 0 ][ 0 ] == actuals[ 0 ][ 0 ] );

        final Object[][] expecteds = { {} };

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim2()
    {
        final Object[][] toClone = { { "a" } };

        // TODO avoid changing of argument array
        final Object[][] actuals =
                (Object[][]) ArrayDeepClone.deepClone(
                        toClone );

        final Object[][] expecteds = { { "a" } };

        Assert.assertFalse(
                expecteds == actuals );

        Assert.assertFalse(
                expecteds[ 0 ] == actuals[ 0 ] );

        // elements won't clone
        //Assert.assertFalse(
        //        expecteds[ 0 ][ 0 ] == actuals[ 0 ][ 0 ] );

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_Object_Dim2_with_null()
    {
        final Object[][] toClone = { { null } };

        // TODO avoid changing of argument array
        final Object[][] actuals =
                (Object[][]) ArrayDeepClone.deepClone(
                        toClone );

        Assert.assertFalse(
                toClone == actuals );

        Assert.assertFalse(
                toClone[ 0 ] == actuals[ 0 ] );

        // nulls are equal
        //Assert.assertFalse(
        //        expecteds[ 0 ][ 0 ] == actuals[ 0 ][ 0 ] );

        final Object[][] expecteds = { { null } };

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_intDim2()
    {
        final int[][] toClone = { { 1 } };

        final Object[] actuals =
                ArrayDeepClone.deepClone(
                        toClone );

        Assert.assertFalse(
                toClone == actuals );

        Assert.assertFalse(
                toClone[ 0 ] == actuals[ 0 ] );

        final int[][] expecteds = { { 1 } };

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

    /**
     * Test method for {@link ArrayDeepClone#deepClone(java.lang.Object[])}.
     */
    @Test
    public void testDeepClone_intDim3()
    {
        final int[][][] toClone = { { { 1 } } };

        final Object[][] actuals =
                (Object[][]) ArrayDeepClone.deepClone(
                        toClone );

        Assert.assertFalse(
                toClone == actuals );

        Assert.assertFalse(
                toClone[ 0 ] == actuals[ 0 ] );

        Assert.assertFalse(
                toClone[ 0 ][ 0 ] == actuals[ 0 ][ 0 ] );

        final int[][][] expecteds = { { { 1 } } };

        Assert.assertArrayEquals(
                expecteds ,
                actuals);
    }

}
