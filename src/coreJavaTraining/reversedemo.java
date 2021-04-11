package coreJavaTraining;

public class reversedemo {

    public static void main(String[] args) {

//        int a[] = {4,5,5,5,4,6,6,9,4};
//        print unique number from the list - amazon
//        print the string in reverse  - yahoo

//        Given string identify if its palindrom

        String s= "madam";
        String t = "";
        for(int i =s.length()-1; i>=0 ; i--){
            t = t + s.charAt(i);
            System.out.println(s.charAt(i));  // for string can't use s[i]

        }
        System.out.println(t);

        if(s.equals(t))
        {
//            if its palindrom
            System.out.print("This is palindrom");
        } else {
            System.out.print("This is not palindrom");
        }
    }
}
/*
Result
m
a
d
a
m
madam
This is palindrom

 */