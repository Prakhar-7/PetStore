package petshop.data;

import petshop.model.Category;
import petshop.model.Pet;
import java.util.*;

public class PetData {

    public static List<Category> loadData() {
        List<Category> categories = new ArrayList<>();

        // DOGS
        Category dogs = new Category("Dogs");
        dogs.pets.add(new Pet("Bulldog", 800, "2 years", "Male", "English Bulldog", "Healthy", 3));
        dogs.pets.add(new Pet("Golden Retriever", 600, "1 year", "Female", "Golden Retriever", "Healthy", 2));
        dogs.pets.add(new Pet("Labrador", 550, "10 months", "Male", "Labrador Retriever", "Vaccinated", 4));

        // CATS
        Category cats = new Category("Cats");
        cats.pets.add(new Pet("Persian Cat", 400, "1.5 years", "Female", "Persian", "Healthy", 4));
        cats.pets.add(new Pet("Siamese Cat", 350, "8 months", "Male", "Siamese", "Healthy", 5));
        cats.pets.add(new Pet("Maine Coon", 700, "2 years", "Male", "Maine Coon", "Vaccinated", 2));

        // BIRDS
        Category birds = new Category("Birds");
        birds.pets.add(new Pet("Parrot", 150, "6 months", "Female", "African Grey", "Healthy", 6));
        birds.pets.add(new Pet("Canary", 80, "4 months", "Male", "Yellow Canary", "Healthy", 10));
        birds.pets.add(new Pet("Lovebirds", 120, "5 months", "Pair", "Peach-faced Lovebird", "Healthy", 7));

        // FISH
        Category fish = new Category("Fish");
        fish.pets.add(new Pet("Goldfish", 20, "2 months", "Unknown", "Comet Goldfish", "Healthy", 20));
        fish.pets.add(new Pet("Betta Fish", 25, "3 months", "Male", "Siamese Fighting Fish", "Healthy", 15));

        categories.add(dogs);
        categories.add(cats);
        categories.add(birds);
        categories.add(fish);

        return categories;
    }
}
