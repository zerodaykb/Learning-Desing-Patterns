package zamowieniaTortow.skladniki.rodzajeSkladnikow;

import zamowieniaTortow.skladniki.*;
import zamowieniaTortow.skladniki.biszkopty.BialyBiszkopt;
import zamowieniaTortow.skladniki.glownySkladnik.Truskawki;
import zamowieniaTortow.skladniki.kremy.KremTruskawkowy;

public class TruskawkoweSkladniki implements Skladniki {

    @Override
    public Krem zrobKrem() {
        return new KremTruskawkowy();
    }

    @Override
    public GlownySkladnik zrobGlownySkladnik() {
        return new Truskawki() ;
    }

    @Override
    public Biszkopt zrobBiszkopt() {
        return new BialyBiszkopt();
    }
}