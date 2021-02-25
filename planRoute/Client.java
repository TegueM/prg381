package planRoute;

import java.util.Scanner;


public class Client 

{
    public static void main(String[] args) 
    {
        Context context;

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Walking \n2.Public Transport \n3.Private Transport");
        int option = sc.nextInt();


        switch (option) {
                case 1:
                context = new Context(new WalkingRoute());
                context.Execute("BC", "NorthPark");
                break;

                case 2:
                context = new Context(new PublicTransportRoute());
                context.Execute("BC", "Wonderpark");
                break;

                case 3:
                context = new Context(new PrivateTransportRoute());
                context.Execute("BC", "Wonder Junction");
                break;

                default:
                System.out.println("Invalid Input");
                break;
        
        }

    }
}
