package Practice3;

public class Conditions {
    public static void main(String[] args) {


        // soccer - sunday
        // class - monday
        // guitar - friday
        // chill at my home - other days

        String today = "tuesday";


        // if(conditions)--ends{
        //      }

        if (today.equalsIgnoreCase("sunday")) {
            System.out.println("i'll go to soccer");
        } else if (today.equalsIgnoreCase("monday")) {
            System.out.println("I'll go to classes");
        } else if (today.equalsIgnoreCase("friday")) {
            System.out.println("i'll play guitar");
        } else {
            System.out.println("sitting at my home and watch netflix");
        }


        int year = 2021;

        if (year == 2020) {
            System.out.println("horrible year for all of us");
        } else {
            System.out.println("as usual");
        }


        boolean isTodaySunny = false;

        if (isTodaySunny) {
            System.out.println("lets go fishing");
        } else {
            System.out.println("lets play badminton");
        }


        // || -> or
        int a = 5;

        if (a == 5 || a > 6) {
            System.out.println(a);
        }

        // && -> and
        if (a == 5 && a > 4) {
            System.out.println("to day is the day " + a);
        }

        // != -> not equals

        if (a != 4) {
            System.out.println("a is not equals to 4. a is : " + a);
        }
        // == -> equals

        if (a == 5) {
            System.out.println("today a matched : " + a);
        }


    }
}
