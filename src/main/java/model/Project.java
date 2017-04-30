package model;

/**
 * Created by Владислав on 28.04.2017.
 */
public class Project extends BaseModel {
    private int cost;
    public Project(int id, String name_description, int cost) {
        super(id, name_description);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return getId() + " "  + getName_description() + " " + getCost();
    }
}
