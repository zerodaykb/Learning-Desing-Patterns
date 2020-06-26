package breakthrough;

import breakthrough.gracze.Gracz;
import breakthrough.plansza.ObslugaPlanszy;
import breakthrough.plansza.Plansza;

public class Gra {
    private Plansza plansza;

    public Gra(Gracz graczBialy, Gracz graczCzarny) {
        this.plansza = new Plansza(Config.znakiWiersza, Config.znakiKolumn);

        przypiszPionki(graczCzarny, Config.wierszePoczatkoweCzarnego, Config.kolumnyPoczatkoweCzarnego, Kolor.CZARNY);
        przypiszPionki(graczBialy, Config.wierszePoczatkoweBialego, Config.kolumnyPoczatkoweBialego, Kolor.BIALY);

        graczBialy.setObslugaPlanszy(new ObslugaPlanszy(plansza));
        graczCzarny.setObslugaPlanszy(new ObslugaPlanszy(plansza));
    }

    private void przypiszPionki(Gracz gracz, char[] wiersze, char[] kolumny, Kolor kolor) {
        gracz.wezPionki(wiersze.length * kolumny.length, kolor);
        gracz.rozstawPionki(wiersze, kolumny, plansza);
    }
}
