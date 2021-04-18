package coreJavaTraining;

import java.util.ArrayList;

public class arrayListexample {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList();
        a.add("Rahul");
        a.add("Anil");
        a.add(1,"Mohan");
        System.out.println(a.isEmpty());
     //   a.contains("Anil");
        System.out.println(a.indexOf("Rahul"));



       // a.remove(1);
//        a.get(2);
//        System.out.println(a.get(2));
//        System.out.println(a);
        System.out.println(a.contains("Anil"));
    }

}
