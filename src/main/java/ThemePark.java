import attractions.Attraction;
import behaviours.IReviewed;
import org.w3c.dom.Attr;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> attractionsAndStalls;

    public ThemePark(){
        this.attractionsAndStalls = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.attractionsAndStalls;
    }

    public int attractionAndStallCount(){
        return this.attractionsAndStalls.size();
    }

    public void addAttractionOrStall(IReviewed attractionOrStall){
        this.attractionsAndStalls.add(attractionOrStall);
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }
}
