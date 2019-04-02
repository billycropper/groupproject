package day08.interfaceProject;

public class CommissionedEmployee extends Employee {

    private double commissionRate;
    private double grossSales;

    public CommissionedEmployee(String firstName, String lastName, int social, double commissionRate, double grossSales) {
        super(firstName, lastName, social);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public double calculatePay(){
        double pay;
        return pay = commissionRate * grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return  "================================================================================" + '\n' +
                "Employee Type: CommissionedEmployee" + '\n' +
                "First Name: " + getFirstName() + '\n' +
                "Last name: " + getLastName() + '\n' +
                "Hire date: " + getStr() + '\n' +
                "Earned: " + calculatePay() + '\n' +
                "================================================================================";
    }
}
