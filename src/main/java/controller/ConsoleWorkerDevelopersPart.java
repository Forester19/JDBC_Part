package controller;

import dao.DevelopersDAO;
import model.Developer;
import view.ConsoleHelperDevelopersPart;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ConsoleWorkerDevelopersPart {
    ConsoleHelperDevelopersPart consoleHelperDevelopersPart = new ConsoleHelperDevelopersPart();
    DevelopersDAO developersDAO = new DevelopersDAO();

    public void devPartDoing() {
        consoleHelperDevelopersPart.jobWithPosiblOfDevelopers();
        int res = consoleHelperDevelopersPart.getSel_id();
        switch (res) {
            case 1:
                for (Developer d : developersDAO.select()) {
                    System.out.println(d.toString());
                }
                break;
            case 2:
                developersDAO.addDeveloperToBD(consoleHelperDevelopersPart.creatingDeveloper());
                break;
        }
    }
}
