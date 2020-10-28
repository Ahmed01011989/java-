package pract3;



public class Laptob2 {

    int yearFromClass; //goal : set these data using the constructor
    String modelFromClass;

    public void printDetailsOfLaptop () {
        System.out.println(yearFromClass);
        System.out.println(modelFromClass);//sout
    }

    //default constructor
    public Laptob2 () {
    }

    public Laptob2 (int year, String modelFromConstructor) {
        this.yearFromClass=year;
        this.modelFromClass = modelFromConstructor;

    }

    public Laptob2 (int yearFromConstructor) {
        this.yearFromClass = yearFromConstructor;

    }

    public static void main(String[] args) {

        //Laptop laptop = new Laptop();
        //laptop.printDetailsOfLaptop();

        //Laptop laptop1 = new Laptop(2020);
        //laptop1.printDetailsOfLaptop();

        Laptob2  laptop2 = new Laptob2 (2020,"asus");
        laptop2.printDetailsOfLaptop();



        //Laptop laptop3 = new Laptop(2019);
        //laptop3.printDetailsOfLaptop();
    }

}