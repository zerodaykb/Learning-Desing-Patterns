package model;

import model.containers.Box;
import model.containers.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private Double cash;
    private ShoppingCart shoppingCart = new ShoppingCart(this);

    public Customer(String name, Double cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void get(Flower flower) {
        shoppingCart.addFlower(flower);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void pack(Box box) {
        if(box.getCustomer().equals(this)) {
            for (Flower flower: shoppingCart.getFlowers()) {
                box.addFlower(flower);
            }
        }

        shoppingCart.replaceFlowers(new ArrayList<>());
    }

    public Double getCash() {
        return cash;
    }

    public void pay() {
        PriceList pl = PriceList.getInstance();
        ShoppingCart shoppingCart = getShoppingCart();

        List<Flower> flowers = shoppingCart.getFlowers();
        List<Flower> validFlowers = new ArrayList<>();

        for (Flower flower: flowers) {
            String flowerName = flower.getName();

            if(pl.getCennik().containsKey(flowerName)) {
                Double nextPrice = pl.getCennik().get(flowerName) * flower.getQuantity();

                if(cash >= nextPrice) {
                    cash -= nextPrice;
                }

                validFlowers.add(flower);
            }
        }

        shoppingCart.replaceFlowers(validFlowers);
    }
}
