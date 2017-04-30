package controller;

import dao.CompaniesDAO;
import model.Company;
import view.ConsoleHelperCompaniesPArt;

/**
 * Created by Владислав on 29.04.2017.
 */
public class ConsoleWorkerCompaniesPart {
    ConsoleHelperCompaniesPArt consoleHelperCompaniesPArt = new ConsoleHelperCompaniesPArt();
    CompaniesDAO companiesDAO = new CompaniesDAO();
    public void comPartOfDoing(){
        consoleHelperCompaniesPArt.jobWithPosiblOfCompanies();
        int id = consoleHelperCompaniesPArt.getSelect_id();
        switch (id){
            case 1:
                for (Company company: companiesDAO.select()){
                    System.out.println(company.toString());
                }
                break;
            case 2:
                companiesDAO.addNewCompanyToDB(consoleHelperCompaniesPArt.creatingNewCompany());
                break;
        }

    }
}
