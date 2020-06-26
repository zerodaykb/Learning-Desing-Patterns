package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.TruskawkoweSkladniki;
import static zamowieniaTortow.Wielkosc.*;

public class Truskawkowy extends Tort {
    public Truskawkowy() {
        this.skladniki = new TruskawkoweSkladniki();

        ceny.put(MALY, 25);
        ceny.put(SREDNI, 30);
        ceny.put(DUZY, 25);
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }
}
