package Shop.Instruments;

import Shop.Instruments.Instrument;
import Shop.Instruments.InstrumentFamilyType;

public class Drums extends Instrument {

    public Drums(String name, InstrumentFamilyType family, int costPrice, int sellPrice){
        super(name, family, costPrice, sellPrice);
    }

    @Override
    public String makeSound(){
        return "Drums Noise";
    }

}
