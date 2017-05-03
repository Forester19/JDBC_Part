package view;

import model.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ConsoleHelperProjectsPart {
    private int select_id;
    private Scanner scanner = new Scanner(System.in);

    public void doEverythingWithProjectPart() {
        System.out.println("Select what you wanna do with projects part:\n" +
                "1 - show all projects\n" +
                "2 - add new project\n");
        select_id = scanner.nextInt();
    }

    public int getSelect_id() {
        return select_id;
    }

    public void setSelect_id(int select_id) {
        this.select_id = select_id;
    }

    public Project createNewProject() {
        Project project = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter information: \n+" +
                "1 - id of you project\n" +
                "2 - description\n" +
                "3 - cost\n");
        try {
            int idOfNewProject = bufferedReader.read();
            String description = bufferedReader.readLine();
            int cost = bufferedReader.read();
            project = new Project(idOfNewProject, description, cost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return project;
    }

}
