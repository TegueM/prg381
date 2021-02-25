package planRoute;

public class PublicTransportRoute implements PlanRoute

{
    @Override

    public void BuiltRoute  (String a, String b)
    {

        System.out.println("========PUBLIC TRANSPORT ROUTE==========");
        System.out.printf("From %s to %s", a,b);
        System.out.println("===============================");

    }
}
