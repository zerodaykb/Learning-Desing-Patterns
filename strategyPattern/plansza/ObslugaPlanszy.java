package breakthrough.plansza;

import breakthrough.Kolor;
import breakthrough.RodzajRuchu.RodzajRuchu;

import java.util.List;

public class ObslugaPlanszy {
    private Plansza plansza;

    public ObslugaPlanszy(Plansza plansza) {
        this.plansza = plansza;
    }

    public boolean czyMozliwyRuch(char w, char k, RodzajRuchu rodzajRuchu, Kolor kolorGracza) {
        Pionek pionek = plansza.wskazPolePlanszy(w, k).getPionek();

        if(pionek == null || pionek.getKolor() != kolorGracza) {
            return false;
        }

        return rodzajRuchu.sprawdzCzyMoze(plansza, w, k, kolorGracza);
    }

    public boolean czyBedzieBicie(char w, char k, RodzajRuchu rodzajRuchu, Kolor kolorGracza) {
        Pole poleKoncowe = rodzajRuchu.pobierzPoleWzgledemPola(plansza, w, k, kolorGracza);

        return poleKoncowe.getPionek() != null;
    }

    public void wykonajRuch(char w, char k, RodzajRuchu rodzajRuchu, Kolor kolorGracza) {
        Pole polePoczatkowe = plansza.wskazPolePlanszy(w, k);
        Pionek startowy = polePoczatkowe.zabierzPionekZPola();

        Pole poleKoncowe = rodzajRuchu.pobierzPoleWzgledemPola(plansza, w, k, kolorGracza);
        poleKoncowe.zabierzPionekZPola();

        poleKoncowe.postawPionek(startowy);
        System.out.printf("%c%c -> %c%c\n", k, w, poleKoncowe.getKolumna(), poleKoncowe.getWiersz());

        if(czyKoniec(poleKoncowe, kolorGracza)) {
            System.out.println("Koniec gry, wygrywa: " + kolorGracza);
        }

    }


    private boolean czyKoniec (Pole pole, Kolor koloGracza) {
        return (koloGracza == Kolor.BIALY && pole.getWiersz() == '8') ||
               (koloGracza == Kolor.CZARNY && pole.getWiersz() == '1');
    }

    public List<Pole> pobierzPolaGracza(Kolor kolorGracza) {
        return plansza.pobierzPolaGracza(kolorGracza);
    }

}
