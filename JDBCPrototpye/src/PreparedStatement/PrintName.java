package PreparedStatement;

import java.sql.*;

public class PrintName {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/CompanyData";
        String user="root";
        String password="AdminUser";
        String query="SELECT * from employees where name=?";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,"Deepak");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String title=rs.getString("job_title");
                double salary=rs.getDouble("salary");

                System.out.println("------------------------");
                System.out.println("Employee Id: "+id);
                System.out.println("Employee Name: "+name);
                System.out.println("Employee Title: "+title);
                System.out.println("Employee Salary: "+salary);
            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Some Problem in SQL...");
        }
    }
}

