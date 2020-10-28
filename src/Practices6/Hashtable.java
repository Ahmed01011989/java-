package Practices6;

public class Hashtable {

    //hashtable cant contain null key
    public static void main(String[] args) {
        java.util.Hashtable<Integer,String> student =new java.util.Hashtable<>();
        student.put(32,"mich");
        student.put(53,"jafor");
        student.put(12,"daived");
        //student.put(null,"daived");
       // student.put(12,null);


        System.out.println(student);
    }
}
