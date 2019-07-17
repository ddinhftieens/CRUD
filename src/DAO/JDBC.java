package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class JDBC {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ExamProject", "sa", "Tjeens");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void save(customer e){
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into customer(Username,Pass,Email,Country) values (?,?,?,?)");
            preparedStatement.setString(1,e.getName());
            preparedStatement.setString(2,e.getPass());
            preparedStatement.setString(3,e.getMail());
            preparedStatement.setString(4,e.getCountry());
            preparedStatement.executeUpdate();
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void update(customer e){
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update customer set Username = ?, Pass = ?, Email = ?, Country = ? where ID = ?");
            preparedStatement.setString(1,e.getName());
            preparedStatement.setString(2,e.getPass());
            preparedStatement.setString(3,e.getMail());
            preparedStatement.setString(4,e.getCountry());
            preparedStatement.setInt(5,e.getID());
            preparedStatement.execute();
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void delete(int ID){
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customer where ID = ?");
            preparedStatement.setInt(1,ID);
            preparedStatement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static customer getCustomer(int ID){
        customer cs = new customer();
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customer where ID = ?");
            preparedStatement.setInt(1,ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                cs.setID(resultSet.getInt(1));
                cs.setName(resultSet.getString(2));
                cs.setPass(resultSet.getString(3));
                cs.setMail(resultSet.getString(4));
                cs.setCountry(resultSet.getString(5));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cs;
    }

    public static List<customer> getAllcustomer(){
        List<customer> list = new ArrayList<>();
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customer");
            while (resultSet.next()){
                customer cs = new customer();
                cs.setID(resultSet.getInt(1));
                cs.setName(resultSet.getString(2));
                cs.setPass(resultSet.getString(3));
                cs.setMail(resultSet.getString(4));
                cs.setCountry(resultSet.getString(5));
                list.add(cs);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
