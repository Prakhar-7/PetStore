package petshop;
import java.util.Scanner;
import petshop.data.PetData;
import petshop.model.Pet;
import petshop.service.PetService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PetService service = new PetService(PetData.loadData());
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("PET STORE MENU :-");
            System.out.println("1. View All Pets");
            System.out.println("2. Add Pet");
            System.out.println("3. Delete Pet");
            System.out.println("4. Count Pets by Category");
            System.out.println("5. Add Category");
            System.out.println("6. Delete Category");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    service.getAllPets();
                    break;

                case 2:
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Age: ");
                    String age = sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Breed: ");
                    String breed = sc.nextLine();

                    System.out.print("Enter Health Status: ");
                    String health = sc.nextLine();

                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();

                    Pet pet = new Pet(name, price, age, gender, breed, health, stock);
                    service.addPet(category, pet);
                    break;

                case 3:
                    System.out.print("Enter pet name to delete: ");
                    String deleteName = sc.nextLine();
                    service.deletePet(deleteName);
                    break;

                case 4:
                    service.countByCategory();
                    break;

                case 5:
                    System.out.print("Enter Name: ");
                    String categoryName = sc.nextLine();
                    service.addNewCategory(categoryName);
                    break;

                case 6:
                    System.out.println(("Enter category name to delete: "));
                    String deleteCategoryName = sc.nextLine();
                    service.deleteCategory(deleteCategoryName);
                    break;
                case 7:
                    System.out.println("Exiting");
                    return;

            }
        }
    }
}
