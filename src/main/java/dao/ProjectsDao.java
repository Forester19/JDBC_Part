package dao;

import model.Project;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ProjectsDao implements GenericDAO<Project> {
    private static final String USERNAME = "root";
    private static final String POASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/sql_module_project?useSSL=false";
    private Connection connection;
    public ProjectsDao() {
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
    public void update(Project project) {

    }


    @Override
    public ArrayList<Project> select() {
        ArrayList<Project> projects = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet res = statement.executeQuery("select * from projects");
              while (res.next()) {
                  Project project = new Project(res.getInt("id"), res.getString("description"), res.getInt("cost"));
                  projects.add(project);
              }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projects;

    }

        @Override
    public void delete(Project project) {

    }
    public void addNewProjectToDB(Project project){
        String inset = "INSERT INTO projects (id, description, cost) VALUES(" + project.getId() + ",'" + project.getName_description() + "'," +
                project.getCost() + ")";
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
