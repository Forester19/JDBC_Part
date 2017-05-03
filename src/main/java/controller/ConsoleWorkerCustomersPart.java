package controller;

import dao.CustomersDAO;
import model.Customer;
import view.ConsoleHelperCustomersPart;

/**
 * Created by Владислав on 02.05.2017.
 */
public class ConsoleWorkerCustomersPart {

 private ConsoleHelperCustomersPart consoleHelperCustomersPart = new ConsoleHelperCustomersPart();
 private CustomersDAO customersDAO = new CustomersDAO();

 public void cusPartOFDoing(){
     consoleHelperCustomersPart.doEverythingWithCustomersPart();
     int id = consoleHelperCustomersPart.getSelectId();

     switch (id){
         case 1:
             for (Customer customer : customersDAO.select()){
                 System.out.println(customer.toString());
             }
             break;
         case 2:
             break;
     }
 }
}
