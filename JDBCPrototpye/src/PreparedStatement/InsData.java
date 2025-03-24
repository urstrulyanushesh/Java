package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.util.Scanner;

public class InsData {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/CompanyData";
        String user="root";
        String password="AdminUser";
        String query="insert into employees(id,name,job_title,salary) values(?,?,?,?);";

        Scanner sc=new Scanner(System.in);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,user,password);
            PreparedStatement st=con.prepareStatement(query);
            System.out.print("Enter Employee Id:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name:");
            String name=sc.nextLine();
            System.out.print("Enter Employee Position:");
            String pos=sc.nextLine();
            System.out.print("Enter Employee Salary:");
            double sal=sc.nextDouble();
            st.setInt(1,id);
            st.setString(2,name);
            st.setString(3,pos);
            st.setDouble(4,sal);
            int rowsAffected=st.executeUpdate();

            if(rowsAffected>0){
                System.out.println("Data Inserted Successfully:"+rowsAffected);
            }
            else {
                System.out.println("Sorry");
            }
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Some Problem in SQL...:"+e.getMessage());
        }
    }
}

