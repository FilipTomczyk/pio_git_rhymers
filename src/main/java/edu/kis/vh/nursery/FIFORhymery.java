package edu.kis.vh.nursery;

public class FIFORhymery extends defaultCountingOutRhymery {

<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/FIFORhymer.java
    public defaultCountingOutRhymer temps = new defaultCountingOutRhymer();
=======
    public defaultCountingOutRhymery temp = new defaultCountingOutRhymery();
>>>>>>> d1f72ce (4.1 poprawa nazw klas):src/main/java/edu/kis/vh/nursery/FIFORhymery.java
=======
    public defaultCountingOutRhymery temp = new defaultCountingOutRhymery();
>>>>>>> class-method-naming

    @Override
    public int countOut() {
        while (!callCheck())
<<<<<<< HEAD
            temps.countIn(super.countOut());

        int ret = temps.countOut();

        while (!temps.callCheck())
            countIn(temps.countOut());
=======
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());
>>>>>>> class-method-naming

        return ret;
    }
}
