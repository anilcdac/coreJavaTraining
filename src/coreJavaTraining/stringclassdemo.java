package coreJavaTraining;

public class stringclassdemo {

    public static void main(String[] args) {
/*String is class in java
String: Its one of prebuilt class in java    - Interview

How many ways string can be defined
1] String literal
2. By creating object of string  */

        String a = "hello" ;  //String literal
        String ab = new String("hello");   // with String class
// now this object ab can perform all the string manipulation on this string Hello
//



        String a = "hello" ;  //String literal
        String b = "hello" ;  //String literal
//        as object a is already having "hello" string; it will simply point "hello" string for b.

//        here we are explicitly forcing to create object for this class b, though duplicate already present, still it will create
        String a = new String("hello");
        String b = new String("hello");


    }
}
