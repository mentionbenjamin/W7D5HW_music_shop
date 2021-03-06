package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Guitar extends Instrument implements ISell {

    public Guitar(String name, InstrumentFamilyType family, double costPrice, double sellPrice){
        super(name, family, costPrice, sellPrice);
    }

    @Override
    public String makeSound(){
        return "Guitar Noise";
    }

    @Override
    public double getSellPrice(){
        return this.sellPrice;
    }

    @Override
    public double getCostPrice(){
        return this.costPrice;
    }

    @Override
    public double calculateMarkup(){
        return sellPrice - costPrice;
    }

}
