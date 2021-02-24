package Other;

//import java.util.*;

public class Questions {
    
    public static void main(String[] args) {

        //Question1: Odd or Even

            // Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
            // System.out.print("Enter your number: ");  
             
            // int a= sc.nextInt(); 

            // if (a%2 == 0) 
            // {
            //     System.out.println("Number " + a + " is even");
            // } 
              
            //   else 
            //   {
            //     System.out.print("Number " + a + " is odd");
            //   }

           

            // sc.close();

        //Question7: Reverse a string
        
        //     String input = "Belgium";

        //     byte [] strToArray = input.getBytes();
            
        //     byte [] result = new byte [strToArray.length];
        
        // for (int i = 0; i < strToArray.length; i++) {
            
        //     result[i] = strToArray[strToArray.length - i - 1];
        // }
        //     System.out.println(new String (result));

        //Question8: Fibonacci 

        // int fibNum = 8;

        // for (int i = 1; i < fibNum; i++) {
            
            

        //     int answer = i + i-1;


        //     System.out.print(answer + ",");

        // }

        //Question10: Astrix structure

        for (int i = 0; i < 5; i++) {
            

            for (int j = 0; j<i+1; j++) {
                
                System.out.println("*");

            }
                

        }
            
    }
}
