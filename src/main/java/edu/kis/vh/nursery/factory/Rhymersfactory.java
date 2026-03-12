package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymery;

public interface Rhymersfactory {

    public defaultCountingOutRhymery GetStandardRhymer();

    public defaultCountingOutRhymery GetFalseRhymer();

    public defaultCountingOutRhymery GetFIFORhymer();

    public defaultCountingOutRhymery GetHanoiRhymer();

}
