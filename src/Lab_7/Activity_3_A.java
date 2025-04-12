package Lab_7;

public abstract class Activity_3_A {

    //abstract Method
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}
