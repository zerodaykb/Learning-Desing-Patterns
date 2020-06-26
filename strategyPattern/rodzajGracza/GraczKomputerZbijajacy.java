package breakthrough.rodzajGracza;

import breakthrough.Kolor;
import breakthrough.plansza.ObslugaPlanszy;
import breakthrough.plansza.Pole;
import breakthrough.RodzajRuchu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraczKomputerZbijajacy implements SRodzajGracza {

    @Override
    public void zagrajWSwoimStylu(ObslugaPlanszy obslugaPlanszy, Kolor kolorGracza) {
        List<Pole> polaGracza = obslugaPlanszy.pobierzPolaGracza(kolorGracza);

        List<Pole> polaMozliweDoBicia = new ArrayList<>();
        List<RodzajRuchu> ruchyDoBicia = new ArrayList<>();
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

                    if(obslugaPlanszy.czyBedzieBicie(w, k, rodzaj, kolorGracza)) {
                        polaMozliweDoBicia.add(pole);
                        ruchyDoBicia.add(rodzaj);
                    }
                }
            }
        }


        Pole wylosowane;
        RodzajRuchu rodzajRuchu;

        if(polaMozliweDoBicia.size() != 0) {
            int random = new Random().nextInt(polaMozliweDoBicia.size());
            wylosowane = polaMozliweDoBicia.get(random);
            rodzajRuchu = ruchyDoBicia.get(random);
        }
        else {
            int random = new Random().nextInt(polaMozliwe.size());
            wylosowane = polaMozliwe.get(random);
            rodzajRuchu = ruchyMozliwe.get(random);
        }

        char w = wylosowane.getWiersz();
        char k = wylosowane.getKolumna();

        obslugaPlanszy.wykonajRuch(w, k, rodzajRuchu, kolorGracza);
    }
}
