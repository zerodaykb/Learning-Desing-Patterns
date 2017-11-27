package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Zapis {
    public static String pobierz(List list) {
        return list.toString();
    }

    static void zapiszDoPliku(Postac postac) {

        try {
            PrintWriter writer = new PrintWriter("postac.txt", "UTF-8");
            writer.println(pobierz(postac.drzewoKlas));
            writer.println(pobierz(postac.zdolnosci));
            writer.println(pobierz(postac.umiejetnosci));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
