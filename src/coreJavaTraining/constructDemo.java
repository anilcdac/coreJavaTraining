package coreJavaTraining;

import java.sql.SQLOutput;

public class constructDemo {
//    -Will not return values
//    Name of contructor should be always class name
    public constructDemo()
    {
        System.out.println("I am in the constructor");
    }

    public void getData()
    {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        constructDemo cd = new constructDemo();
//        compiler will call implicit constructor, if you have not defined constructor block
//        whenever you create an object , constructor is called

/*       -block of code when ever an object is created
        - constructor invoke ,whenever object is created
        -Will not return values
        Name of constructor should be always class name

        Usage: when for particular class, we want to get variable values(call some method) by default , without calling method from main, they can be put in constructor.

  */

    }
}
