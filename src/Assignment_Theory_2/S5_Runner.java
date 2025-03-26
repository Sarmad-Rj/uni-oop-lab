package Assignment_Theory_2;

public class S5_Runner {
    public static void main(String[] args) { // HotDogStandSalesSystem
        // Create Three Hot Dog Stands
        S5_HotDogStand stand1 = new S5_HotDogStand("Stand001");
        S5_HotDogStand stand2 = new S5_HotDogStand("Stand002");
        S5_HotDogStand stand3 = new S5_HotDogStand("Stand003");

        // Simulate Sales
        stand1.justSold();
        stand1.justSold();
        stand1.justSold(); // Stand 1 sells 3 hot dogs

        stand2.justSold();
        stand2.justSold(); // Stand 2 sells 2 hot dogs

        stand3.justSold(); // Stand 3 sells 1 hot dog

        // Display Total Number of Hot Dogs Sold Per Stand
        System.out.println("Hot Dog Sales Tracking:");
        System.out.println(stand1.getStandId() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
        System.out.println(stand2.getStandId() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
        System.out.println(stand3.getStandId() + " sold " + stand3.getHotDogsSold() + " hot dogs.");
    }
}
