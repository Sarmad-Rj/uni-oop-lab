package Lab_2;

public class Task_1 {
    public static void main (String[] args){
        Circle cr = new Circle();
        System.out.println("Default value: " + cr.radius);

        Circle cr1 = new Circle();
        float cr_1 = cr1.calculate(5);
        System.out.println("Given value: " + cr_1);


    }
}
