package Practices6;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> cityandzipofusa=new HashMap<>();


        cityandzipofusa.put("new york",11223);
        cityandzipofusa.put("new jersy",22334);
        cityandzipofusa.put("DC",88771);

        HashMap<String,Integer>cityandzipofcanada=new HashMap<>();

        cityandzipofcanada.put("toranto",99887);
        cityandzipofcanada.put("vectoria",55587);

        HashMap<String,HashMap<String,Integer>> map=new HashMap<>();
        map.put("usa",cityandzipofusa);
        map.put("canda",cityandzipofcanada);
        System.out.println(map);






    }
}
