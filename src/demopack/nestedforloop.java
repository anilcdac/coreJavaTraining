package demopack;

public class nestedforloop {


    public static void main(String[] args) {
//        nested loops
        for(int i=0; i <10; i++)  //outer for loop- this block will loop for 4 times
        {
            System.out.println("Outer loop started");
            for(int j=0; i <10; i++)  // inner loop
            {
                System.out.println("inner loop");
            }
            System.out.println("Inner loop finished");
        }
    }
}

/*Result
Outer loop started
        inner loop
        inner loop
        inner loop
        inner loop
        inner loop
        inner loop
        inner loop
        inner loop
        inner loop
        inner loop
        Inner loop finished

*/