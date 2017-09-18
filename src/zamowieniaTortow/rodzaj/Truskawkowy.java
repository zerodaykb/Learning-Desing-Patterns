package zamowieniaTortow.rodzaj;

import zamowieniaTortow.Rodzaj;
import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.TruskawkoweSkladniki;
import zamowieniaTortow.torty.TruskawkowyTort;

public class Truskawkowy extends Rodzaj {

    @Override
    public Tort dodajTort(String wielkosc) {
        Skladniki truskawkoweSkladniki = new TruskawkoweSkladniki();
        Tort tort = new TruskawkowyTort(truskawkoweSkladniki);

        switch (wielkosc) {
            case "maly":
                tort.ustawNazwe("Maly truskawkowy tort");
                tort.ustawCene(25);
                break;
            case "sredni":
                tort.ustawNazwe("Sredni truskawkowy tort");
                tort.ustawCene(30);
                break;
            case "duzy":
                tort.ustawNazwe("Duzy truskawkowy tort");
                tort.ustawCene(35);
                break;
        }

        return tort;
    }
}
