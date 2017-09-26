package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.CzekoladoweSkladniki;

import java.util.HashMap;
import java.util.Map;

public class Czekoladowy extends Tort {
    private Skladniki skladniki;
    private Map<String, Integer> ceny = new HashMap<>();

    public Czekoladowy() {
        this.skladniki = new CzekoladoweSkladniki();

        ceny.put("maly", 20);
        ceny.put("sredni", 25);
        ceny.put("duzy", 30);
    }

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
