package coreJavaTraining;

public class ArraysDemo {

    public static void main(String[] args) {

//        int a = 4;
//        a =4 ;
//        Arrays- A container which stores multiple values of same data type

        int a[] = new int[5]; // decalres an array and allocates memory for the values
        a[0] = 2;
        a[1] = 6;
        a[2] = 1;
        a[3] = 9;
        a[4] = 12;  // initialised values into that array

        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]); // retrieve values present in the array
        }

    }
}
