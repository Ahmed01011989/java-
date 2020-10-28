package Practice2;

public class Laptop {
    // parameterization of  constructor
    int yearFromClass;// goal : set these data using the constructor
    String modelFromClass;
    String makeFromClass;
    String keysFromClass;

    // default constructor
    public Laptop() {

    }

    public Laptop(int yearFromConstructor, String modelFromConstructor) {
        this.yearFromClass = yearFromConstructor;
        this.modelFromClass = modelFromConstructor;
    }

    public Laptop(int yearFromConstructor, String modelFromConstructor, String keysFromConstructor) {
        this.yearFromClass = yearFromConstructor;
        this.modelFromClass = modelFromConstructor;
        this.keysFromClass = keysFromConstructor;
    }

    public Laptop(int yearFromConstructor) {
        this.yearFromClass = yearFromConstructor;
    }

    public static void main(String[] args) {//psvm
        Laptop laptop = new Laptop();
        laptop.printDetailsOfLaptop();

        Laptop laptop3 = new Laptop(2019);
        laptop3.printDetailsOfLaptop();
    }

    public void printDetailsOfLaptop() {
        System.out.println(yearFromClass);
        System.out.println(modelFromClass); //sout
    }
}
