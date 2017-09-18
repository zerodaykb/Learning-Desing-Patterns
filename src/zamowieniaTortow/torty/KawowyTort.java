package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;

public class KawowyTort extends Tort {
    private Skladniki skladniki;

    public KawowyTort(Skladniki skladniki) {
        this.skladniki = skladniki;
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }
}
