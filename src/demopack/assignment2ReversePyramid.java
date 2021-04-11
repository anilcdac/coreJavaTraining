package demopack;

public class assignment2ReversePyramid {

    public static void main(String[] args) {
//        nested loops
        int k =1;
        for(int i=1; i<5; i++)  //outer for loop- this block will loop for 4 times
        {
            for(int j=1; j<=i; j++)  // inner loop
            {
                System.out.print(k);
                System.out.print("\t");

                k++;

            }
            System.out.println();
        }
    }
}

/*Result
1
2	3
4	5	6
7	8	9	10

*/