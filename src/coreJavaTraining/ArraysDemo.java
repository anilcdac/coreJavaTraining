package coreJavaTraining;

public class ArraysDemo {

    public static void main(String[] args) {
//Multidimentional array - row, column

        int a[][] = new int[2][3];
        a[0][0]=2;
        a[0][1]=4;
        a[0][2]=5;
        a[1][0]=3;
        a[1][1]=4;
        a[1][2]=7;
        int b[][] = {{2,4,5},{3,4,7}}; // way2 of writing

        System.out.println(a[1][0]);
        System.out.println("");
        System.out.println(b[1][0]);

    }
}

/*
 result
3
*/

