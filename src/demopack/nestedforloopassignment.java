package demopack;

public class nestedforloopassignment {

    public static void main(String[] args) {
//        nested loops
        int k =1;
        for(int i=0; i<4; i++)  //outer for loop- this block will loop for 4 times
        {
            for(int j=1; j<=4-i; j++)  // inner loop
            {
                System.out.print(k);
                k++;

            }
            System.out.println();
        }
    }
}

/*Result
1234
567
89
10

*/