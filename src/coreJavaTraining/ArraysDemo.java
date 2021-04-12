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
//        int b[][] = {{2,4,5},{3,4,7}}; // way2 of writing


        for (int i=0;i<2;i++) //row
        {
            for(int j=0;j<3;j++) // columns
            {
                System.out.println(a[i][j]);
            }
        }


//        System.out.println(a[1][0]);
//        System.out.println("");
//        System.out.println(b[1][0]);

    }
}

/*
 result
2
4
5
3
4
7
*/

