package deqo.vgre;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpStackTest {

    @Test
    public void testIsEmpty() throws Exception {
        SimpStack test = new SimpStack();
        assertTrue(test.isEmpty());
        test.push(new Item(1));
        assertFalse(test.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        SimpStack test = new SimpStack();
        assertEquals(0,test.getSize());
        test.push(new Item(2));
        test.push(new Item(3));
        assertEquals(2,test.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item element = new Item(4);
        SimpStack test = new SimpStack();
        assertEquals(0,test.getSize());
        test.push(element);
        assertEquals(1,test.getSize());
        Item res = test.peek();
        assertEquals(element.getElemt(), res.getElemt());
    }

    @Test
    public void testPeek() throws Exception {
        Item element = new Item(5);
        SimpStack test = new SimpStack();
        assertEquals(0,test.getSize());
        test.push(element);
        assertEquals(1,test.getSize());
        Item res = test.peek();
        assertEquals(1,test.getSize());
        assertEquals(element.getElemt(),res.getElemt());
    }

    @Test
    public void testPop() throws Exception {

        Item element = new Item(5);
        SimpStack test = new SimpStack();
        assertEquals(0,test.getSize());
        test.push(element);
        assertEquals(1, test.getSize());
        Item res = test.pop();
        assertEquals(0,test.getSize());
        assertEquals(element.getElemt(),res.getElemt());
    }

    @Test (expected = EmptyStackException.class)
    public void testEmptyStack() throws Exception {
        SimpStack test = new SimpStack();
        test.pop();
    }

    @Test (expected = EmptyStackException.class)
    public void testPeekEmptyStack() throws Exception {
        SimpStack test = new SimpStack();
        test.peek();
    }
}