package hu.petrik.szuperhosprojekt;

import static hu.petrik.szuperhosprojekt.Kepregeny.szereplok;
import static hu.petrik.szuperhosprojekt.Kepregeny.szuperhosok;

public class Main {

    public static void main(String[] args) {
        szereplok("src/test/resources/szuperhos.txt");
        szuperhosok();
    }
}
