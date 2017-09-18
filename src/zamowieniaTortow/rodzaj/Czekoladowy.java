package zamowieniaTortow.rodzaj;

import zamowieniaTortow.Rodzaj;
import zamowieniaTortow.Tort;
import zamowieniaTortow.skladniki.rodzajeSkladnikow.CzekoladoweSkladniki;
import zamowieniaTortow.skladniki.Skladniki;
import zamowieniaTortow.torty.CzekoladowyTort;

public class Czekoladowy extends Rodzaj {

    @Override
    protected Tort dodajTort(String wielkosc) {
        Skladniki skladniki = new CzekoladoweSkladniki();
        Tort tort = new CzekoladowyTort(skladniki);

        switch (wielkosc) {
            case "maly":
                tort.ustawNazwe("Maly czekoladowy tort");
                tort.ustawCene(20);
                break;
            case "sredni":
                tort.ustawNazwe("Sredni czekoladowy tort");
                tort.ustawCene(25);
                break;
            case "duzy":
                tort.ustawNazwe("Duzy czekoladowy tort");
                tort.ustawCene(30);
                break;
        }

        return tort;
    }
}
