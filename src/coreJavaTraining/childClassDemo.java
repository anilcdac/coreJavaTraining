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

    public void audioSystem()
    {
        System.out.println("audioSystem child code is implemented");

    }

    public static void main(String[] args) {
        childClassDemo cd = new childClassDemo();
        cd.color();
        cd.Gear();
        cd. audioSystem(); //function overriding- both the methods have same name same signature, return type
    }


}


//color variable coming from parentclass