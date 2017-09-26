package zamowieniaTortow;

import zamowieniaTortow.skladniki.*;
import zamowieniaTortow.torty.*;

import java.util.HashMap;
import java.util.Map;

import static zamowieniaTortow.Smak.*;

public abstract class Tort {
    protected Skladniki skladniki;
    protected Map<String, Integer> ceny = new HashMap<>();

    protected String nazwa;
    protected Integer cena;

    protected GlownySkladnik glownySkladnik;
    protected Krem krem;
    protected Biszkopt biszkopt;

    protected void ustawNazwe(String nazwa) {
        this.nazwa = nazwa;
    }

    protected void ustawCene(Integer cena) {
        this.cena = cena;
    }

    public Integer pobierzCene() {
        return cena;
    }

    public static Tort dodajTort(String smak, String wielkosc) {
        Tort tort = null;

        switch(smak) {
            case CZEKOLADOWY:
                tort = new Czekoladowy();
                break;
            case KAWOWY:
                tort = new Kawowy();
                break;
            case TRUSKAWKOWY:
                tort = new Truskawkowy();
                break;
        }

        tort.przygotuj(wielkosc, smak);
        return tort;
    }

    protected void przygotuj(String wielkosc, String smak) {
        dodajSkladniki();
        cena = ceny.get(wielkosc);
        nazwa = wielkosc + " " + smak;
    };

    protected abstract void dodajSkladniki();

    @Override
    public String toString() {
        return "Tort{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", glownySkladnik=" + glownySkladnik +
                ", krem=" + krem +
                ", biszkopt=" + biszkopt +
                '}';
    }
}
