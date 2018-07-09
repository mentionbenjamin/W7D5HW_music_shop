import MusicShop.Shop.Shop;
import MusicShop.Behaviours.ISell;
import MusicShop.Instruments.Drums;
import MusicShop.Instruments.Guitar;
import MusicShop.Instruments.InstrumentFamilyType;
import MusicShop.Instruments.Saxophone;
import MusicShop.Shop.Stock;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Stock stock;
    Drums drums;
    Guitar guitar;
    Saxophone saxophone;
    ArrayList<ISell> stockItems;

    @Before
    public void setUp() {
        drums = new Drums("Drums 3000", InstrumentFamilyType.PERCUSSION, 150, 300);
        guitar = new Guitar("Guitar Hero", InstrumentFamilyType.STRING, 100, 200);
        saxophone = new Saxophone("Saxophone G621", InstrumentFamilyType.BRASS, 80, 150);
        stockItems = new ArrayList<>();
        stockItems.add(drums);
        stockItems.add(guitar);

        stock = new Stock(stockItems);
        shop = new Shop(stock,1000);
    }

    @Test
    public void hasStock() {
        assertEquals(2, stock.getStockItems());
    }

    @Test
    public void hasTillBalance() {
        assertEquals(1000, shop.getTillBalance(), 0);
    }

    @Test
    public void canSellItem(){
        shop.sellItem(drums);
        assertEquals(1300.0, shop.getTillBalance(), 0);
    }

}