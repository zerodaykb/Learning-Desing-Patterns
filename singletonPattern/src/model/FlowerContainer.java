package model;

import java.util.ArrayList;
import java.util.List;

public abstract class FlowerContainer {
    protected Customer customer;
    protected List<Flower> flowers = new ArrayList<>();

    public Customer getCustomer() {
        return customer;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void replaceFlowers(List<Flower> newFlowers) {
        flowers = newFlowers;
    }

    @Override
    public String toString() {
        return customer.getName() + "\n"
                + (!flowers.isEmpty() ? flowers : "pusto");
    }
}