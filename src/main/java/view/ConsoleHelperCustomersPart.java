package view;

import java.util.Scanner;

/**
 * Created by Владислав on 02.05.2017.
 */
public class ConsoleHelperCustomersPart {
    private int selectId;
    private Scanner scanner = new Scanner(System.in);


    public void doEverythingWithCustomersPart(){
        System.out.println("Selet what you wanna:\n" +  " 1 - Show all customers \n " + " 2 - Add new customer\n");
        selectId = scanner.nextInt();
    }


    public int getSelectId() {
        return selectId;
    }

    public void setSelectId(int selectId) {
        this.selectId = selectId;
    }

}
