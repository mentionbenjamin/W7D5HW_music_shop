package Shop.Instruments;

import Shop.Instruments.Instrument;
import Shop.Instruments.InstrumentFamilyType;

public class Guitar extends Instrument {

    public Guitar(String name, InstrumentFamilyType family, int costPrice, int sellPrice){
        super(name, family, costPrice, sellPrice);
    }

    @Override
    public String makeSound(){
        return "Guitar Noise";
    }

}
