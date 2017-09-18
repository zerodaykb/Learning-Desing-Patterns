package zamowieniaTortow.torty;

import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;

public class TruskawkowyTort extends Tort {
    private Skladniki skladniki;

    public TruskawkowyTort(Skladniki skladniki) {
        this.skladniki = skladniki;
    }

    @Override
    protected void dodajSkladniki() {
        biszkopt = skladniki.zrobBiszkopt();
        krem = skladniki.zrobKrem();
        glownySkladnik = skladniki.zrobGlownySkladnik();
    }
}
