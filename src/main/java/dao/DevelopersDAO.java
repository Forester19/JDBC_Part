package dao;

import model.BaseModel;
import model.Developer;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 28.04.2017.
 */
public class DevelopersDAO implements GenericDAO {
    private static final String USERNAME = "root";
    private static final String POASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/sql_module_project?useSSL=false";
    private Connection connection;

    public DevelopersDAO() {
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
    public void update(BaseModel baseModel) {

    }

    public ArrayList<Developer> select() {
        ArrayList<Developer> developers = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery("select * from developers");
            while (result.next()) {
                Developer developer = new Developer(result.getInt("id"),
                        result.getString("developer_name"),
                        result.getInt("experience"), result.getInt("salary"));
                developers.add(developer);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return developers;
    }

    @Override
    public void delete(BaseModel baseModel) {

    }

    /**
     * Method adds new object - developer to database;
     *
     * @param developer as object;
     */
    public void addDeveloperToBD(Developer developer) {
        String inset = "INSERT INTO developers(id, developer_name,experience,salary) VALUES(" + developer.getId() + ",'" + developer.getName_description() + "'," +
        developer.getExperience() + ","  +developer.getSalary()+")";
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
