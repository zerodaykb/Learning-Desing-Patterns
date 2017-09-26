package zamowieniaTortow;


public class ZamowienieTest {
    public static void main(String[] args) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajAdres("odbior osobisty");

        zamowienie.dodajTorty("czekoladowy", 2, "maly");
        zamowienie.dodajTorty("kawowy", 1, "duzy");
        zamowienie.dodajTorty("malinowy", 1, "sredni");

        zamowienie.wyswietlZamowienie();

    }
}
