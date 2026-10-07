package Inheritance;

public class SalariedEmployee extends Employee 
{
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double weeklySalary) 
    {
        super(first, last, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() 
    { 
        return weeklySalary; 
    }
    
    public void setWeeklySalary(double weeklySalary) 
    { 
        this.weeklySalary = weeklySalary; 
    }

    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Weekly salary: $%,.2f", weeklySalary);
    }
}