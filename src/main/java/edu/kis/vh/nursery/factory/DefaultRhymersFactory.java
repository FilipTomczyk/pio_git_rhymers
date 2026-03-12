package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymery;
import edu.kis.vh.nursery.FIFORhymery;
import edu.kis.vh.nursery.HanoiRhymery;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultCountingOutRhymery GetStandardRhymer() {
        return new defaultCountingOutRhymery();
    }

    @Override
    public defaultCountingOutRhymery GetFalseRhymer() {
        return new defaultCountingOutRhymery();
    }

    @Override
    public defaultCountingOutRhymery GetFIFORhymer() {
        return new FIFORhymery();
    }

    @Override
    public defaultCountingOutRhymery GetHanoiRhymer() {
        return new HanoiRhymery();
    }

}
