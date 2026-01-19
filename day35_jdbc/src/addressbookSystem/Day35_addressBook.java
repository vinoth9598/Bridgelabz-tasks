package addressbookSystem;

import java.sql.* ;
public class Day35_addressBook {

    private static String url = "jdbc:Mysql://localhost:3306/addressbooksystem";
    private static String user = "root";
    private static String pass = "12345";

    public static void main (String[] args) throws SQLException{
        insertNew();
        insertMany();
        updateAndModify();
        deleteNew();
        viewAddressBook();
    }

    public static void insertNew() throws SQLException{
        Connection con = null ;
        try{
            con = DriverManager.getConnection(url, user, pass);

            con.setAutoCommit(false);
            Statement st = con.createStatement();

            String query = "Insert into addressbook values " +
                    "(3,'vinoth','kumar','24 west','chennai','Tamil Nadu','612 504','9898787676','vinoth@gmail.com','core java','Technical')";

            int row = st.executeUpdate(query);
            System.out.println("insert new address book System successfully..");

            con.commit();

        }catch(Exception e){
            if(con != null){
                con.rollback();
            }
            e.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
        }

    }

    public static void insertMany() throws SQLException{
        Connection con = null ;
        try{
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);

            int id = 4 ;
            String first_name = "Gokul";
            String last_name = "Krishnan";
            String address = "56 East street";
            String city = "Tambaram";
            String state = "Tamil nadu";
            String zip = "600 045";
            String phone_number = "8778767656";
            String email = "gokul@gmail.com";
            String address_book_name = "python";
            String address_book_type = "software";

            String query = "Insert into addressbook(id,first_name,last_name,address,city,state,zip,phone_number,email,address_book_name,address_book_type) values (?,?,?,?,?,?,?,?,?,?,?) ;";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, id);
            pst.setString(2, first_name);
            pst.setString(3, last_name);
            pst.setString(4, address);
            pst.setString(5, city);
            pst.setString(6, state);
            pst.setString(7, zip);
            pst.setString(8, phone_number);
            pst.setString(9, email);
            pst.setString(10, address_book_name);
            pst.setString(11, address_book_type);

            pst.addBatch();
            pst.executeBatch();

            System.out.println("New addressbook added successfully..");
            con.commit();

        }catch(Exception e){
            con.rollback();
            e.printStackTrace();
        }finally {
            con.close();
        }
    }

    public static void viewAddressBook() throws SQLException{
        String city = "chennai";

        Connection con = DriverManager.getConnection(url, user, pass);
        String query = "select * from addressbook where city='" + city +"'";
        Statement st = con.createStatement();

        ResultSet res = st.executeQuery(query);
        res.next();
        System.out.println("name :" + res.getString(2));
        String state = "Tamil nadu";
        String query1 = "Select * from addressbook where state ='"+state+"'";
        ResultSet res1 = st.executeQuery(query1);
        res1.next();
        System.out.println("Name is "+ res1.getString(2) + res1.getString(3));

    }
    public static void updateAndModify() throws SQLException{
        Connection con = null ;

        try{
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);

            String query1 = "Update addressbook set city = ? where first_name = ? ";
            PreparedStatement pst = con.prepareStatement(query1);

            pst.setString(1, "Kumbakonam");
            pst.setString(2, "vinoth");

            int rows = pst.executeUpdate();
            System.out.println("Address book is modify successfully..");
            con.commit();

        }catch(Exception e){
            if(con != null){
                con.rollback();
            }
            e.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
        }
    }

    public static void deleteNew() throws SQLException{
        Connection con = null ;
        try{
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);
            int id = 3 ;
            String query = "Delete from addressbook where id = ?"  ;
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, id);

            int rows = pst.executeUpdate();
            System.out.println("Delete successfully ..");
            con.commit();

        }catch(Exception e){
            if(con != null){
                con.rollback();
            }
            e.printStackTrace();
        }finally {
            if(con != null){
                con.close();
            }
        }
    }


}
