package coreJavaTraining;

public class FirstClass {

    int b= 4;
    //Methods
    public void getData() {
//        static int a = 4;
        System.out.println("I am in method");
//        return "hello";
    }

    public static void main(String[] args) {
      FirstClass fn = new FirstClass();
      Secondclass sn = new Secondclass();
      sn.setData();

      fn.getData();
      System.out.println(fn.b);

        //        System.out.println(a);
        System.out.println("Hello World");

    }
}

//Result
//I am in second class method
//I am in method
//4
//        Hello World