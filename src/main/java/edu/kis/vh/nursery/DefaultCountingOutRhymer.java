package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int IF_EMPTY = -1;
    private static final int STACK_EMPTY_INDEX = -1;
    private static final int STACK_FULL_INDEX = CAPACITY - 1;

    private final int[] numbers = new int[CAPACITY];
    private int total = STACK_EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    public boolean isEmpty() {
        return total == STACK_EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == STACK_FULL_INDEX;
    }

    protected int peekaboo() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total--];
    }

}
