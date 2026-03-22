package edu.kis.vh.nursery;

import static sun.util.locale.LocaleUtils.isEmpty;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;

    private int totalRejected = INITIAL_REJECTED_VALUE;

    public int getTotalRejected() {
        return totalRejected;
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!isEmpty() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
