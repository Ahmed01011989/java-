package practice1.methodpractice;

public class StaticNonStatic {
    // default Constructor -->same name as the classname, no void/static
    // optional to create default constructor
    public StaticNonStatic() {

    }

    public static void main(String[] args) {
        myCollege();// can go inside static method
        //printMyName();--shows error

        // object creation of the class
        StaticNonStatic refferenceVariable = new StaticNonStatic();
        // nameOfTheClassThat we want to create obj of --refferenceVariable Of The Class (= new)-->law ---- nameOftheConstructor
        refferenceVariable.printMe();

    }

    public static void myCollege() {
        System.out.println("XYZ College");
    }

    // if u don't use the keyword static --> it becomes non static
    public void printMyName() {
        System.out.println("Zann");
    }

    public void printMyAge() {
        System.out.println("00");
    }

    public void printMe() {
        myCollege();// can go inside non-static method
        printMyName();
        printMyAge();

    }

    // static --> keyword

    // 1. static method/variable --> can go inside static method or non static
    // method
    // 2. non-static method/variable --> can go inside non-static method only
    // if we still have to call non static methods, we should create Objects of the class

}
