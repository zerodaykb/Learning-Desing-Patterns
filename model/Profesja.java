package model;

public abstract class Profesja extends Postac {

    protected Profesja(Postac postac) {
        zdolnosci = postac.zdolnosci;
        umiejetnosci = postac.umiejetnosci;
        drzewoKlas = postac.drzewoKlas;
    }
}
