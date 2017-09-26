package zamowieniaTortow.skladniki.rodzajeSkladnikow;

import zamowieniaTortow.skladniki.*;
import zamowieniaTortow.skladniki.biszkopty.BialyBiszkopt;
import zamowieniaTortow.skladniki.biszkopty.CiemnyBiszkopt;
import zamowieniaTortow.skladniki.glownySkladnik.Maliny;
import zamowieniaTortow.skladniki.glownySkladnik.Truskawki;
import zamowieniaTortow.skladniki.kremy.KremCzekoladowy;
import zamowieniaTortow.skladniki.kremy.KremTruskawkowy;

public class MalinoweSkladniki implements Skladniki {

    @Override
    public Krem zrobKrem() {
        return new KremCzekoladowy();
    }

    @Override
    public GlownySkladnik zrobGlownySkladnik() {
        return new Maliny() ;
    }

    @Override
    public Biszkopt zrobBiszkopt() {
        return new CiemnyBiszkopt();
    }
}