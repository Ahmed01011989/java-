package Practices6;

import java.util.ArrayList;

public class Arraypra {
    public static void main(String[] args) {
        ArrayList<String> cityofusa=new ArrayList<>();
        cityofusa.add("new york");
        cityofusa.add("new jersy");
        cityofusa.add("verjenia");

        ArrayList<String> cityofcanada=new ArrayList<>();
        cityofcanada.add("toranto");
        cityofcanada.add("toranto");
        cityofcanada.add("monterio");

        ArrayList<ArrayList<String>> world=new ArrayList<>();
        world.add(cityofcanada);
        world.add(cityofusa);
        System.out.println(world);
    }
}
