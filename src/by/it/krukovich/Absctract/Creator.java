package by.it.krukovich.Absctract;

import by.it.krukovich.Plane.Plane;

public abstract class Creator {

    abstract public Plane getPlane(int leght, int weight, int id, int max_range, String model);
}
