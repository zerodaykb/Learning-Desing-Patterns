package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.CzekoladoweSkladniki;
import static zamowieniaTortow.Wielkosc.*;

public class Czekoladowy extends Tort {
    public Czekoladowy() {
        this.skladniki = new CzekoladoweSkladniki();

        ceny.put(MALY, 20);
        ceny.put(SREDNI, 25);
        ceny.put(DUZY, 30);
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }
}
