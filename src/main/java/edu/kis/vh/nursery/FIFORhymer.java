package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temps = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temps.countIn(super.countOut());

        int ret = temps.countOut();

        while (!temps.callCheck())
            countIn(temps.countOut());

        return ret;
    }
}
