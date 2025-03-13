package Lab_3;
import java.util.Scanner;

public class Task_4_HotDogStand {
    private int id;
    private int hotDogsSold;

    public Task_4_HotDogStand(int id) {
        this.id = id;
        this.hotDogsSold = 0;
    }

    public void soldHotDogs(int quantity) {
        hotDogsSold += quantity;
    }

    public int getHotDogsSold() {
        return hotDogsSold;
    }

    public int getId() {
        return id;
    }

}
