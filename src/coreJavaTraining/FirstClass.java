package coreJavaTraining;

public class FirstClass {

    //Methods
    public void getData() {
//        static int a = 4;
        System.out.println("I am in method");
//        return "hello";
    }

    public static void main(String[] args) {
      FirstClass fn = new FirstClass();
      fn.getData();

        //        System.out.println(a);
        System.out.println("Hello World");

    }
}

//Result
//        I am in method
//        Hello World