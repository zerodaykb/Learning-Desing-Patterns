package breakthrough.gracze;

import breakthrough.Kolor;
import breakthrough.plansza.Pionek;
import breakthrough.plansza.Plansza;
import breakthrough.RodzajRuchu.RodzajRuchu;
import breakthrough.rodzajGracza.SRodzajGracza;
import breakthrough.plansza.ObslugaPlanszy;

abstract public class Gracz {
    protected SRodzajGracza strategiaRodzajGracza;

    protected Kolor kolorGracza;
    private Pionek[] pionki;
    private ObslugaPlanszy obslugaPlanszy;

    public void setStrategiaRodzajGracza(SRodzajGracza strategiaRodzajGracza) {
        this.strategiaRodzajGracza = strategiaRodzajGracza;
    }

    public void zagraj() {
        strategiaRodzajGracza.zagrajWSwoimStylu(obslugaPlanszy, kolorGracza);
    }

    public void setObslugaPlanszy(ObslugaPlanszy obslugaPlanszy) {
        this.obslugaPlanszy = obslugaPlanszy;
    }

    public void wezPionki(int ilosc, Kolor kolor) {
        pionki = new Pionek[ilosc];
        for (int i = 0; i < pionki.length; i++) {
            pionki[i] = new Pionek();
            pionki[i].setKolor(kolor);
        }
    }

    public void rozstawPionki(char[] wiersze, char[] kolumny, Plansza plansza) {
        int numerPionka = 0;

        for (char aWiersze : wiersze) {
            for (char aKolumny : kolumny) {
                plansza.wskazPolePlanszy(aWiersze, aKolumny).postawPionek(pionki[numerPionka++]);
            }
        }
    }

    public void poruszPionek(char wiersz, char kolumna, RodzajRuchu rodzajRuchu) {
        if(!obslugaPlanszy.czyMozliwyRuch(wiersz, kolumna, rodzajRuchu, kolorGracza)) {
            System.out.println("Ruch niemozliwy");
            return;
        }

        obslugaPlanszy.wykonajRuch(wiersz, kolumna, rodzajRuchu, kolorGracza);
    }

}
