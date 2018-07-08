package Shop.Instruments;

import Shop.Behaviours.ISell;
import Shop.Instruments.Instrument;
import Shop.Instruments.InstrumentFamilyType;

public class Guitar extends Instrument implements ISell {

    double costPrice;
    double sellPrice;

    public Guitar(String name, InstrumentFamilyType family, double costPrice, double sellPrice){
        super(name, family);
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
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
