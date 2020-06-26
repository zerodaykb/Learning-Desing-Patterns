package breakthrough.RodzajRuchu;

import breakthrough.Kolor;
import breakthrough.plansza.Plansza;
import breakthrough.plansza.Pole;

public class RuchWPrawo implements RodzajRuchu {
    @Override
    public boolean sprawdzCzyMoze(Plansza plansza, char w, char k, Kolor kolorGracza) {
        if(kolorGracza == Kolor.BIALY && k == 'h') {
            return false;
        }
        else if(kolorGracza == Kolor.CZARNY && k == 'a') {
            return false;
        }

        Pole pole = pobierzPoleWzgledemPola(plansza, w, k, kolorGracza);
        return pole.getPionek() == null || pole.getPionek().getKolor() != kolorGracza;
    }

    @Override
    public Pole pobierzPoleWzgledemPola(Plansza plansza, char w, char k, Kolor kolorGracza) {
        switch(kolorGracza) {
            case BIALY:
                w++;
                k++;
                break;
            case CZARNY:
                w--;
                k--;
                break;
        }

        return plansza.wskazPolePlanszy(w, k);
    }
}
