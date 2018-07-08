import MusicShop.Behaviours.ISell;
import MusicShop.Instruments.Drums;
import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.InstrumentFamilyType;
import MusicShop.Instruments.Saxophone;
import MusicShop.Shop.Stock;
import org.junit.Before;

import java.util.ArrayList;

public class StockTest {

    Drums drums;
    Guitar guitar;
    Saxophone saxophone;
    ArrayList<ISell> stock;

    @Before
    public void setUp() {
        drums = new Drums("Drums 3000", InstrumentFamilyType.PERCUSSION, 150, 300);
        guitar = new Guitar("Guitar Hero", InstrumentFamilyType.STRING, 100, 200);
        saxophone = new Saxophone("Saxophone G621", InstrumentFamilyType.BRASS, 80, 150);
        stock = new ArrayList<>();
        stock.add(drums);
        stock.add(guitar);
        stock.add(saxophone);
    }





}
