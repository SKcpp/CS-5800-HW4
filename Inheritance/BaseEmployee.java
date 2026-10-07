package Inheritance;

public class BaseEmployee extends CommisionEmployee 
{
    private double baseSalary;

    public BaseEmployee(String first, String last, String ssn,
                        double commissionRate, double grossSales, double baseSalary) 
    {
        super(first, last, ssn, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() 
    { 
        return baseSalary; 
    }
    
    public void setBaseSalary(double baseSalary) 
    { 
        this.baseSalary = baseSalary; 
    }

    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Base salary: $%,.2f", baseSalary);
    }
}