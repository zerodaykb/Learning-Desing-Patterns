package zamowieniaTortow;

import static zamowieniaTortow.Wielkosc.*;

public class ZamowienieTest {
    public static void main(String[] args) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajAdres("odbior osobisty");

        zamowienie.dodajTorty("czekoladowy", 2, MALY);
        zamowienie.dodajTorty("kawowy", 1, DUZY);
        zamowienie.dodajTorty("truskawkowy", 1, SREDNI);

        zamowienie.wyswietlZamowienie();

    }
}
