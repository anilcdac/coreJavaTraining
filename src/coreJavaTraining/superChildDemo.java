package coreJavaTraining;

public class superChildDemo extends superParentDemo{

    String name = "QAAcademy";

    public superChildDemo()
    {
        super(); // when you use super in child, it should be always be at 1st line
        System.out.println("Child class constructor");
    }


    public void getStringData()
    {
        System.out.println(name);
        System.out.println(super.name);

    }

    public void getData()
    {
        super.getData();   //calls parent
        System.out.println("I am in child class");
    }

    public static void main(String[] args) {
        superChildDemo cd = new superChildDemo();
        cd.getStringData();
        cd.getData();
    }
}

/*
QAAcademy
Rahul
I am from parent class
I am in child class
 */