package by.it.krukovich.ConcreteCreators;

import by.it.krukovich.Absctract.Creator;
import by.it.krukovich.Plane.PlaneMilit;

import org.apache.log4j.Logger;

public class MilitCreator extends Creator {

    public PlaneMilit getPlane(int lenght, int weight, int id, int max_range, String model)
    {
        Logger.getLogger(MilitCreator.class).info("Military plane created");
        return new PlaneMilit(lenght, weight, id, max_range, model);
    }
}
