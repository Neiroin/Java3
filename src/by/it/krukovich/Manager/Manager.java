package by.it.krukovich.Manager;


import by.it.krukovich.Airport.Airport;
import by.it.krukovich.Plane.Plane;
import org.apache.log4j.Logger;
import java.util.*;
import by.it.krukovich.Interface.InterfaceManager;

public class Manager implements InterfaceManager {

    private static Manager instance;

    public static Manager getInstance()
    {
        if (instance==null)
            instance=new Manager();
        return instance;
    }
    public enum sortype { ASC, DESC };
    public void sort(Airport airport, sortype type)
    {
        if (type==sortype.ASC) {
            Collections.sort(airport.getAirlist(), new Comparator<Plane>() {
                public int compare(Plane p1, Plane p2) {
                    return p1.max_range.toString().compareTo(p2.max_range.toString());
                }
            });
            Logger.getLogger(Manager.class).info("Sort completed order by ascending");
        }
                    else
            {
                Collections.sort(airport.getAirlist(), new Comparator<Plane>() {
                    public int compare(Plane p1, Plane p2) {
                        return p2.max_range.toString().compareTo(p1.max_range.toString());
                    }
            });
                Logger.getLogger(Manager.class).info("Sort completed order by descending");
        }



    }

    public void search(Airport airport, int lenght1, int lenght2)
    {
        ArrayList<Plane> tmplist= new ArrayList<Plane>();
        System.out.println("Search results: ");
        Logger.getLogger(Manager.class).info("Search results: ");
        for( Plane pl : airport.airlist)
        {
            if (pl.lenght>=lenght1&&pl.lenght<=lenght2)
            {
                tmplist.add(pl);

                System.out.println("Plane id: "+pl.id+" lenght: "+pl.lenght+" weight: "+pl.weight+" max range: "+pl.max_range+" model: "+pl.model);
                Logger.getLogger(Manager.class).info("Plane id: "+pl.id+" lenght: "+pl.lenght+" weight: "+pl.weight+" max range: "+pl.max_range+" model: "+pl.model);
            }
        }
        System.out.println("Search completed ");
        Logger.getLogger(Manager.class).info("Search completed");
    }

}
