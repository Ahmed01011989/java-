package Practice3.oop.encapsulation;

public class Student {
    // oop -
    // Encapsulation : data hiding
    // Abstraction

    private String nameOfStudent;
    private int idOfStudent;
    private String location;
    private String gender;


    // homework
    private String ssn;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // getter method
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    // setter method
    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    // getter method
    public int getIdOfStudent() {
        return idOfStudent;
    }

    // setter method
    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }


}
