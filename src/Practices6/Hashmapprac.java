package Practices6;

import java.util.HashMap;

public class Hashmapprac {
    public static void main(String[] args) {
        // key -value
        HashMap<Integer,String> studentinformation =new HashMap<>();

        studentinformation.put(1234,"Nusrat");
        studentinformation.put(23445,"Maichel");
        studentinformation.put(3421,"Daived");

        System.out.println(studentinformation.get(23445));


        HashMap<String,Integer>locationinformation=new HashMap<>();

        locationinformation.put("Rego park",12345);
        locationinformation.put("grand concors",6543);
        System.out.println(locationinformation.get("Rego park"));
        System.out.println(locationinformation);
        System.out.println(studentinformation);

        System.out.println(studentinformation.size());
        System.out.println(studentinformation.containsKey(325));
        System.out.println(studentinformation.containsKey("rahat"));


    }
}
