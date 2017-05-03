package model;

/**
 * Created by Владислав on 28.04.2017.
 */
public abstract class BaseModel {
    private int id;
    private String name_description;

    public BaseModel(int id, String name_description) {
        this.id = id;
        this.name_description = name_description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_description() {
        return name_description;
    }

    public void setName_description(String name_description) {
        this.name_description = name_description;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", name_description='" + name_description + '\'' +
                '}';
    }
}
