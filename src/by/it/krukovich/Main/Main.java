package by.it.krukovich.Main;

import by.it.krukovich.Absctract.Creator;
import by.it.krukovich.Airport.Airport;
import by.it.krukovich.ConcreteCreators.CargoCreator;
import by.it.krukovich.ConcreteCreators.MilitCreator;
import by.it.krukovich.ConcreteCreators.PassCreator;
import by.it.krukovich.Manager.Manager;
import by.it.krukovich.Plane.Plane;
import by.it.krukovich.Plane.PlaneCargo;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Main {

    static{     new DOMConfigurator().doConfigure("log/log4j.xml", LogManager.getLoggerRepository()); }

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            LOG.info("Starting programm-----------------------------------------");
            Creator cargoCreator = new CargoCreator();
            Creator militCreator = new MilitCreator();
            Creator passCreator = new PassCreator();
            Plane cargo1 = cargoCreator.getPlane(14, 52, 1, 1500, "apach");
            Plane milit1 = militCreator.getPlane(7, 40, 2, 2000, "stels");
            Plane pass1 = passCreator.getPlane(30, 70, 3, 1800, "boing");
            Plane milit2 = militCreator.getPlane(15, 35, 4, 4000, "airstrike");
            Airport airport = new Airport("National Airlines");
            airport.Add(cargo1);
            airport.Add(milit1);
            airport.Add(pass1);
            airport.Add(milit2);
            Manager.getInstance().sort(airport, Manager.sortype.ASC);
            airport.Show();
            Manager.getInstance().search(airport, 15, 32);

            LOG.info("End of the programm---------------------------------------");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
