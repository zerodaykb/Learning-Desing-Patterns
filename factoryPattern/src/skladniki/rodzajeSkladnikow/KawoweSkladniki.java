package zamowieniaTortow.skladniki.rodzajeSkladnikow;

import zamowieniaTortow.skladniki.*;
import zamowieniaTortow.skladniki.biszkopty.BialyBiszkopt;
import zamowieniaTortow.skladniki.glownySkladnik.ZiarnaKawy;
import zamowieniaTortow.skladniki.kremy.KremKawowy;

public class KawoweSkladniki implements Skladniki {
    @Override
    public Krem zrobKrem() {
        return new KremKawowy();
    }

    @Override
    public GlownySkladnik zrobGlownySkladnik() {
        return new ZiarnaKawy() ;
    }

    @Override
    public Biszkopt zrobBiszkopt() {
        return new BialyBiszkopt();
    }
}
