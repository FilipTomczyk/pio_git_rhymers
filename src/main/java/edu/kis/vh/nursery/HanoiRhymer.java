package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {
<<<<<<< HEAD
    int totalRejected = 0;
=======

    int totalRejected = 0;

>>>>>>> format
    public int reportRejected() {
        return totalRejected;
    }
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
<<<<<<< HEAD
    else
        super.countIn(in);

=======
        else
            super.countIn(in);
>>>>>>> format
    }
}
