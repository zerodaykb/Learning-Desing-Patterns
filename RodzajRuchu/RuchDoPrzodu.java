package breakthrough.RodzajRuchu;

import breakthrough.Kolor;
import breakthrough.plansza.Plansza;
import breakthrough.plansza.Pole;

public class RuchDoPrzodu implements RodzajRuchu {

    @Override
    public boolean sprawdzCzyMoze(Plansza plansza, char w, char k, Kolor kolorGracza) {
        Pole pole = pobierzPoleWzgledemPola(plansza, w, k, kolorGracza);
        return pole.getPionek() == null;
    }

    @Override
    public Pole pobierzPoleWzgledemPola(Plansza plansza, char w, char k, Kolor kolorGracza) {
        switch(kolorGracza) {
            case BIALY:
                w++;
                break;
            case CZARNY:
                w--;
                break;
        }

        return plansza.wskazPolePlanszy(w, k);
    }
}
