package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {

    public static List<Szuperhos> szuperhosLista = new ArrayList<>();


    public static void szereplok(String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(" ");

                String szuperhosNev = adatok[0];
                int kutyuKeszitSzam = Integer.parseInt(adatok[1]);
                if(szuperhosNev.equals("Batman")){
                    Batman batman = new Batman();
                    for (int i = 0; i < kutyuKeszitSzam; i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                }

                else if(szuperhosNev.equals("Vasember")){
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < kutyuKeszitSzam; i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);
                }
            }
        } catch (IOException e) {
            System.err.println("Hiba történt a fájl beolvasásakor: " + e.getMessage());
        }
    }


    public static  void szuperhosok(){
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }
}