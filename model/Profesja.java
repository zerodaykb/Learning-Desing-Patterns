package model;

public abstract class Profesja extends Postac {

    protected Profesja(Postac postac) throws Exception {
        if(postac.profesje.size() >= 2) {
            throw new Exception("Próba dodania więcej niż 2 profesji.");
        }

        rasa = postac.rasa;
        zdolnosci = postac.zdolnosci;
        umiejetnosci = postac.umiejetnosci;
        profesje = postac.profesje;
    }
}
