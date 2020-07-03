package model;

public abstract class Flower {
    protected Integer quantity;
    protected String color;
    protected String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        PriceList pl = PriceList.getInstance();
        Double cena = pl.getCennik().get(name);
        if(cena == null) {
            cena = -1.0;
        }

        return name +
                ", kolor: " + color +
                ", ilość " + quantity +
                ", cena " + cena;
    }
}
