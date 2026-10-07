package Inheritance;

public class HourlyEmployee extends Employee 
{
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String first, String last, String ssn, double wage, 
                          double hoursWorked) 
    {
        super(first, last, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() 
    { 
        return wage; 
    }
    
    public void setWage(double wage) 
    { 
        this.wage = wage; 
    }
    
    public double getHoursWorked() 
    { 
        return hoursWorked; 
    }
    
    public void setHoursWorked(double hoursWorked) 
    { 
        this.hoursWorked = hoursWorked; 
    }

    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Wage: $%,.2f, Hours worked: %.1f", wage, hoursWorked);
    }
}