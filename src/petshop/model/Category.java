package petshop.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    public String name;
    public List<Pet> pets;

    public Category(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }
}
