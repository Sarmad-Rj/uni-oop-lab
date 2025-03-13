package Lab_3;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Task_4_HotDogStand stand1 = new Task_4_HotDogStand(1);
        Task_4_HotDogStand stand2 = new Task_4_HotDogStand(2);
        Task_4_HotDogStand stand3 = new Task_4_HotDogStand(3);

        Task_4_HotDogStand[] stands = {stand1, stand2, stand3};

        while (true) {
            System.out.println("Select a hotdog stand that sold hotdogs hot dogs:");
            System.out.println("1. Stand 1");
            System.out.println("2. Stand 2");
            System.out.println("3. Stand 3");
            System.out.println("4. Exit");


            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            } else if (choice < 1 || choice > 3) {
                System.out.println("Stand not available. Please try again.");
                continue;
            }

            System.out.print("Enter the number of hot dogs to sell: ");
            int quantity = scanner.nextInt();

            Task_4_HotDogStand selectedStand = stands[choice - 1];
            selectedStand.soldHotDogs(quantity);

            System.out.println("Hot Dog Stand " + stand1.getId() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
            System.out.println("Hot Dog Stand " + stand2.getId() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
            System.out.println("Hot Dog Stand " + stand3.getId() + " sold " + stand3.getHotDogsSold() + " hot dogs.");

        }



}
}
