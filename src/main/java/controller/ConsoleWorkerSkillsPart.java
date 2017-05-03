package controller;

import dao.SkillDAO;
import model.Skill;
import view.ConsoleHelperSkillPart;

/**
 * Created by Владислав on 02.05.2017.
 */
public class ConsoleWorkerSkillsPart {

    private ConsoleHelperSkillPart consoleHelperSkillPart = new ConsoleHelperSkillPart();
    private SkillDAO skillDAO = new SkillDAO();
    public void skillPartDoing(){
        consoleHelperSkillPart.doEverythingWithSkillPart();
        int id = consoleHelperSkillPart.getSelectId();

        switch (id){
            case 1:
                for (Skill skill: skillDAO.select()){
                    System.out.println(skill.toString());
                }
                break;
            case 2:

        }
    }
}
