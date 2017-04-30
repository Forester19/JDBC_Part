package model;

/**
 * Created by Владислав on 28.04.2017.
 */
public class Developer extends BaseModel {
    private int experience;
    private int salary;

    public Developer(int id, String name_description, int experience, int salary) {
        super(id, name_description);
        this.experience = experience;
        this.salary = salary;

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId() + " " + getName_description() + " " + " " + getExperience() + " " + getSalary();
    }
}
