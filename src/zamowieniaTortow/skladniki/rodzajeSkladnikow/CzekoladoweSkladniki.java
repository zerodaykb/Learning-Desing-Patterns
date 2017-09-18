package zamowieniaTortow.skladniki.rodzajeSkladnikow;

import zamowieniaTortow.skladniki.Biszkopt;
import zamowieniaTortow.skladniki.GlownySkladnik;
import zamowieniaTortow.skladniki.Krem;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.biszkopty.CiemnyBiszkopt;
import zamowieniaTortow.skladniki.glownySkladnik.PolewaCzekoladowa;
import zamowieniaTortow.skladniki.kremy.KremCzekoladowy;

public class CzekoladoweSkladniki implements Skladniki {

    @Override
    public Krem zrobKrem() {
        return new KremCzekoladowy();
    }

    @Override
    public GlownySkladnik zrobGlownySkladnik() {
        return new PolewaCzekoladowa();
    }

    @Override
    public Biszkopt zrobBiszkopt() {
        return new CiemnyBiszkopt();
    }
}
