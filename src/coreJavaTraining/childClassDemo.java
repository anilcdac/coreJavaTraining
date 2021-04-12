package coreJavaTraining;

public class childClassDemo extends parentClassDemo {
    public void engine()
    {
        System.out.println("New Engine");
    }

    public void color()
    {
        System.out.println(color);

    }

    public static void main(String[] args) {
        childClassDemo cd = new childClassDemo();
        cd.color();
        cd.Gear();
    }


}


//color variable coming from parentclass