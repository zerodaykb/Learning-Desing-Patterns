package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.Uzdrawianie;
import model.umiejetnosci.Zatruwanie;

public class Mag extends Profesja {
    private Postac postac;

    public Mag(Postac postac) {
        super(postac);
        this.postac = postac;

        umiejetnosci.add(new Uzdrawianie());
        umiejetnosci.add(new Zatruwanie());
        drzewoKlas.add(this.getClass().getSimpleName());
    }
}