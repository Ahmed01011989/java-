package practice1.methodpractice;

public class RMadrid {
    public static void main(String[] args) {
        printStadium();
        RMadrid objectName = new RMadrid();
        objectName.bestPlayer();
    }

    // create a static and a non static method and call the both methods inside the main method

    public static void printStadium() {
        System.out.println("Bernabeu");
    }

    public void bestPlayer() {
        System.out.println("K Benzama");
    }

    public void topXI() {
        bestPlayer();
    }
}
