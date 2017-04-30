package dao;

import model.Developer;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 28.04.2017.
 */
public class DevelopersDAOTest {
    DevelopersDAO developersDAO = new DevelopersDAO();

    @Test
    public void create() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }
    @Ignore
    @Test
    public void addDeveloperToBD() throws Exception {
        Developer developer = new Developer(6, "Jack Jonson", 4, 6000);
        int first = developersDAO.select().size();
        developersDAO.addDeveloperToBD(developer);
        int second = developersDAO.select().size();
        assertEquals(first + 1, second);
    }
    @Test
     public void select() throws Exception {

        assertEquals(developersDAO.select().size(), 5);

    }

}