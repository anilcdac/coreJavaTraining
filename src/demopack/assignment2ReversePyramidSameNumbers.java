package demopack;

public class assignment2ReversePyramidSameNumbers {

    public static void main(String[] args) {
//        nested loops
        int k =1;
        for(int i=1; i<5; i++)  //outer for loop- this block will loop for 4 times
        {
            for(int j=1; j<=i; j++)  // inner loop
            {
                System.out.print(j);
                System.out.print("\t");

                k++;

            }
            System.out.println();
        }
    }
}

/*Result
1
1	2
1	2	3
1	2	3	4

*/