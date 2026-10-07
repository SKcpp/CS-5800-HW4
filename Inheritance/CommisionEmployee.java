package Inheritance;

public class CommisionEmployee extends Employee 
{
    private double commissionRate;
    private double grossSales;

    public CommisionEmployee(String first, String last, String ssn,
                             double commissionRate, double grossSales) 
    {
        super(first, last, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() 
    { 
        return commissionRate; 
    }
    
    public void setCommissionRate(double commissionRate) 
    { 
        this.commissionRate = commissionRate; 
    }
    
    public double getGrossSales() 
    { 
        return grossSales; 
    }
    
    public void setGrossSales(double grossSales) 
    {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Commission rate: %.0f%%, Gross sales: $%,.2f",
                                                commissionRate * 100, grossSales);
    }
}