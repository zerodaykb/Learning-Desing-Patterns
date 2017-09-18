package zamowieniaTortow;

import zamowieniaTortow.rodzaj.Czekoladowy;
import zamowieniaTortow.rodzaj.Kawowy;
import zamowieniaTortow.rodzaj.Truskawkowy;

public abstract class Rodzaj {
    static Rodzaj wybierzRodzaj(String rodzajTortu) {
        Rodzaj rodzaj = null;

        switch(rodzajTortu) {
            case "czekoladowy":
                rodzaj = new Czekoladowy();
                break;
            case "kawowy":
                rodzaj = new Kawowy();
                break;
            case "truskawkowy":
                rodzaj = new Truskawkowy();
                break;
        }
        return rodzaj;
    }

    protected abstract Tort dodajTort(String wielkosc);
}
