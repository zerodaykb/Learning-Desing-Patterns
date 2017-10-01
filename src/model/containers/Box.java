package model.containers;

import model.Customer;
import model.FlowerContainer;

public class Box extends FlowerContainer {

    public Box(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Pudelko wlasciciel " + super.toString();
    }
}
