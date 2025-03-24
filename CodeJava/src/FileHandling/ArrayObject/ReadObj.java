package FileHandling.ArrayObject;

import java.io.*;

public class ReadObj implements Serializable {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.txt"))) {
            Employee[] employees = (Employee[]) ois.readObject(); // Read the array of Employee objects

            // Print details of each employee
//            for (Employee emp : employees) {
//                emp.printDetails();
//            }

            for (int i = 0; i < employees.length; i++) {
                employees[i].printDetails();
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
