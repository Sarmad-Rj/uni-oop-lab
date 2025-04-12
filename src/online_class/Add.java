package online_class;

public class Add {
    int A;
    int B;
    int C;
    int D;

    public Add(int a ,int  b){
        A = a;
        B = b;
    }
    public Add(int a ,int  b, int c){
        A = a;
        B = b;
        C = c;
    }

    public int add (){
        D = A + B;
        return D;
    }


    public void Display(){
        System.out.println("C = " + add());
    }
}
