package hu.petrik.szuperhosprojekt;


public abstract class Bosszuallo implements Szuperhos {

    private double  szuperero;
    private  boolean vanEGyengesege;


    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if(szuperhos instanceof Bosszuallo) {
            if(((Bosszuallo) szuperhos).vanEGyengesege && szuperhos.mekkoraAzEreje() < this.mekkoraAzEreje()) {
                return true;
            }
        }
        if(szuperhos instanceof Batman) {
            return this.mekkoraAzEreje() >= 2 * szuperhos.mekkoraAzEreje();
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }



    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }


    @Override
    public String toString() {
        String formatedVanEGyengesege = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        String formatedSzuperero = String.valueOf(szuperero).replaceAll("\\.?0+$", "");
        return String.format("Szupererő: %s; %s", formatedSzuperero, formatedVanEGyengesege);
    }

}