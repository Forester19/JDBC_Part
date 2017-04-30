package view;

import model.Developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ConsoleHelperDevelopersPart {
    private int sel_id;
    private int id_dev;
    private String name_dev;
    private int exper_dev;
    private int salary_dev;
    private Scanner scanner = new Scanner(System.in);
    public void jobWithPosiblOfDevelopers(){
        System.out.println("Select what you wanna :\n" +
        "1 - show all developers\n"+
        "2 - add new developer to db");
      sel_id = scanner.nextInt();
    }

    public int getSel_id() {
        return sel_id;
    }

    public void setSel_id(int sel_id) {
        this.sel_id = sel_id;
    }
    public Developer creatingDeveloper(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter params: \n" +
                "1 - id \n " + " 2 - name \n"  + " 3 - experience \n" + " 4 - salary\n");
       int idOfNewDeveloper = scanner.nextInt();
        String nameOfNewDevloper = null;
        try {
            nameOfNewDevloper = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int experienceOfNewDeveloper = scanner.nextInt();
       int salaryOfNewDeveloper = scanner.nextInt();
        return new Developer(idOfNewDeveloper,nameOfNewDevloper,experienceOfNewDeveloper,salaryOfNewDeveloper);
    }

}
