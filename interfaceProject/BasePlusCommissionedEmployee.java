package day08.interfaceProject;

public class BasePlusCommissionedEmployee extends CommissionedEmployee {

    private double basePay;

    public BasePlusCommissionedEmployee(String firstName, String lastName, int social, double commissionRate, double grossSales, double basePay) {
        super(firstName, lastName, social, commissionRate, grossSales);
        this.basePay = basePay;
    }

    @Override
    public double calculatePay(){
        double pay;
        pay = basePay + (getCommissionRate() * getGrossSales());
        return pay;
    }

    @Override
    public String toString() {
        return  "===================================================================================" + '\n' +
                "Employee Type: BasePlusCommissionedEmployee" + '\n' +
                "First Name: " + getFirstName() + '\n' +
                "Last name: " + getLastName() + '\n' +
                "Hire date: " + getStr() + '\n' +
                "Earned: " + calculatePay() + '\n' +
                "====================================================================================";
    }
}
