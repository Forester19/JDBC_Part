package model;

/**
 * Created by Владислав on 02.05.2017.
 */
public class Customer extends BaseModel{

    public Customer(int id, String name_description) {
        super(id, name_description);
    }

    @Override
    public String toString() {
        return getId() + " " + getName_description();
    }
}
