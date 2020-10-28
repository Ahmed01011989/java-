package practice1.methodpractice;

public class House {

    public House() {

    }

    public static void main(String[] args) {// methods
        kitchen();
        // ClassName refVar = new ConstructorName();
        House refVar = new House();
        refVar.bedRoom();
    }

    public static void kitchen() {// methods
        System.out.println("1 Fridge");
    }

    public void bedRoom() {// methods
        System.out.println("1 Bed");
    }
}
