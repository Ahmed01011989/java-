package practice1.variablespractice;

public class Laptop {

    // static --> keyword
    // 1. static method/variable --> can go inside static method or non static method,
    // if in the same class it can go directly , but if in different class we need to
    // specify name of the class. method name();

    // 2. non-static method/variable --> can go inside non-static method in the same class directly
    // if we still have to call non static methods/variables inside static method, we should create Objects of the class
    // SamE CLASS OR DIFFERENT CLASS

    protected static String company = "apple";
    int modelYear = 2020;

    public static void main(String[] args) {
        Laptop objNameOfLaptop = new Laptop();
        objNameOfLaptop.printNumberOfKeys();
        printModelName();
        printCompany();
    }

    public static void printModelName() {
        String model = "macbook pro";
        System.out.println(model);
        System.out.println(company);

        Laptop objOfTheLaptop = new Laptop();
        System.out.println(objOfTheLaptop.modelYear);
    }

    public static void printCompany() {
        System.out.println(company);
    }

    public void printNumberOfKeys() {
        System.out.println(32);
        System.out.println(company);
       System.out.println(modelYear);
    }
}
