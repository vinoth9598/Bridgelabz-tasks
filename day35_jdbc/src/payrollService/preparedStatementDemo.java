package payrollService;

import java.sql.* ;

public class preparedStatementDemo {

    public static void main() throws Exception{
        readRecords();
        alterRecords();
        insertRecords();
        updateRecords();
        deleteRecords();
        aggregationRecords();
    }

    public static void readRecords() throws Exception{
        String url = "jdbc:Mysql://localhost:3306/employee_payroll";
        String userName = "root";
        String password = "12345";
        String query = "Select * from employee";

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();

        System.out.println("Id is " + rs.getInt(1));
        System.out.println("Name :" + rs.getString(2));
        System.out.println("Gender " + rs.getInt(3));

    }

    public static void alterRecords() throws Exception{
        String url = "jdbc:Mysql://localhost:3306/employee_payroll";
        String userName = "root";
        String password = "12345";
        String query = "Alter table employee add salary varchar(50) not null";

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();
        System.out.println("salary :" + rs.getString(5));
    }

    public static void insertRecords() throws Exception{

        int id = 5 ;
        String name = "Balamurugan";
        String gender = "m";
        String address = "50 Thirupanandal";

        String url = "jdbc:Mysql://localhost:3306/employee_payroll";
        String userName = "root";
        String password = "12345";
        String query = "insert into employee values (?,?,?,?)";

        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, gender);
        pst.setString(4, address);

        int rows = pst.executeUpdate();
        System.out.println("Number of rows affected " + rows);
        con.close();

    }

    public static void aggregationRecords() throws Exception{
        String url = "jdbc:Mysql://localhost:3306/employee_payroll";
        String userName = "root";
        String password = "12345";
        String query = "Select sum(salary) from employee";
        String query1 = "Select avg(salary) from employee";
        String query2 = "Select count(emp_id) form employee";
        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        ResultSet avgRs = st.executeQuery(query1);
        ResultSet countEmp = st.executeQuery(query2);

        System.out.println("sum of the salary is " + rs);
        System.out.println("Average of the salary is " + avgRs);
        System.out.println("Count the employee " + countEmp);
        rs.next();

    }

    public static void updateRecords() throws Exception{
        int id = 5 ;

        String url = "jdbc:Mysql://localhost:3306/employee_payroll";
        String userName = "root";
        String password = "12345";
        String query = "update employee set address = '123 west tambaram' where emp_id = " + id;

        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement pst = con.prepareStatement(query);

        int rows = pst.executeUpdate(query);
        System.out.println(" Number of rows affected :" + rows);
        con.close();
    }
    public static void deleteRecords() throws Exception{
        int id = 5 ;

        String url = "jdbc:Mysql://localhost:3306/employee_payroll";
        String userName = "root";
        String password = "12345";
        String query = "delete from employee where emp_id = " + id;

        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement pst = con.prepareStatement(query);

        int rows = pst.executeUpdate(query);
        System.out.println(" Number of rows affected :" + rows);
        con.close();
    }
}
