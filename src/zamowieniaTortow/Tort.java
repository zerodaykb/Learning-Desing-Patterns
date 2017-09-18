package zamowieniaTortow;

import zamowieniaTortow.skladniki.Biszkopt;
import zamowieniaTortow.skladniki.GlownySkladnik;
import zamowieniaTortow.skladniki.Krem;

public abstract class Tort {

    private String nazwa;
    private Integer cena;

    protected GlownySkladnik glownySkladnik;
    protected Krem krem;
    protected Biszkopt biszkopt;

    public void ustawNazwe(String nazwa) {
        this.nazwa = nazwa;
    }

    public void ustawCene(Integer cena) {
        this.cena = cena;
    }

    public Integer pobierzCene() {
        return cena;
    }

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
