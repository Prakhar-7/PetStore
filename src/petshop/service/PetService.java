package petshop.service;

import petshop.model.Category;
import petshop.model.Pet;
import java.util.*;

public class PetService {

    private List<Category> categories;

    public PetService(List<Category> categories) {
        this.categories = categories;
    }

    public void getAllPets() {
        for (Category c : categories) {
            System.out.println("Category: " + c.name);
            for (Pet p : c.pets) {
                System.out.println(" - " + p);
            }
        }
    }

    public void addPet(String categoryName, Pet pet) {
        for (Category c : categories) {
            if (c.name.equalsIgnoreCase(categoryName)) {
                c.pets.add(pet);
                System.out.println("Pet added!");
                return;
            }
        }
        System.out.println("Category not found!");
    }

    public void deletePet(String name) {
        for (Category c : categories) {
            c.pets.removeIf(p -> p.name.equalsIgnoreCase(name));
        }
        System.out.println("Pet deleted!");
    }

    public void countByCategory() {
        for (Category c : categories) {
            System.out.println(c.name + ": " + c.pets.size());
        }
    }

    public void addNewCategory(String categoryName) {

        Category newcategory = new Category(categoryName);

        categories.add(newcategory);
        System.out.println("Category Added!");
    }

    public void deleteCategory(String categoryName){
        categories.removeIf(c -> c.name.equalsIgnoreCase(categoryName));
        System.out.println("Category deleted!");
    }
}
