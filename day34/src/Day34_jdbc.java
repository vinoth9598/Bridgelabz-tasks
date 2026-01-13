
import java.sql.* ;
public class Day34_jdbc {

    public static void main(String[] args) throws Exception {

//        jdbc CRUD application
        readRecords();
        insertRecords();
        deleteRecords();
        updateRecords();

//        prepared Statement
        preparedStatementDemo preSt = new preparedStatementDemo();

    }

    public static void readRecords() throws Exception{
        String url = "jdbc:Mysql://localhost:3306/payrollservice";
        String userName = "root";
        String password = "12345";
        String query = "Select * from employee";

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement() ;

        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println("Id :" + rs.getInt(1));
            System.out.println("Name : " + rs.getString(2));
            System.out.println("Salary : " + rs.getInt(3));
        }

    }

    public static void insertRecords() throws Exception{
        String url = "jdbc:Mysql://localhost:3306/payrollservice";
        String userName = "root";
        String password = "12345";
        String query = "insert into employee values (5, 'saipriya',350000)";

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement() ;

        int rows = st.executeUpdate(query);

        System.out.println("Number of rows affected :" + rows );

        con.close();
    }

    public static void deleteRecords() throws Exception{
        int id = 5 ;

        String url = "jdbc:Mysql://localhost:3306/payrollservice";
        String userName = "root";
        String password = "12345";
        String query = "delete from employee where id = " + id;

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        int rows = st.executeUpdate(query);

        System.out.println("Number of rows affected :" + rows);

        con.close();
    }

    public static void updateRecords() throws Exception{
        int id = 4 ;
        double newSalary = 3000000.00 ;

        String url = "jdbc:Mysql://localhost:3306/payrollservice";
        String userName = "root";
        String password = "12345";
        String query = "update from employee set salary - " + newSalary + "where id = " + id ;

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        int rows = st.executeUpdate(query);

        System.out.println("Number of rows affected :" + rows);

        con.close();
    }
}
