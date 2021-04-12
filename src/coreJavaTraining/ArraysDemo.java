package coreJavaTraining;

public class ArraysDemo {

    public static void main(String[] args) {

//        int a = 4;
//        a =4 ;
//        Arrays- A container which stores multiple values of same data type

//        way1
        int a[] = new int[5]; // declares an array and allocates memory for the values
        a[0] = 2;
        a[1] = 6;
        a[2] = 1;
        a[3] = 9;
        a[4] = 12;  // initialised values into that array

//        way2
        int b[] = {1,4,3,5,7,8}; //b. memory is allocated dynamically

        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]); // retrieve values present in the array
        }

        for(int i = 0; i<b.length; i++)
        {
            System.out.println(b[i]); // retrieve values present in the array
        }

    }
}
