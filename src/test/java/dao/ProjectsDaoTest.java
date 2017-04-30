package dao;

import model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 29.04.2017.
 */
public class ProjectsDaoTest {
 ProjectsDao projectsDao = new ProjectsDao();
    @Test
    public void create() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void select() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void addNewProjectToDB() throws Exception {
           int first = projectsDao.select().size();
        Project project = new Project(6, "AppStore",10000);
               projectsDao.addNewProjectToDB(project);
           int second = projectsDao.select().size();
        assertEquals(first + 1, second);
    }

}