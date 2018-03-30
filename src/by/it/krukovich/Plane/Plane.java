package by.it.krukovich.Plane;

import by.it.krukovich.Absctract.Creator;

public abstract class Plane {


    public int lenght;


        public void setLenght ( int nlenght)
        {
            lenght = nlenght;
        }



    public int getLenght()
    {
        return lenght;
    }

    public int weight;

    public void setWeight(int nweight)
    {
        weight=nweight;
    }

    public int getWeight()
    {
        return weight;
    }

    public int id;

    public void setId(int nid)
    {
        id=nid;
    }

    public int getId()
    {
        return id;
    }
    public Integer max_range;

    public void setMax_range(int nmaxrange)
    {
        max_range=nmaxrange;
    }

    public int getMax_range()
    {
        return max_range;
    }

    public String model;

    public void setModel(String nmodel)
    {
        model=nmodel;
    }
    public String getModel()
    {
        return model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "lenght=" + lenght +
                ", weight=" + weight +
                ", id=" + id +
                ", max_range=" + max_range +
                ", model='" + model + '\'' +
                '}';
    }
}
