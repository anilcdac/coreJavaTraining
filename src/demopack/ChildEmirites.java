package demopack;

public class ChildEmirites extends ParentAirCraft{
    public void main(String[] args)
    {
        ChildEmirites c = new ChildEmirites();
        c.engine();
        c.safetyGuidelines();
        c.bodyColor();


    }

    @Override
    public void bodyColor() {
        System.out.println("Red color on the body");
    }
}
