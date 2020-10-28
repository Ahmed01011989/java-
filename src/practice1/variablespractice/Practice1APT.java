package practice1.variablespractice;

public class Practice1APT {
    static String robot = "vacuume cleaner";
    // class level variables / global variable

    public static void main(String[] args) {
        bedRoom();
        kitchen();
    }

    public static void bedRoom() {
        // method level variables / local variable
        String furniture = "Bed";
        System.out.println(furniture);
        System.out.println(robot);
    }

    public static void kitchen() {
        String oven = "gas";
        System.out.println(oven);
        System.out.println(robot);
    }
}
