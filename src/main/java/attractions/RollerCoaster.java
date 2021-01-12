package attractions;

import people.Visitor;

public class RollerCoaster  extends Attraction {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

//    @Override
//    public double priceFor(Visitor visitor) {
//        if(visitor != null && visitor.getHeight() > 200) {
//        }
//        return (defaultPrice() * 2);
//    }
}
