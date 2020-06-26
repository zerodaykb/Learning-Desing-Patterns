package breakthrough.rodzajGracza;

import breakthrough.Kolor;
import breakthrough.plansza.ObslugaPlanszy;
import breakthrough.plansza.Pole;

import breakthrough.RodzajRuchu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraczKomputerLosowy implements SRodzajGracza {

    @Override
    public void zagrajWSwoimStylu(ObslugaPlanszy obslugaPlanszy, Kolor kolorGracza) {
        List<Pole> polaGracza = obslugaPlanszy.pobierzPolaGracza(kolorGracza);

        List<Pole> polaMozliwe = new ArrayList<>();
        List<RodzajRuchu> ruchyMozliwe = new ArrayList<>();

        for (Pole pole: polaGracza) {
            char w = pole.getWiersz();
            char k = pole.getKolumna();

            RodzajRuchu[] rodzaje = { new RuchWLewo(), new RuchWPrawo(), new RuchDoPrzodu() };

            for (RodzajRuchu rodzaj: rodzaje) {
                if(obslugaPlanszy.czyMozliwyRuch(w, k, rodzaj, kolorGracza)) {
                    polaMozliwe.add(pole);
                    ruchyMozliwe.add(rodzaj);
                }
            }
        }

        int random = new Random().nextInt(polaMozliwe.size());

        Pole wylosowane = polaMozliwe.get(random);
        RodzajRuchu rodzajRuchu = ruchyMozliwe.get(random);

        char w = wylosowane.getWiersz();
        char k = wylosowane.getKolumna();

        obslugaPlanszy.wykonajRuch(w, k, rodzajRuchu, kolorGracza);
    }
}
