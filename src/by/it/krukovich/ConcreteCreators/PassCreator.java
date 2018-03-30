package by.it.krukovich.ConcreteCreators;

import by.it.krukovich.Absctract.Creator;
import by.it.krukovich.Plane.PlanePass;
import org.apache.log4j.Logger;
public class PassCreator extends Creator {

    public PlanePass getPlane(int lenght, int weight, int id, int max_range, String model)
    {
        Logger.getLogger(PassCreator.class).info("Passenger plane created ");
        return new PlanePass(lenght, weight, id, max_range, model);
    }
}
