package model;

// Klasa "kwiaciarnia"
class Florist {

    public Florist() {
        // Ustalenie cennika
        PriceList pl = PriceList.getInstance();
        pl.set("rose", 10.0);
        pl.set("lilac", 12.0);
        pl.set("peony", 8.0);
    }

}