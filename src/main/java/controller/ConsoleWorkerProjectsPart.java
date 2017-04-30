package controller;

import dao.ProjectsDao;
import model.Project;
import view.ConsoleHelperProjectsPart;

/**
 * Created by Владислав on 29.04.2017.
 */
public class ConsoleWorkerProjectsPart {
    ConsoleHelperProjectsPart consoleHelperProjectsPart = new ConsoleHelperProjectsPart();
    ProjectsDao projectsDao = new ProjectsDao();

    public void projPertDeoing(){
        consoleHelperProjectsPart.doEveryThinkWithProjectPart();
        int id =  consoleHelperProjectsPart.getSelect_id();
        switch (id){
            case 1:
                for (Project project: projectsDao.select()){
                    System.out.println(project.toString());
                }
                break;
            case 2:
                projectsDao.addNewProjectToDB(consoleHelperProjectsPart.createNewProject());
                break;
        }
    }
}
