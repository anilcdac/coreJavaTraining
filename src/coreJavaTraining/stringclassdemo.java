package coreJavaTraining;

import java.util.Locale;

public class stringclassdemo {

    public static void main(String[] args) {
//String is class in java
        String a = "javatraining";  //String literal

        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("l"));
        System.out.println(a.substring(3, 6));
        System.out.println(a.substring(5));
        System.out.println(a.concat("rahul teachers"));
//        a.length
        a.trim();  // remove whitespace
        a.toUpperCase();
        a.toLowerCase(Locale.ROOT);

        //Split
        String arr[]= a.split("t");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

//        replace
        System.out.println(a.replace("t","s"));  //javasraining

    }
}
/*
Result
v
-1
atr
raining
javatrainingrahul teachers
java
raining
javasraining

 */