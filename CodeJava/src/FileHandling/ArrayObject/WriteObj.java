package FileHandling.ArrayObject;

import java.io.*;
import java.util.*;

class Employee implements Serializable{
    private int emp_id;
    private String name;
    private String designation;
    private int dept_No;

    public Employee(int emp_id, String name, String designation, int dept_No) {
        this.emp_id = emp_id;
        this.name = name;
        this.designation = designation;
        this.dept_No = dept_No;
    }

    public void printDetails(){
        System.out.println();
        System.out.println("Emp ID: "+ emp_id);
        System.out.println("Emp Name: "+ name);
        System.out.println("Emp Designation: "+ designation);
        System.out.println("Emp Dept NO: "+ dept_No);
    }

}

public class WriteObj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many employee details you want to enter?");
        int no=sc.nextInt();
        Employee []emp=new Employee[no];
        for(int i=0;i<no;i++){
            System.out.println("----Employee["+i+"]Details-----");
            System.out.print("Enter Employee ID:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name:");
            String eName=sc.nextLine();
            System.out.print("Enter Employee Designation:");
            String dsg=sc.nextLine();
            System.out.print("Enter Employee Dept NO:");
            int deptNo=sc.nextInt();

            emp[i]=new Employee(id,eName,dsg,deptNo);
        }

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Employee.txt"))){
            oos.writeObject(emp);
            System.out.println("Writing in FIle Done");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
