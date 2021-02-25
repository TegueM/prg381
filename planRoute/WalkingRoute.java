package planRoute;


public class WalkingRoute implements PlanRoute
{
    
    @Override

    public void BuiltRoute  (String a, String b)
    {

        System.out.println("========WALKING ROUTE==========");
        System.out.printf("From %s to %s", a,b);
        System.out.println("===============================");

    }

}
