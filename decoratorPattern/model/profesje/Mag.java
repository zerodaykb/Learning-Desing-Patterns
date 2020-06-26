package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.Uzdrawianie;
import model.umiejetnosci.Zatruwanie;

public class Mag extends Profesja {

    public Mag(Postac postac) throws Exception {
        super(postac);

        umiejetnosci.add(new Uzdrawianie());
        umiejetnosci.add(new Zatruwanie());
        profesje.add(getClass().getSimpleName());
    }
}