package Practice3.oop.encapsulation;

public class Peoplentech {
    public static void main(String[] args) {

        Student yanis = new Student();
        yanis.setIdOfStudent(34567);
        yanis.setNameOfStudent("Yanis");


        Student rahat = new Student();
        rahat.setIdOfStudent(1352);
        rahat.setNameOfStudent("Rahat");

        //
        //
        //
        //
        //
        //

        System.out.println(yanis.getIdOfStudent());
        System.out.println(yanis.getNameOfStudent());

        System.out.println(rahat.getNameOfStudent());
        System.out.println(rahat.getIdOfStudent());
    }
}

