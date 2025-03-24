package ExecuteSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/CompanyData";
        String user="root";
        String password="AdminUser";
//        String query="delete from employees where id=40;";
        String query="update employees set job_title='Principal', salary=500000.0 where id=11;";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,user,password);
            Statement st=con.createStatement();
            int rowsAffected=st.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Data Deleted Successfully:"+rowsAffected);
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
