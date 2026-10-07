package Polymorphism;

public class CargoShip extends Ship 
{
    private int cargoCapacityTons;

    public CargoShip(String name, String yearBuilt, int cargoCapacityTons) 
    {
        super(name, yearBuilt);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    public int getCargoCapacityTons() 
    { 
        return cargoCapacityTons; 
    }
    
    public void setCargoCapacityTons(int cargoCapacityTons) 
    { 
        this.cargoCapacityTons = cargoCapacityTons; 
    }

    @Override
    public void print() {
        System.out.println("Ship name: " + getName() + ", Cargo capacity: " + cargoCapacityTons + " tons");
    }
}