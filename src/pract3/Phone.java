package pract3;

public class Phone {
    public static void main(String[] args) {
        Phone phone=new Phone("Samsung");
        phone.printmyphone();
    }
    public Phone(String modelofconstoctor){
        this.model=modelofconstoctor;

    }
    String model;
    public void printmyphone(){
        System.out.println(model);
    }

}
