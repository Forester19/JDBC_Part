package model;

/**
 * Created by Владислав on 29.04.2017.
 */
public class Company extends BaseModel {
    private int id;
    private int description;
    public Company(int id, String name_description) {
        super(id, name_description);
    }

    @Override
    public String toString() {
        return getId() + " " + getName_description();
    }
}
