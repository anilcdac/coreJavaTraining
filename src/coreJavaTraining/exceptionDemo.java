package coreJavaTraining;

public class exceptionDemo {
    public static void main(String[] args) {
        int a =4;
        //3 lines of code - if throw error catch without failing
        //try catch mechanism
        int b = 7;
        int c = 0;
        try
        {
            int k = b/c;

        }
        catch(Exception e)
        {
            System.out.println("I catched error/exception");
        }

    }
}
