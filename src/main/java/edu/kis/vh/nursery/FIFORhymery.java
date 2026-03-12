package edu.kis.vh.nursery;

public class FIFORhymery extends defaultCountingOutRhymery {

    public defaultCountingOutRhymery temp = new defaultCountingOutRhymery();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
