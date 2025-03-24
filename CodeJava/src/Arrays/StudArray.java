package Arrays;


import java.util.*;

class Student{
    int id;
    String name;
    String address;

    public Student(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void printData(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Address: "+address);
    }
}



public class StudArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] stu = new Student[numStudents];

        // Input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student address: ");
            String address = scanner.nextLine();

            stu[i] = new Student(id, name, address);
        }

        System.out.println("\nList of Students:");
        for (Student obj : stu) {
            obj.printData();
        }

    }
}

