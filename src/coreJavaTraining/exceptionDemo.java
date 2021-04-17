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
//            int k = b/c;
            int arr[] = new int[5];
            System.out.println(arr[7]);

        }
        catch(ArithmeticException et)
        {
            System.out.println("I catch Arithmetic exception");
        }
        catch(IndexOutOfBoundsException ets)
        {
            System.out.println("I catched Index out of bound exception");
        }

        catch(Exception e)  // accepts all kinds of exception- general
        {
            System.out.println("I catched error/exception");
        }
        finally
        {
            //though exception found,script failed,  it will come to finally , and execute that finally block
            System.out.println("I am in finally- delete cookies- close browser");
        }
    }
}

//if you stop jvm forcefully, clicking stop, finally will not execute3