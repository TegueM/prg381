package planRoute;

public class PrivateTransportRoute implements PlanRoute

{
    @Override

    public void BuiltRoute  (String a, String b)
    {

        System.out.println("========PRIVATE TRANSPORT ROUTE==========");
        System.out.printf("From %s to %s", a,b);
        System.out.println("===============================");

    }
}
