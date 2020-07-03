package model;

import java.util.HashMap;
import java.util.Map;

class PriceList {
    private static PriceList priceList = new PriceList();
    private Map<String, Double> cennik = new HashMap<>();

    private PriceList() {}

    static PriceList getInstance()  {
        return priceList;
    }

    public void set(String flowerName, Double price) {
        cennik.put(flowerName, price);
    }

    public Map<String, Double > getCennik() {
        return cennik;
    }
}
