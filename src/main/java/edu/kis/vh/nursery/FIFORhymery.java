package edu.kis.vh.nursery;

public class FIFORhymery extends defaultCountingOutRhymery {

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/FIFORhymer.java
    public defaultCountingOutRhymer temps = new defaultCountingOutRhymer();
=======
    public defaultCountingOutRhymery temp = new defaultCountingOutRhymery();
>>>>>>> d1f72ce (4.1 poprawa nazw klas):src/main/java/edu/kis/vh/nursery/FIFORhymery.java

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
