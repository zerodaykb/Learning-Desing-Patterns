package zamowieniaTortow.torty;

import enumy.Smak;
import enumy.Wielkosc;
import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.KawoweSkladniki;

import java.util.HashMap;
import java.util.Map;

public class Kawowy extends Tort {
    private Skladniki skladniki;
    private Map<String, Integer> ceny = new HashMap<>();

    public Kawowy() {
        this.skladniki = new KawoweSkladniki();

        ceny.put("maly", 22);
        ceny.put("sredni", 27);
        ceny.put("duzy", 32);
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
