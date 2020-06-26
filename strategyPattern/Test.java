package breakthrough;

import breakthrough.RodzajRuchu.*;
import breakthrough.gracze.*;
import breakthrough.rodzajGracza.*;

public class Test {
    public static void main(String[] args) {

        Gracz graczBialy = new GraczBialy();
        Gracz graczCzarny = new GraczCzarny();

        Gra gra = new Gra(graczBialy, graczCzarny);

        graczBialy.poruszPionek('2','g', new RuchDoPrzodu());
        graczBialy.poruszPionek('3','g', new RuchDoPrzodu());
        graczBialy.poruszPionek('4','g', new RuchDoPrzodu());
        graczBialy.poruszPionek('5','g', new RuchDoPrzodu());


        graczCzarny.setStrategiaRodzajGracza(new GraczKomputerLosowy());
        graczCzarny.zagraj();

        graczCzarny.setStrategiaRodzajGracza(new GraczKomputerZbijajacy());
        graczCzarny.zagraj();

    }
}
