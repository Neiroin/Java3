package by.it.krukovich.Plane;

import by.it.krukovich.Plane.Plane;

public class PlaneMilit extends Plane {



    public PlaneMilit(int nlenght, int nweight, int nid, int nmaxrange, String nmodel)
    {
        lenght=nlenght;
        weight=nweight;
        id=nid;
        max_range=nmaxrange;
        model=nmodel;

    }

    @Override
    public String toString() {
        return "PlaneMilit{" +
                ", lenght=" + lenght +
                ", weight=" + weight +
                ", id=" + id +
                ", max_range=" + max_range +
                ", model='" + model + '\'' +
                '}';
    }
}
