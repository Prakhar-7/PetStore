package petshop.model;

public class Pet {

    public String name;
    public int price;
    public String age;
    public String gender;
    public String breed;
    public String health_status;
    public int in_stock;

    public Pet(String name, int price, String age, String gender, String breed, String health_status, int in_stock ){
        this.name = name;
        this.price = price;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.health_status = health_status;
        this.in_stock = in_stock;
    }

    @Override
    public String toString() {
        return name + " (" + breed + ") - ₹"+ price;
    }
}
