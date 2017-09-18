package zamowieniaTortow;

import java.util.ArrayList;

public class Zamowienie {
    private ArrayList<Tort> torty = new ArrayList<>();
    private String adresDostawy;

    public void dodajTorty(String rodzajTortu, Integer ilosc, String wielkosc) {
        for(int i = 0; i < ilosc; i++) {
            Tort tort;

            tort = dodajTort(rodzajTortu, wielkosc);
            tort.dodajSkladniki();
            torty.add(tort);
        }
    }

    private Tort dodajTort(String rodzajTortu, String wielkosc) {
        Rodzaj rodzaj = Rodzaj.wybierzRodzaj(rodzajTortu);

        return rodzaj.dodajTort(wielkosc);
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
