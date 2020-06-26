package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.KawoweSkladniki;
import static zamowieniaTortow.Wielkosc.*;

public class Kawowy extends Tort {
    public Kawowy() {
        this.skladniki = new KawoweSkladniki();

        ceny.put(MALY, 22);
        ceny.put(SREDNI, 27);
        ceny.put(DUZY, 32);
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }
}
