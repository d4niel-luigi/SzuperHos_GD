
package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {

    private Random rand = new Random();
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {
        setSzuperero(getSzuperero()+rand.nextDouble(0,10));
    }



    @Override
    public String toString() {
        String bosszualloInfo = super.toString();
        return String.format("Vasember: %s",
                bosszualloInfo);
    }
}
