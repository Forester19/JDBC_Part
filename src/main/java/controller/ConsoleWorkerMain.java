package controller;

import view.ConsoleHelper;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ConsoleWorkerMain {
    private ConsoleHelper consoleHelper = new ConsoleHelper();
    private ConsoleWorkerDevelopersPart consoleWorkerDevelopersPart = new ConsoleWorkerDevelopersPart();
    private ConsoleWorkerProjectsPart consoleWorkerProjectsPart = new ConsoleWorkerProjectsPart();
    private ConsoleWorkerCompaniesPart consoleHelperComp = new ConsoleWorkerCompaniesPart();
    private ConsoleWorkerSkillsPart skillsPart = new ConsoleWorkerSkillsPart();
    private ConsoleWorkerCustomersPart consoleWorkerCustomersPart = new ConsoleWorkerCustomersPart();
    public void dointEverythink(){
        consoleHelper.showPosibl();
        int id = consoleHelper.getSelectedId();
        switch (id){
            case 1 :
                consoleWorkerDevelopersPart.devPartDoing();
                break;
            case 2:
                consoleWorkerProjectsPart.projPartDoing();
                break;
            case 3:
                skillsPart.skillPartDoing();
                break;
            case 4:
                consoleHelperComp.comPartOfDoing();
                break;
            case 5:
                consoleWorkerCustomersPart.cusPartOFDoing();
                break;
        }
    }

}
