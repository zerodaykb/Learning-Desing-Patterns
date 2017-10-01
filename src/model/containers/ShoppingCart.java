package model.containers;

import model.Customer;
import model.FlowerContainer;

public class ShoppingCart extends FlowerContainer {

    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Wozek wlasciciel " + super.toString();
    }
}
