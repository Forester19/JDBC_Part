package view;

import model.Company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Владислав on 29.04.2017.
 */
public class ConsoleHelperCompaniesPArt {
    private int select_id;
    private Scanner scanner = new Scanner(System.in);
    public void jobWithPosiblOfCompanies(){
        System.out.println("Select what you wanna :\n" +
                "1 - show all companies\n"+
                "2 - add new company to db");
        select_id = scanner.nextInt();
    }

    public Company creatingNewCompany(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        Company company = null;
        System.out.println("Enter information : \n" +
                             "1 - id\n " + "2 - description\n");
        int id;
        String description;
        try {
            id =scanner.nextInt();
            description  = bufferedReader.readLine();
            company = new Company(id,description);
         } catch (IOException e) {
            e.printStackTrace();
        }
        return company;
    }

    public int getSelect_id() {
        return select_id;
    }

    public void setSelect_id(int select_id) {
        this.select_id = select_id;
    }
}
