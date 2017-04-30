package dao;

import model.Company;
import model.Project;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 29.04.2017.
 */
public class CompaniesDAO implements GenericDAO<Company> {
    private static final String USERNAME = "root";
    private static final String POASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/sql_module_project?useSSL=false";
    private Connection connection;

    public CompaniesDAO() {
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
    public void create() {

    }

    @Override
    public void update(Company company) {

    }

    @Override
    public ArrayList<Company> select() {
        ArrayList<Company> companies = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet res = statement.executeQuery("select * from companies");
            while (res.next()) {
                Company company = new Company(res.getInt("id"), res.getString("description"));
                companies.add(company);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }

    @Override
    public void delete(Company company) {

    }
    public void addNewCompanyToDB(Company company){
        String inset = "INSERT INTO companies (id, description) VALUES(" + company.getId() + ",'" + company.getName_description() + "'" + ")";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(inset);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        connection.close();
    }
}
