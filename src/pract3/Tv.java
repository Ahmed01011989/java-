package pract3;

public class Tv {
    public static void main(String[] args) {
        Name();
        model("LG",65);
        year(2011,"Novomber");
        price(3000);


    }
    public static void Name(){
        for(int i=0;i<5;i++){
            System.out.println("Samsung"+i);

        }

        System.out.println("Samsung");

    }
    public static void model(String Name,int screenSize){
        System.out.println(Name+" "+screenSize);

    }
    public static void year(int tvyear,String month){


        System.out.println(tvyear+" "+month);

    }
    public static void price(int tvPrice){
        int playPrice=100;
        int totalPrice=playPrice+tvPrice;
        System.out.println(totalPrice);

    }

}
