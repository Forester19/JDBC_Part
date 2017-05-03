package dao;

import model.Customer;
import model.Project;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 02.05.2017.
 */
public class CustomersDAO  implements GenericDAO<Customer>{
    private static final String USERNAME = "root";
    private static final String POASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/sql_module_project?useSSL=false";
    private Connection connection;
    public CustomersDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, POASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        connection.close();
    }
    @Override
    public void create() {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public ArrayList<Customer> select() {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet res = statement.executeQuery("select * from customers");
            while (res.next()) {
                Customer customer = new Customer(res.getInt("id"), res.getString("name"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public void delete(Customer customer) {

    }
    public void addNewProjectToDB(Project project){
        String inset = "INSERT INTO companies (id, name) VALUES(" + project.getId() + ",'" + project.getName_description() + "'" +")";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(inset);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
