package breakthrough.gracze;

import breakthrough.Kolor;
import breakthrough.rodzajGracza.GraczCzlowiek;

public class GraczBialy extends Gracz {
    public GraczBialy() {
        strategiaRodzajGracza = new GraczCzlowiek();
        kolorGracza = Kolor.BIALY;
    }
}
