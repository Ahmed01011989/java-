package Practices6;

public class Array2 {
    public static void main(String[] args) {
        String[] names={"adna","rahat","daiv","tigis","zahra","iyes","rahman"};


        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println(names.length);


        // try this
        //if any exception
        //catch them
        //perform some action
        //parent class of exception throwable
        try {
            System.out.println(names[7]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception occored,try to fix your index");
           // e.printStackTrace();



            String[] cars=new String[5];
            cars[0]="bmw";
            cars[1]="audio";
            cars[2]="alpha";
            System.out.println(cars.length);
            System.out.println(cars[2]);
            System.out.println(cars[3]);

            String [] mycars =cars.clone();
            System.out.println(mycars.length);



        }

    }
}
