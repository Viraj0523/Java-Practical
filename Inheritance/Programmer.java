package Inheritance;
import java.util.Scanner;
    public class Programmer extends Employee { 
        float basic_pay;
public void accept() {
    Scanner sc=new Scanner(System.in); 
        System.out.println("Enter basic pay:"); 
        basic_pay=sc.nextFloat();

}
    float DA,HRA,PF,SCF;
    float gross_salary,net_salary; 
    
public void calculate() {
    DA= basic_pay*97/100; 
    HRA=basic_pay*10/100; 
    PF=basic_pay*12/100; 
    SCF=basic_pay*1/1000; 
    gross_salary=basic_pay+DA+HRA; 
    net_salary=gross_salary-PF-SCF;
}
public void output() {
    System.out.println("DA:"+DA +"\nHRA:"+HRA +"\nPF:"+PF +"\nSCF:"+SCF +"\nGross_Salary:"+gross_salary +"\nNet_Salary:"+net_salary);
}
    }