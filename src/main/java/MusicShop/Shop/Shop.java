package MusicShop.Shop;

import MusicShop.Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    protected Stock stockItems;
    protected double tillBalance;

    public Shop(Stock stockItems, double tillBalance){
        this.stockItems = stockItems;
        this.tillBalance = tillBalance;
    }

    public double getTillBalance(){
        return this.tillBalance;
    }


}
