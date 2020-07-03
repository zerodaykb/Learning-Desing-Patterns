package model.rasy;

import model.Postac;
import model.zdolnosci.Sila;
import model.zdolnosci.Wytrzymalosc;

public class Ork extends Postac {

    public Ork() {
        rasa = "Ork";
        zdolnosci.add(new Wytrzymalosc());
        zdolnosci.add(new Sila());
    }
}
