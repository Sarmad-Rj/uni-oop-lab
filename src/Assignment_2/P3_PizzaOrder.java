package Assignment_2;

public class P3_PizzaOrder {
    private P3_Pizza[] pizzas;

    // Constructor
    public P3_PizzaOrder() {
        pizzas = new P3_Pizza[3]; // Up to three pizzas
    }

    // Add a pizza to the order
    public void setPizza(int index, P3_Pizza pizza) {
        if (index >= 0 && index < pizzas.length) {
            pizzas[index] = pizza;
        }
    }

    // Calculate total cost of the order
    public double calcTotalCost() {
        double totalCost = 0;
        for (P3_Pizza pizza : pizzas) {
            if (pizza != null) {
                totalCost += pizza.calcCost();
            }
        }
        return totalCost;
    }
}
