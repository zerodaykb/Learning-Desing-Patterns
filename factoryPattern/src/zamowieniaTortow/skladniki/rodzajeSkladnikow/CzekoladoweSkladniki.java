package zamowieniaTortow.skladniki.rodzajeSkladnikow;

import zamowieniaTortow.skladniki.*;
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
