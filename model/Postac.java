package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Postac {
    public List<Zdolnosc> zdolnosci = new ArrayList<>();
    public List<Umiejetnosc> umiejetnosci = new ArrayList<>();

    public void dodajUmiejetnosc(Umiejetnosc umiejetnosc) {
        umiejetnosci.add(umiejetnosc);
    }

    public String pobierzZdolnosci() {
        String tekst = "";

        for (Zdolnosc zdolnosc : zdolnosci) {
            tekst += zdolnosc + "\n";
        }

        return tekst;
    }

    public String pobierzUmiejetnosci() {
        String tekst = "";

        for (Umiejetnosc umiejetnosc : umiejetnosci) {
            tekst += umiejetnosc + "\n";
        }

        return tekst;
    }
}
