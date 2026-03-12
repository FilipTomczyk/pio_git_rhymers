package edu.kis.vh.nursery;

public class HanoiRhymery extends defaultCountingOutRhymery {
<<<<<<< HEAD
    int totalRejecteds = 0;
=======

    int totalRejected = 0;

>>>>>>> format
    public int reportRejected() {
        return totalRejecteds;
    }
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejecteds++;
<<<<<<< HEAD
    else
        super.countIn(in);

=======
        else
            super.countIn(in);
>>>>>>> format
    }
}
