package day08.interfaceProject;

import day07.BasePlusEmployee;

public class Main {
    public static void main(String[] args) {


        //HireDate hire = new HireDate();
        //System.out.println(hire.makeDate(3,5,2091));

        SalariedEmployee hire1 = new SalariedEmployee("William", "Cropper", 1435, 1000.00);
        //System.out.println(hire1.makeDate(3,5,2019));
        //System.out.println(hire1.calculatePay());
        hire1.makeDate(3,5,2019);
        System.out.println(hire1);

        HourlyEmployee hire2 = new HourlyEmployee("William","Cropper", 1435, 1, 50);
        //System.out.println(hire2.calculatePay());
        hire2.makeDate(3,5,2019);
        System.out.println(hire2);

        CommissionedEmployee hire3 = new CommissionedEmployee("William", "Cropper", 1435, 0.10, 1000);
        //System.out.println(hire3.calculatePay());
        hire3.makeDate(3,5,2019);
        System.out.println(hire3);

        BasePlusCommissionedEmployee hire4 = new BasePlusCommissionedEmployee("William", "Cropper", 1435, 0.10, 1000, 1000);
        //System.out.println(hire4.calculatePay());
        hire4.makeDate(3,5,2019);
        System.out.println(hire4);



    }
}
