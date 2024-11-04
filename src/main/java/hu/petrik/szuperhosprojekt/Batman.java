package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos,Milliardos{

    private double lelemenyesseg;


    public Batman() {
        this.lelemenyesseg = 100;
    }
    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;


    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }



    @Override
    public String toString() {
        String formatedLelemenyesseg = String.valueOf(lelemenyesseg).replaceAll("\\.?0+$", "");
        return String.format("Batman: leleményesség: %s",  formatedLelemenyesseg);
    }
}