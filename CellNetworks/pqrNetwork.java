package CellNetworks;

import java.util.Scanner;

public class pqrNetwork extends CellularPlan
{
    Scanner sc = new Scanner(System.in);
    @Override

    public void getRate() 
    {
        

        System.out.println("Enter a rate: ");
        rate = sc.nextDouble();

       
    }

    @Override
    public void processBill(int minutes) {

        System.out.println("Call cost: " + minutes*rate);

    }


}
