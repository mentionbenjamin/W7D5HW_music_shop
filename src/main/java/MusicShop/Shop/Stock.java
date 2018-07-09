package MusicShop.Shop;

import MusicShop.Behaviours.ISell;

import java.util.ArrayList;
import java.util.BitSet;

public class Stock {

    protected ArrayList<ISell> stockItems;

    public Stock(ArrayList<ISell> stockItems){
        this.stockItems = stockItems;
    }

    public int getStockItems() {
        return this.stockItems.size();
    }

    public void addStock(ISell item){
        stockItems.add(item);
    }

}

