package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

import java.util.Random;

/**
 *
 * TODO: Klasa powinna być publiczna, jeśli ma służyć jako punkt wejścia dla aplikacji.
 * TODO: W dłuższej perspektywie warto przenieść logikę testową do testów jednostkowych.
 */
public class RhymersDemo {

    private static final int TEST_RANGE = 15;
    private static final int RANDOM_BOUND = 20;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

    /**
     *
     * TODO: Metoda robi kilka rzeczy naraz (generowanie danych, drukowanie outputu).
     *       Można rozbić ją na mniejsze, bardziej czytelne metody.
     */
    private static void testRhymers(RhymersFactory factory) {

        DefaultCountingOutRhymer[] rhymers = {
                factory.getStandardRhymer(),
                factory.getFalseRhymer(),
                factory.getFIFORhymer(),
                factory.getHanoiRhymer()
        };

        fillNormalRhymerData(rhymers);
        fillHanoiRhymerRandomData(rhymers[3]);

        printRhymersOutput(rhymers);
        printHanoiRejected((HanoiRhymer) rhymers[3]);
    }

    /**
     * Wypełnia trzy pierwsze Rhymer-y rosnącymi wartościami.
     * TODO: Warto może przekazać zakres jako parametr zamiast stałej TEST_RANGE.
     */
    private static void fillNormalRhymerData(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < TEST_RANGE; i++) {
            for (int j = 0; j < 3; j++) {
                rhymers[j].countIn(i);
            }
        }
    }

    /**
     * Wypełnia HanoiRhymer losowymi liczbami.
     */
    private static void fillHanoiRhymerRandomData(DefaultCountingOutRhymer hanoi) {
        Random rn = new Random();
        for (int i = 1; i < TEST_RANGE; i++) {
            hanoi.countIn(rn.nextInt(RANDOM_BOUND));
        }
    }

    /**
     * Drukuje wynik operacji countOut() każdego Rhymera.
     * TODO: Drukowanie w konsoli można zastąpić loggerem.
     */
    private static void printRhymersOutput(DefaultCountingOutRhymer[] rhymers) {
        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.isEmpty()) {
                System.out.print(rhymer.countOut() + " ");
            }
            System.out.println();
        }
    }

    /**
     * Drukuje liczbę odrzuconych ruchów w HanoiRhymer.
     */
    private static void printHanoiRejected(HanoiRhymer hanoi) {
        System.out.println("total rejected is " + hanoi.reportRejected());
    }
    
}