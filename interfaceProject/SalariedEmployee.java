package day08.interfaceProject;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int social, double salary) {
        super(firstName, lastName, social);
        this.weeklySalary = salary;
    }

    @Override
    public double calculatePay(){
        return weeklySalary;
    }

    @Override
    public String toString() {
        return  "========================================================================" + '\n' +
                "Employee Type: SalariedEmployee" + '\n' +
                "First Name: " + getFirstName() + '\n' +
                "Last name: " + getLastName() + '\n' +
                "Hire date: " + getStr() + '\n' +
                "Earned: " + calculatePay() + '\n' +
                "========================================================================";
    }
}
