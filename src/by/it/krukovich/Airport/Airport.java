package by.it.krukovich.Airport;

import by.it.krukovich.Plane.Plane;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Airport {

    public ArrayList<Plane> getAirlist() {
        return airlist;
    }

    public void setAirlist(ArrayList<Plane> airlist) {
        this.airlist = airlist;
    }

    public ArrayList<Plane> airlist;

    public Airport(String nname)
    {
    airlist= new ArrayList<Plane>();
    name=nname;
        Logger.getLogger(Airport.class).info("Airport "+this.name+" was created");
    }

    String name;

    public void Add(Plane plane)
    {
        airlist.add(plane);
        Logger.getLogger(Airport.class).info(plane.model+" added into the airport "+name);
    }
    public void Show()
    {
        for(Plane pl : airlist)
        {
            System.out.println("Plane id: "+pl.id+" lenght: "+pl.lenght+" weight: "+pl.weight+" max range: "+pl.max_range+" model: "+pl.model);
            Logger.getLogger(Airport.class).info("Plane id: "+pl.id+" lenght: "+pl.lenght+" weight: "+pl.weight+" max range: "+pl.max_range+" model: "+pl.model);
        }
        Logger.getLogger(Airport.class).info("Airport planes was showed");
    }
}
