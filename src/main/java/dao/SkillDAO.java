package dao;

import model.Project;
import model.Skill;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 02.05.2017.
 */
public class SkillDAO implements GenericDAO<Skill> {
    private static final String USERNAME = "root";
    private static final String POASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/sql_module_project?useSSL=false";
    private Connection connection;
    public SkillDAO() {
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
    public void update(Skill skill) {

    }

    @Override
    public ArrayList<Skill> select() {
        ArrayList<Skill> projects = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet res = statement.executeQuery("select * from skills");
            while (res.next()) {
                Skill skill = new Skill(res.getInt("id"), res.getString("description"));
                projects.add(skill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projects;

    }

    @Override
    public void delete(Skill skill) {

    }

    public void addNewProjectToDB(Project project){
        String inset = "INSERT INTO skills (id, description) VALUES(" + project.getId() + ",'" + project.getName_description() + "'" +")";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(inset);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
