package model;

import java.io.IOException;
import java.io.PrintWriter;

public class Zapis {
    static void zapiszDoPliku(Postac postac) {

        try {
            PrintWriter writer = new PrintWriter("postac.txt", "UTF-8");
            writer.println(postac.getClass().getSimpleName());
            writer.println(postac.pobierzUmiejetnosci());
            writer.println(postac.pobierzZdolnosci());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
