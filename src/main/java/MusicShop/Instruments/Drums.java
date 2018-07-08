package MusicShop.Instruments;

import MusicShop.Behaviours.ISell;

public class Drums extends Instrument implements ISell {

    public Drums(String name, InstrumentFamilyType family, double costPrice, double sellPrice){
        super(name, family, costPrice, sellPrice);
    }

    @Override
    public String makeSound(){
        return "Drums Noise";
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
