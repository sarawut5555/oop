import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] employeeData = new double[10][2];
        
        // รับข้อมูลรายได้และรายจ่ายของพนักงาน 10 คน
        for (int i = 0; i < 10; i++) {
            System.out.print("รายได้ของพนักงานที่ " + (i + 1) + ": ");
            double income = input.nextDouble();
            System.out.print("รายจ่ายของพนักงานที่ " + (i + 1) + ": ");
            double expenses = input.nextDouble();
            employeeData[i][0] = income;
            employeeData[i][1] = expenses;
        }
        
        // คำนวณรายได้สุทธิ
        double[] netIncomes = new double[10];
        for (int i = 0; i < 10; i++) {
            double income = employeeData[i][0];
            double expenses = employeeData[i][1];
            double netIncome = income - expenses;
            netIncomes[i] = netIncome;
        }
        
        // แสดงผลลัพธ์
        System.out.println("\nผลลัพธ์:");
        System.out.println("-------------------------------------------------");
        System.out.printf("   %-12s%-12s%-12s%-12s\n", "พนักงาน", "รายได้", "รายจ่าย", "รายได้สุทธิ");
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            double income = employeeData[i][0];
            double expenses = employeeData[i][1];
            double netIncome = netIncomes[i];
            System.out.printf("| %-12d%-12.2f%-12.2f%-12.2f|\n", (i + 1), income, expenses, netIncome);
        }
        
        System.out.println("-------------------------------------------------");
    }
}