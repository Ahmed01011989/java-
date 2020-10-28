package practice1.methodpractice;

public class Barcelona {
    public static void main(String[] args) {
        printStadium();
        Barcelona objName = new Barcelona();
        objName.bestPlayer();

    }

    // create a static and a non static method and call the both methods inside the main method

    public static void printStadium() {
        System.out.println("Camp NU");
    }

    public void bestPlayer() {
        System.out.println("L Messi");
    }
}
