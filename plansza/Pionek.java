package breakthrough.plansza;

import breakthrough.Kolor;

public class Pionek {
    private Kolor kolor;

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;
    }

    public Kolor getKolor() {
        return kolor;
    }

    @Override
    public String toString() {
        return "Pionek[" +
                "kolor=" + kolor +
                ']';
    }
}
