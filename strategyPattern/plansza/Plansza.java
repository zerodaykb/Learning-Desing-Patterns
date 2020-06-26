package breakthrough.plansza;

import breakthrough.Kolor;

import java.util.ArrayList;
import java.util.List;

public class Plansza {
    private Pole[][] polaPlanszy;

    public Plansza(char[] wiersze, char[] kolumny) {
        this.polaPlanszy = new Pole[wiersze.length][kolumny.length];
        przypiszPolaDoPlanszy(wiersze, kolumny);
    }

    private void przypiszPolaDoPlanszy(char[] wiersze, char[] kolumny) {
        for(int w = 0; w < wiersze.length; w++) {
            for(int k = 0; k < kolumny.length; k++) {
                polaPlanszy[w][k] = new Pole(wiersze[w], kolumny[k]);
            }
        }
    }

    public Pole wskazPolePlanszy(char znakWiersza, char znakKolumny) {
        for(Pole[] wiersz: polaPlanszy) {
            for(Pole pole: wiersz) {
                if(pole.getWiersz() == znakWiersza && pole.getKolumna() == znakKolumny) {
                    return pole;
                }
            }
        }
        return null;
    }

    public void wyswietlPlansze() {
        for(Pole[] wiersz: polaPlanszy) {
            for(Pole pole: wiersz) {
                System.out.println(pole);
            }
        }
    }

    public List<Pole> pobierzPolaGracza(Kolor kolorGracza) {
        List<Pole> pola = new ArrayList<>();

        for (Pole[] wiersz: polaPlanszy) {
            for(Pole pole: wiersz) {
                if(pole.getPionek() != null && pole.getPionek().getKolor() == kolorGracza) {
                    pola.add(pole);
                }
            }
        }
        return pola;
    }
}
