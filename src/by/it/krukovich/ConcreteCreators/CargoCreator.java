package by.it.krukovich.ConcreteCreators;

import by.it.krukovich.Absctract.Creator;
import by.it.krukovich.Plane.PlaneCargo;
import  org.apache.log4j.Logger;


public class CargoCreator extends Creator {

    public PlaneCargo getPlane(int lenght, int weight, int id, int max_range, String model)
    {
        Logger.getLogger(CargoCreator.class).info("Cargo plane created ");
        return new PlaneCargo(lenght, weight, id, max_range, model);
    }
}
