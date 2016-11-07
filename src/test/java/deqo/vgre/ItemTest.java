package deqo.vgre;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testGetElemt() throws Exception {
        Item element = new Item(6);
        assertEquals(6,element.getElemt());
    }

    @Test
    public void testSetElemt() throws Exception {
        Item element = new Item(7);
        assertEquals(7,element.getElemt());
        element.setElemt(8);
        assertEquals(8,element.getElemt());
    }
}