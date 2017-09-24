package model;

public abstract class Profesja extends Postac {

    protected Profesja(Postac postac) {
        this.zdolnosci = postac.zdolnosci;
        this.umiejetnosci = postac.umiejetnosci;
    }

    public abstract void dodajUmiejetnosci();
}
