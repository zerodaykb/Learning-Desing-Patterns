package model;

import model.containers.Box;
import model.containers.ShoppingCart;
import model.flowers.Freesia;
import model.flowers.Lilac;
import model.flowers.Peony;
import model.flowers.Rose;

public class FloristTest {
    private static Double valueOf(Box box, String color) {
        Double sum = 0.0;

        for (Flower flower: box.getFlowers()) {
            if(flower.getColor().equals(color)) {
                PriceList pl = PriceList.getInstance();

                sum += pl.getCennik().get(flower.getName()) * flower.getQuantity();
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        // tu definicja metody valueOf(Box pudelko, String kolor) zwracającej
        // sumaryczną wartość kwiatów o podanym kolorzez, znajdujących się w pudełku

        // Kwiaciarnia samoobsługowa
        Florist kwiaciarnia = new Florist();

        // Przychodzi klient janek. Ma 200 zł
        Customer janek = new Customer("Janek", 200.0);

        // Bierze różne kwiaty: 5 róż, 5 piwonii, 3 frezje, 3 bzy
        janek.get(new Rose(5));
        janek.get(new Peony(5));
        janek.get(new Freesia(3));
        janek.get(new Lilac(3));

        // Pewnie je umieścił na wózku sklepowyem
        // Zobaczmy co tam ma
        ShoppingCart wozekJanka = janek.getShoppingCart();
        System.out.println("Przed płaceniem\n" + wozekJanka);

        // Teraz za to zapłaci...
        janek.pay();

        // Czy przypadkiem przy płaceniu nie okazało się,
        // że w wozku są kwiaty na które nie ustalono jescze cceny?
        // W takim razie zostałyby usunięte z wózka i Janek nie płaciłby za nie

        System.out.println("Po zapłaceniu\n" + janek.getShoppingCart());

        // Ile Jankowi zostało pieniędzy?
        System.out.println("Jankowi zostało : " + janek.getCash() + " zł");

        // Teraz jakos zapakuje kwiaty (może do pudełka)
        Box pudelkoJanka = new Box(janek);
        janek.pack(pudelkoJanka);

        // Co jest teraz w wózku Janka...
        // (nie powinno już nic być)
        System.out.println("Po zapakowaniu do pudełka\n" + janek.getShoppingCart());

        // a co w pudełku:
        System.out.println(pudelkoJanka);

        // Zobaczmy jaka jest wartość czerwonych kwiatów w pudełku Janka
        System.out.println("Czerwone kwiaty w pudełku Janka kosztowały: " +
                valueOf(pudelkoJanka, "czerwony"));

        // Teraz przychodzi Stefan
        // ma tylko 60 zł
        Customer stefan = new Customer("Stefan", 60.0);

        // ąle nabrał kwiatów nieco za dużo jak na tę sumę
        stefan.get(new Lilac(3));
        stefan.get(new Rose(5));

        // co ma w wózku
        System.out.println(stefan.getShoppingCart());

        // płaci i pakuje do pudełka
        stefan.pay();
        Box pudelkoStefana = new Box(stefan);
        stefan.pack(pudelkoStefana);

        // co ostatecznie udało mu się kupić
        System.out.println(pudelkoStefana);
        // ... i ile zostało mu pieniędzy
        System.out.println("Stefanowi zostało : " + stefan.getCash() + " zł");
    }
}
