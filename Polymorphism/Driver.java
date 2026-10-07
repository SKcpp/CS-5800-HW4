package Polymorphism;

public class Driver {
    public static void main(String[] args) 
    {
        Ship[] ships = new Ship[3];                      
        ships[0] = new Ship("Sea Explorer", "1998");     
        ships[1] = new CruiseShip("Ocean Dream", "2015", 3200);
        ships[2] = new CargoShip("Iron Titan", "2008", 150000);

        for (Ship s : ships) 
        {
            s.print();
        }
    }
}