package coreJavaTraining;

import java.util.HashMap;
import java.util.HashSet;

public class hashSetexample {
    public static void main(String[] args) {

        /*
        HashSet doesnot accept duplicate values
        there is no guarantee that, element stored will be in sequence, they wil be in random order

         */

        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("B");

        hs.add("d");
        System.out.println(hs);

    }

}

/*
Result
[A, B, d]

 */