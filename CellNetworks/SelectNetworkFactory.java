package CellNetworks;

public class SelectNetworkFactory 
{
    CellularPlan plan;

public CellularPlan getPlan(String networkType) 
{


    switch (networkType) 
    
    {
        case "abc":
        plan = new abcNetwork();
        plan.getRate();
        
        break;

        case "pqr":
        plan = new pqrNetwork();
        plan.getRate();
        break;

        case "xyz":
        plan = new xyzNetwork();
        plan.getRate();
        break;
        

        default:
        System.out.println("Invalid input: ");
            break;

           
    }
    return plan; 
}

}
