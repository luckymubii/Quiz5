package Db;

import java.sql.*;

/**
 * Created by Lucky Ali 10/16/2019.
 */
public class DbConnection {
    private String dbURL = "jdbc:mysql://localhost:3306/eadlab3";
    private String username = "root";
    private String password = "";
    private Connection connection;
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,username,password);
            if(connection!=null){
                System.out.println("Success");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void insertData(String studentid,String uname,String paswrd,String email,String dbirth,String phone,String fee,String course,String gender,String qualification ){
        try {
            String sqlQuery = "INSERT INTO student(studentid,username,password,emailid,dbirth,phone,fee,course,gender,qualification) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, studentid);

            preparedStatement.setString(2, uname);
            preparedStatement.setString(3, paswrd);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, dbirth);
            preparedStatement.setString(6, phone);
            preparedStatement.setString(7, fee);
            preparedStatement.setString(8, course);
            preparedStatement.setString(9, gender);
            preparedStatement.setString(10, qualification);





            int noOfRowsInserted = preparedStatement.executeUpdate();
            if(noOfRowsInserted>0){
                System.out.println(noOfRowsInserted + " rows inserted!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(String username,String password,String firstname,String lastname,String dofbirth,String emailaddress,String username1){
        try {
            String sqlQuery = "UPDATE student Set username=?, password=?, firstname=?, lastname=?, dofbirth=?,emailaddress=? WHERE username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, firstname);
            preparedStatement.setString(4, lastname);
            preparedStatement.setString(5, dofbirth);
            preparedStatement.setString(6, emailaddress);
            preparedStatement.setString(7, username1);



            int noOfRowsInserted = preparedStatement.executeUpdate();
            if(noOfRowsInserted>0){
                System.out.println(noOfRowsInserted + " rows inserted!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet displayRecords(){
        ResultSet result = null;
        try {
            String sqlQuery = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            result = statement.executeQuery(sqlQuery);
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
            return result;
        }
    }
}
