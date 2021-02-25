package planRoute;

public class Context 
{
    PlanRoute plan;

    public Context(PlanRoute plan)
    {

        this.plan = plan;

    }

    public void Execute (String a, String b)
    {

        plan.BuiltRoute(a, b);

    }

}
