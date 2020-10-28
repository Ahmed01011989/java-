package Practice2;

public class Phone {
    String model;
    String price;

    //1
    public Phone() {

    }

    //2
    public Phone(String nameOfTheModelFromConstructor) {
        this.model = nameOfTheModelFromConstructor;
    }

    //3
    public Phone(String nameOfTheModelFromConstructor, String priceFromConstructor) {
        this.model = nameOfTheModelFromConstructor;
        this.price = priceFromConstructor;
    }

    public static void main(String[] args) {

        Phone phone3 = new Phone("galaxy note 20 ultra", "1000 USD");
        phone3.printPhone();
    }

    public void printPhone() {
        System.out.println(model);
        System.out.println(price);
    }
}
