package zamowieniaTortow;

import java.util.ArrayList;

public class Zamowienie {
    private ArrayList<Tort> torty = new ArrayList<>();
    private String adresDostawy;

    public void dodajTorty(String smak, Integer ilosc, String wielkosc) {
        for(int i = 0; i < ilosc; i++) {
            Tort tort = Tort.dodajTort(smak, wielkosc);

            torty.add(tort);
        }
    }

    public void wyswietlZamowienie() {
        Integer suma = 0;
        System.out.println("Twoje zamowienie:");

        for (Tort tort: torty) {
            suma += tort.pobierzCene();
            System.out.println(tort);
        }

        if(!adresDostawy.equals("odbior osobisty")) {
            suma += 10;
        }

        System.out.println("Adres dostawy: " + adresDostawy);
        System.out.println("Cena calkowita: " + suma);
    }

    public void dodajAdres(String adresDostawy) {
        this.adresDostawy = adresDostawy;
    }
}
