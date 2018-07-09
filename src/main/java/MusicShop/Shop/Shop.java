package MusicShop.Shop;

import MusicShop.Behaviours.ISell;
import MusicShop.Instruments.Drums;

import java.util.ArrayList;

public class Shop {

    protected Stock stockItems;
    protected double tillBalance;
    private Stock stock;

    public Shop(Stock stockItems, double tillBalance){
        this.stockItems = stockItems;
        this.tillBalance = tillBalance;
    }

    public double getTillBalance(){
        return this.tillBalance;
    }


    public void sellItem(ISell item) {
        tillBalance += item.getSellPrice();
    }
}
