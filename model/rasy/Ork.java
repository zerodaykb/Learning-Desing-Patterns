package model.rasy;

import model.Postac;
import model.zdolnosci.Sila;
import model.zdolnosci.Wytrzymalosc;

public class Ork extends Postac {

    public Ork() {
        zdolnosci.add(new Wytrzymalosc());
        zdolnosci.add(new Sila());
        drzewoKlas.add(getClass().getSimpleName());
    }
}
