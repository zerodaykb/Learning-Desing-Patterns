package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Postac {

    public List<Zdolnosc> zdolnosci = new ArrayList<>();
    public List<Umiejetnosc> umiejetnosci = new ArrayList<>();

    public void dodajUmiejetnosc(Umiejetnosc umiejetnosc) {
        umiejetnosci.add(umiejetnosc);
    }

    public void pokazZdolnosci() {
        for (Zdolnosc zdolnosc : zdolnosci) {
            System.out.println(zdolnosc);
        }
    }

    public void pokazUmiejetnosci() {
        for (Umiejetnosc umiejetnosc : umiejetnosci) {
            System.out.println(umiejetnosc);
        }
    }

}
