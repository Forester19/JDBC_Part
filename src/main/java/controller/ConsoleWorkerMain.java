package controller;

import view.ConsoleHelper;
import view.ConsoleHelperCompaniesPArt;

/**
 * Created by Владислав on 28.04.2017.
 */
public class ConsoleWorkerMain {
    ConsoleHelper consoleHelper = new ConsoleHelper();
    ConsoleWorkerDevelopersPart consoleWorkerDevelopersPart = new ConsoleWorkerDevelopersPart();
    ConsoleWorkerProjectsPart consoleWorkerProjectsPart = new ConsoleWorkerProjectsPart();
    ConsoleWorkerCompaniesPart consoleHelperComp = new ConsoleWorkerCompaniesPart();
    public void dointEverythink(){
        consoleHelper.showPosibl();
        int id = consoleHelper.getSelectedId();
        switch (id){
            case 1 :
                consoleWorkerDevelopersPart.devPartDoing();
                break;
            case 2:
                consoleWorkerProjectsPart.projPertDeoing();
                break;
            case 3:
                break;
            case 4:
                consoleHelperComp.comPartOfDoing();
                break;
        }
    }

}
