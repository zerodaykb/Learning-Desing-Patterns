package breakthrough.RodzajRuchu;

import breakthrough.Kolor;
import breakthrough.plansza.Plansza;
import breakthrough.plansza.Pole;

public interface RodzajRuchu {

    boolean sprawdzCzyMoze (Plansza plansza, char w, char k, Kolor kolorGracza);
    Pole pobierzPoleWzgledemPola(Plansza plansza, char w, char k, Kolor kolorGracza);

}
