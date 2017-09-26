package zamowieniaTortow.torty;

import enumy.Smak;
import enumy.Wielkosc;
import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.MalinoweSkladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.TruskawkoweSkladniki;

import java.util.HashMap;
import java.util.Map;

public class Malinowy extends Tort {
    private Skladniki skladniki;
    private Map<String, Integer> ceny = new HashMap<>();

    public Malinowy() {
        this.skladniki = new MalinoweSkladniki();

        ceny.put("maly", 20);
        ceny.put("sredni", 22);
        ceny.put("duzy", 24);
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }


    @Override
    protected void przygotuj(String wielkosc, String smak) {
        dodajSkladniki();
        cena = ceny.get(wielkosc);
        nazwa = wielkosc + " " + smak;
    }
}
