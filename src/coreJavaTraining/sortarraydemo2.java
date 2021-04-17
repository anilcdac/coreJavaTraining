package coreJavaTraining;

public class sortarraydemo2 {

    public static void main(String[] args) {
        int a[] = {2,6,1,4,9};
        int temp;
        for(int i=0;i<5;i++)
        {
            for(int j = i+1;j<5;j++)
            {
                if(a[i] >a[j])
                {
                    //swap
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for( int i =0; i<5; i++)
        {
            System.out.println(a[i]);
        }

        /*
        bubble sort
        compare 1st with all, one by one, and swap
        2, 6, 1, 4,9
        1  6,2,4,9
        12  6,4,9
        124  6,9
        12469


        outer for loop which moves each time
         */

//        int a= 5;
//        int b =4;
//
////       swap without temp variable
//        a = a+b; //a = 9
//        b=  a-b; //b = 5
//        a= a-b; // a = 4


    }
}
