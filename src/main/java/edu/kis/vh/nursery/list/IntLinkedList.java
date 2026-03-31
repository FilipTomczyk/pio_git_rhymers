
package edu.kis.vh.nursery.list;


public class IntLinkedList {

    public static final int EMPTY_INDICATOR = -1;
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    private Node last;
    private int i;

    public Node getLast() {
        return last;
    }

    public int getI() {
        return i; // TODO: ponieważ pole i nie jest używane — ta metoda też jest zbędna.
    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_INDICATOR;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_INDICATOR;

        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}
