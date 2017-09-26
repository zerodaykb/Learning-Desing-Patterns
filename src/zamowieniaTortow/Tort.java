package zamowieniaTortow;

import zamowieniaTortow.skladniki.*;
import zamowieniaTortow.torty.*;

public abstract class Tort {

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
            case "czekoladowy":
                tort = new Czekoladowy();
                break;
            case "kawowy":
                tort = new Kawowy();
                break;
            case "truskawkowy":
                tort = new Truskawkowy();
                break;
            case "malinowy":
                tort = new Malinowy();
                break;
        }

        tort.przygotuj(wielkosc, smak);
        return tort;
    }

    protected abstract void przygotuj(String wielkosc, String smak);
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
