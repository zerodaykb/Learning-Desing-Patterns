package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Postac {
    public String rasa;
    public List<Zdolnosc> zdolnosci = new ArrayList<>();
    public List<Umiejetnosc> umiejetnosci = new ArrayList<>();
    public List<String> profesje = new ArrayList<>();

}
