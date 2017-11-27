package model.profesje;

import model.Postac;
import model.Profesja;
import model.umiejetnosci.WalkaMieczem;
import model.umiejetnosci.WalkaToporem;

public class Wojownik extends Profesja {
    private Postac postac;

    public Wojownik(Postac postac) {
        super(postac);
        this.postac = postac;

        umiejetnosci.add(new WalkaMieczem());
        umiejetnosci.add(new WalkaToporem());
        drzewoKlas.add(this.getClass().getSimpleName());
    }
}
