package breakthrough.plansza;

import breakthrough.plansza.Pionek;

public class Pole {
    private char wiersz;
    private char kolumna;

    private Pionek pionek;

    public Pole(char wiersz, char kolumna) {
        this.wiersz = wiersz;
        this.kolumna = kolumna;
    }

    public char getWiersz() {
        return wiersz;
    }

    public char getKolumna() {
        return kolumna;
    }

    public void postawPionek (Pionek pionek) {
        this.pionek = pionek;
    }

    public Pionek getPionek() {
        return pionek;
    }

    public Pionek zabierzPionekZPola() {
        Pionek p = pionek;
        pionek = null;
        return p;
    }


    @Override
    public String toString() {
        return "Pole[" + "wiersz=" + wiersz +
                         ", kolumna=" + kolumna +
                         ", kolor pionka=" + (pionek != null ? pionek.getKolor() : "NULL") + ']';
    }
}
