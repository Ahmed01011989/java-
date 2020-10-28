package Practice3.oop.inheritance;

public class C extends B {


    public static void main(String[] args) {
        C c = new C();
        c.methodFromC();
        c.methodFromB();
        c.methodFromA();

        A a = new A();
        a.methodFromA();
    }

    public void methodFromC() {
        System.out.println("method details from C");
    }
}
