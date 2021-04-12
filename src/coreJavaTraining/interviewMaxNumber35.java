package coreJavaTraining;

public class interviewMaxNumber35
{
    public static void main(String[] args) {

        int abc[][]= {{2,4,5}, {3,4,7},{1,2,9}};
        int max =abc[0][0];
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(abc[i][j]>max) //2
                {
                    max=abc[i][j];
                }
            }
        }
        System.out.println("Max Number:"+max);

    }
}
