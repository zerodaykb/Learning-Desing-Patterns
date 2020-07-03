package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

class Zapis {
    static void zapiszDoPliku(Postac postac) {

        try {
            PrintWriter writer = new PrintWriter("postac.txt", "UTF-8");
            writer.println("Rasa: \n" + postac.rasa + "\n");
            writer.println("Profesje: \n" + pobierz(postac.profesje) + "\n");
            writer.println("Zdolności: \n" + pobierz(postac.zdolnosci) + "\n");
            writer.println("Umiejętności: \n" + pobierz(postac.umiejetnosci));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String pobierz(List list) {
        return list.toString();
    }
}
