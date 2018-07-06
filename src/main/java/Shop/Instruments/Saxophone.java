package Shop.Instruments;

import Shop.Instruments.Instrument;
import Shop.Instruments.InstrumentFamilyType;

public class Saxophone extends Instrument {

    public Saxophone(String name, InstrumentFamilyType family, int costPrice, int sellPrice){
        super(name, family, costPrice, sellPrice);
    }

    @Override
    public String makeSound(){
        return "Sax Noise";
    }

}
