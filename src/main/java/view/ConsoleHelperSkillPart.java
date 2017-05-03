package view;

import java.util.Scanner;

/**
 * Created by Владислав on 02.05.2017.
 */
public class ConsoleHelperSkillPart {
    private int selectId;
    private Scanner scanner = new Scanner(System.in);


    public void doEverythingWithSkillPart(){
        System.out.println("Selet what you wanna:\n" +  " 1 - Show all skills \n " + " 2 - Add new skill\n");
           selectId = scanner.nextInt();
    }


    public int getSelectId() {
        return selectId;
    }

    public void setSelectId(int selectId) {
        this.selectId = selectId;
    }
}
