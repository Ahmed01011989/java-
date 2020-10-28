package Practices6;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPra {

    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("rego park");
        cities.add("jamaica");
        cities.add("medford");
        System.out.println(cities);


        Iterator iterator= cities.iterator();
        while (iterator.hasNext()){
            String city=iterator.next().toString();
            System.out.println(city);
        }

    }
}
