package payrollService;

import java.sql.* ;
public class Jdbc_TransactionDemo {

    private static final String url = "jdbc:Mysql://localhost:3306/payrollservice";
    private static final String user = "root";
    private static final String pass = "12345";


    public static void main(String[] args){

        insertNewEmployee();
        deleteEmployee();
    }

    public static void insertNewEmployee() {
        Connection conn = null ;
        try{
            conn = DriverManager.getConnection(url, user, pass);

            conn.setAutoCommit(false);

//      insert new user

            String query = "insert into employee values (5, 'vijay', '50000'); " ;

            Statement st1 = conn.createStatement();

            int rows = st1.executeUpdate(query);

            System.out.println("insert new user successfully :" );

            conn.commit();

        }catch(SQLException e){
            System.out.println("Error occured. Rolling back changes");
            try{
                if(conn != null){
                    conn.rollback();
                }
            }catch(SQLException rollbackEx){
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        }finally{
            try{
                if(conn != null){
                    conn.close();
                    System.out.println("Database connection closed.");
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void deleteEmployee() {
        Connection con = null ;
        int id = 5 ;
        try{
            con = DriverManager.getConnection(url, user, pass);

            con.setAutoCommit(false);

            String query = "Delete from employee where id = " + id ;

            Statement st = con.createStatement();

            int rows = st.executeUpdate(query);

            System.out.println("Delete is successfully " + rows);

            con.commit();


        }catch(SQLException e){
           try{
               if(con != null){
                   con.rollback();
               }
           }catch(SQLException rollbackEx){
               rollbackEx.printStackTrace();
           }
            e.printStackTrace();
        }finally {
            try{
                if(con != null){
                    con.close();
                    System.out.println("Database connection failed ");
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

}
