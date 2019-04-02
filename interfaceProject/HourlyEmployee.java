package day08.interfaceProject;

public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, int social, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, social);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
//        double pay = hourlyWage * hoursWorked;
//        double overTimePay;
//        double overTimeRate = hourlyWage * 1.5;
//        double overTimeHours;
//        double totalPay;
//        if (hoursWorked > 40){
//            overTimeHours = hoursWorked - 40;
//            overTimePay = overTimeHours * overTimeRate;
//            totalPay = pay + overTimePay;
//        } else{
//            totalPay = pay;
//        } return totalPay;

        double overTime;
        double pay;
        double overTimePay = 0;
        if (hoursWorked > 40) {
            pay = (40 * hourlyWage);
            hoursWorked -= 40;
            overTime = hourlyWage * 1.5;
            overTimePay = overTime * hoursWorked;
            pay = pay + overTimePay;
        } else {
            pay = hourlyWage * hoursWorked;
        }
        return pay;
        }

    @Override
    public String toString() {
        return  "=============================================================================" + '\n' +
                "Employee Type: HourlyEmployee" + '\n' +
                "First Name: " + getFirstName() + '\n' +
                "Last name: " + getLastName() + '\n' +
                "Hire date: " + getStr() + '\n' +
                "Earned: " + calculatePay() + '\n' +
                "=============================================================================";
    }
}

