package CellNetworks;

public class PhoneBill 
{
    public static void main(String[] args) 
    {
        
        SelectNetworkFactory cell = new SelectNetworkFactory();

          
        CellularPlan cPlan = cell.getPlan("abc");
        cPlan.getRate();
        cPlan.processBill(3);

    }
}
