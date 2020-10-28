package Practices5;

public class Drugu {
    int yearofcar;
    String nameofcare;


    public void printinfocar(){
        System.out.println(nameofcare);
        System.out.println(yearofcar);
    }
    public static void main(String[] args) {
        Drugu drugu=new Drugu("Camry",2020);
        drugu.printinfocar();
        Drugu drugu1=new Drugu("honda");
        drugu1.printinfocar();
    }
    public Drugu(String car,int year){
        this.nameofcare=car;
        this.yearofcar=year;

    }
    public Drugu(String secondcar){
this.nameofcare=secondcar;
    }

}

