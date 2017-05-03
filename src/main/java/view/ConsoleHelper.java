package view;

import java.util.Scanner;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ConsoleHelper {
    private int selectedId;
    private Scanner scanner = new Scanner(System.in);

    public void showPosibl(){
        System.out.println("Select part what interested you : \n" +
        "1 - part of developers\n"  +
        "2 - part of projects\n" +
        "3 - part of skills\n" +
        "4 - part of companies\n"+
        "5 - part of customers \n");
        selectedId = scanner.nextInt();
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public int getSelectedId() {
        return selectedId;
    }
}
