package demopack;

public class assignment4RevPyramid36912 {

    public static void main(String[] args) {
//        nested loops
        int k =3;
        int l = 1;
        for(int i=1; i<5; i++)  //outer for loop- this block will loop for 4 times
        {
            for(int j=1; j<=i; j++)  // inner loop
            {
                System.out.print(k*l);
                System.out.print("\t");
                l++;
            }
            System.out.println();
        }
    }
}

/*Result
3
6	9
12	15	18
21	24	27	30
*/