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

public class StockTest {

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
    }

    @Test
    public void hasStock(){
        assertEquals(2, stock.getStockItems());
    }

    @Test
    public void canAddToStock(){
        stock.addStock(saxophone);
        assertEquals(3, stock.getStockItems());
    }

    @Test
    public void canRemoveFromStock(){
        stock.removeStock(guitar);
        assertEquals(1, stock.getStockItems());
    }

    @Test
    public void canGetTotalValueAtCostPrice(){
        assertEquals(250.0, stock.getTotalValueAtCostPrice(), 0.01);
    }

    @Test
    public void canGetTotalValueAtSellPrice(){
        assertEquals(500.0, stock.getTotalValueAtSellPrice(), 0.01);
    }

    @Test
    public void canGetTotalProfit(){
        assertEquals(250.0, stock.getTotalProfit(), 0.01);
    }

}
