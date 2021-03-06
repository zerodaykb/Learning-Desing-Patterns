package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.WalkaWrecz;
import model.umiejetnosci.Zatruwanie;

public class Zabojca extends Profesja {

    public Zabojca(Postac postac) throws Exception {
        super(postac);

        umiejetnosci.add(new WalkaWrecz());
        umiejetnosci.add(new Zatruwanie());
        profesje.add(getClass().getSimpleName());
    }
}