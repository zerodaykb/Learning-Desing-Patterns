package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;

public class CzekoladowyTort extends Tort {
    private Skladniki skladniki;

    public CzekoladowyTort(Skladniki skladniki) {
        this.skladniki = skladniki;
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }
}
