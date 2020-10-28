package practice1.methodpractice;

public class TypesOfMethods {
    public static void main(String[] args) {

        printMyName();
        String cup = getMeACoffee();
        System.out.println(cup);
        System.out.println("I am throwing the " + cup);

        // ClassName obj/refVar = new ConstructorName()
        TypesOfMethods typesOfMethods = new TypesOfMethods();

        typesOfMethods.printMyAge();

        int age = typesOfMethods.getMyAge();
        int newAge = age + 5;
        System.out.println("my age after 5 years from now is " + newAge);

        boolean answer = isItSunnyToday();
        System.out.println(answer);

    }


    // static void methods
    public static void printMyName() {
        System.out.println("Zann");
    }

    // non static return type method
    public static String getMeACoffee() {
        return "espresso";
    }

    // return type method --> needs to be stored them somewhere

    public static boolean isItSunnyToday() {
        return false;
    }

    // non static void method
    public void printMyAge() {
        System.out.println(25);
    }

    // static return type methods
    public int getMyAge() {
        return 30;
    }

    //public static/nonstatic datatype nameOfTheMethod(){
    // return "what you want to return";
    //}
}
