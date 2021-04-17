package demopack;

public abstract class ParentAirCraft {

    public void engine()
    {
        System.out.println("Follow Engine Guidelines");
    }

    public void safetyGuidelines()
    {
        System.out.println("Follow Safety Guidelines");
    }

    public abstract void bodyColor();

}

// private is not allowed for methods in abstract class