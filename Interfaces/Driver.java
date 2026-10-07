package Interfaces;

import java.util.ArrayList;

public class Driver 
{
    public static void main(String[] args) 
    {
        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(new Freelancer("Ava", "Martinez", 40.00, 35));   
        payables.add(new Freelancer("Liam", "Chen", 50.00, 46));      
        payables.add(new VendorInvoice("Acme Office Supply", "INV-1001", 1250.75));
        payables.add(new VendorInvoice("CloudHost Inc.", "INV-2043", 899.99));

        double total = 0;
        for (Payable p : payables) 
        {
            if (p instanceof Freelancer) 
            {
                ((Freelancer) p).print();
            } 
            else if (p instanceof VendorInvoice) 
            {
                ((VendorInvoice) p).print();
            }
            total += p.calculatePayment();
        }

        System.out.printf("%nTotal payout for the period: $%,.2f%n", total);
    }
}