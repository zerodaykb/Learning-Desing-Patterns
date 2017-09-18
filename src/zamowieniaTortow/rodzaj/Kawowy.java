package zamowieniaTortow.rodzaj;

import zamowieniaTortow.Rodzaj;
import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.KawoweSkladniki;
import zamowieniaTortow.torty.KawowyTort;

public class Kawowy extends Rodzaj {

    @Override
    public Tort dodajTort(String wielkosc) {
        Skladniki kawoweSkladniki = new KawoweSkladniki();
        Tort tort = new KawowyTort(kawoweSkladniki);

        switch (wielkosc) {
            case "maly":
                tort.ustawNazwe("Maly kawowy tort");
                tort.ustawCene(22);
                break;
            case "sredni":
                tort.ustawNazwe("Sredni kawowy tort");
                tort.ustawCene(27);
                break;
            case "duzy":
                tort.ustawNazwe("Duzy kawowy tort");
                tort.ustawCene(32);
                break;
        }

        return tort;
    }
}
