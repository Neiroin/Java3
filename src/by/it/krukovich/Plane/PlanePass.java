package by.it.krukovich.Plane;

import by.it.krukovich.Plane.Plane;

public class PlanePass extends Plane {

    @Override
    public String toString() {
        return "PlanePass{" +
                ", lenght=" + lenght +
                ", weight=" + weight +
                ", id=" + id +
                ", max_range=" + max_range +
                ", model='" + model + '\'' +
                '}';
    }


    public PlanePass(int nlenght, int nweight, int nid, int nmaxrange, String nmodel)
    {
        lenght=nlenght;
        weight=nweight;
        id=nid;
        max_range=nmaxrange;
        model=nmodel;

    }


}
