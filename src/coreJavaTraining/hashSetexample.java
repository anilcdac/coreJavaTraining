package coreJavaTraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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

        hs.add("e");
        hs.add("f");
        hs.add("g");

        Iterator<String> i = hs.iterator();
        System.out.println(i.next());  // 1st index
        System.out.println(i.next());  // 2nd index
        System.out.println(i.next());  // 3rd index
        System.out.println(i.next());



        while(i.hasNext()) {
            System.out.println(i.next());
        }
// value comes in random sequence

        /*How iterator can help in traversing in set interface - interview
        index.next();
*/
    }

}

/*
Result
[A, B, d]
A
B
d
e
f
g
 */