package breakthrough.rodzajGracza;

import breakthrough.Kolor;
import breakthrough.plansza.ObslugaPlanszy;

public class GraczCzlowiek implements SRodzajGracza {

    @Override
    public void zagrajWSwoimStylu(ObslugaPlanszy obslugaPlanszy, Kolor kolor) {
        System.out.println("Sam podaj ruch.");
    }
}
