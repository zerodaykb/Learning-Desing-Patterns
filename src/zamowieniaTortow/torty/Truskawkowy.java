package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.TruskawkoweSkladniki;

import java.util.HashMap;
import java.util.Map;

public class Truskawkowy extends Tort {
    private Skladniki skladniki;
    private Map<String, Integer> ceny = new HashMap<>();

    public Truskawkowy() {
        this.skladniki = new TruskawkoweSkladniki();

        ceny.put("maly", 25);
        ceny.put("sredni", 30);
        ceny.put("duzy", 25);
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
