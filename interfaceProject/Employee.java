package day08.interfaceProject;

public abstract class Employee extends HireDate{

    private String firstName;
    private String lastName;
    private int social;

//    public Employee() {
//
//    }

    public Employee(String firstName, String lastName, int social) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.social = social;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public double calculatePay(){
        return social;
    }
}
