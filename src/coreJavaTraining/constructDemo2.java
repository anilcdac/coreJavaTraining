package coreJavaTraining;

public class constructDemo2 {
//    -Will not return values
//    Name of contructor should be always class name
    public constructDemo2()
    {
        System.out.println("I am in the constructor");
    }

    //Parameterized constructor

    public constructDemo2(int a, int b)
    {
        System.out.println("I am in the parameterized constructor");
    }

    public constructDemo2(String a)
    {
        System.out.println("I am in the parameterized single constructor: "+ a);
    }
    public void getData()
    {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        constructDemo2 cd = new constructDemo2();
        constructDemo2 cd2 = new constructDemo2(4,5);
        constructDemo2 cd3 = new constructDemo2("Hello");

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

/*
Result:
for //
constructDemo2 cd = new constructDemo2();
Default constructor picked up



constructDemo2 cd2 = new constructDemo2(4,5);
I am in the parameterized constructor



==Result
I am in the constructor
I am in the parameterized constructor
I am in the parameterized single constructor: Hello
 */