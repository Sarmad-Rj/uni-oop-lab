package Lab_2;

public class Rectangle {
    public int height, width;


    public int CalculateArea(){
        return height*width ;
    }

//    public Rectangle(){
//        height = 2;
//        width = 5;
//    }

    public Rectangle(int h, int w) {
        height = h;
        width = w;
    }

}
