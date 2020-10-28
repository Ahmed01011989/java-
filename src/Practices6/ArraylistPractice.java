package Practices6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistPractice {

    public static void main(String[] args) {
           
        
        
        ArrayList<String> listofcity= new ArrayList<>();
        listofcity.add("Queens");
        listofcity.add("Manhattan");
        listofcity.add("bronx");
        listofcity.add("jersy City");
        System.out.println(listofcity);
        listofcity.remove("jersy City");
        listofcity.remove(2);
        
        System.out.println(listofcity);
        System.out.println(listofcity.size());

        System.out.println(listofcity.get(0));
        //System.out.println(listofcity.get(1));
//2nd
        for (int i=0;i<listofcity.size();i++){
            System.out.println(listofcity.get(i));

        }
        listofcity.add("Va");
        listofcity.add("DC");



        //3rd
        Iterator iterator=listofcity.iterator();
// while iteractor has a next Value i want to print that value
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ArrayList<Integer> ZipCode=new ArrayList<>();
        ZipCode.add(12333);
        ZipCode.add(23333);
        ZipCode.add(77766);

    }
}
