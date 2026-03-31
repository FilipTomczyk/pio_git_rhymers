package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testIsEmptyOnNewList() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testPushMakesListNotEmpty() {
        IntLinkedList list = new IntLinkedList();
        list.push(10);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testTopOnEmptyList() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(IntLinkedList.EMPTY_INDICATOR, list.top());
    }

    @Test
    public void testPopOnEmptyList() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(IntLinkedList.EMPTY_INDICATOR, list.pop());
    }

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        Assert.assertEquals(5, list.top());
        Assert.assertEquals(5, list.top());
    }

    @Test
    public void testPushAndPop() {
        IntLinkedList list = new IntLinkedList();
        list.push(123);
        Assert.assertEquals(123, list.pop());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testMultiplePushAndPop() {
        IntLinkedList list = new IntLinkedList();

        list.push(1);
        list.push(2);
        list.push(3);

        Assert.assertEquals(3, list.pop());
        Assert.assertEquals(2, list.pop());
        Assert.assertEquals(1, list.pop());
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsFullAlwaysFalse() {
        IntLinkedList list = new IntLinkedList();

        for (int i = 0; i < 1000; i++) {
            Assert.assertFalse(list.isFull());
            list.push(i);
        }
    }
}
