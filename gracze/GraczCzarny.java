package breakthrough.gracze;

import breakthrough.Kolor;
import breakthrough.rodzajGracza.GraczCzlowiek;

public class GraczCzarny extends Gracz {
    public GraczCzarny() {
        strategiaRodzajGracza = new GraczCzlowiek();
        kolorGracza = Kolor.CZARNY;
    }
}
