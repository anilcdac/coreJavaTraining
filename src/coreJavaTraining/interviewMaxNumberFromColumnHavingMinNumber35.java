package coreJavaTraining;
/*
2  4  5
3  2  10
1  2  0
 */


public class interviewMaxNumberFromColumnHavingMinNumber35
{
    public static void main(String[] args) {

        int abc[][]= {{2,4,5}, {3,2,10},{1,2,0}};
        int min =abc[0][0];
        int minColumn=0;

        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(abc[i][j]<min) //2
                {
                    min=abc[i][j];
                    minColumn = j;
                    System.out.println("Row:"+i);
                    System.out.println("minColumn:"+j);
                }
            }
        }
        System.out.println("Min Number:"+min);
        //=1
        int max = abc[0][minColumn];
        int k = 0;
        while(k<3)    // column length 3
        {
            if (abc[k][minColumn] > max) {
                max = abc[k][minColumn];
            }
            k++;
        }

         System.out.println("Max Number:"+max);

    }
}

/*
i - row
j - column
1. Find min number
2. Identify the column of min number
3. Find the max number in identified column

 */