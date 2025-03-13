package Lab_2;

public class Marks {
    int English, Math, Urdu, total;

    public Marks(){
        English = 0;
        Math = 0;
        Urdu = 0;
    }
    public Marks(int a, int b, int c){
        this.English = a;
        this.Math = b;
        this.Urdu = c;
    }

    public void displayMarks(){
        System.out.println("English: " + English + "\nMath: " + Math + "\nUrdu: " + Urdu + "\n");
    }

    public int calculate(){
        return total = English + Math + Urdu;
    }

    public void displayTotal(){
        System.out.println("Total: " + total);

    }
}
