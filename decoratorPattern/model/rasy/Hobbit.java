package model.rasy;

import model.Postac;
import model.zdolnosci.Niewidzialnosc;
import model.zdolnosci.Skradanie;

public class Hobbit extends Postac {

    public Hobbit() {
        rasa = "Hobbit";
        zdolnosci.add(new Skradanie());
        zdolnosci.add(new Niewidzialnosc());

    }
}
