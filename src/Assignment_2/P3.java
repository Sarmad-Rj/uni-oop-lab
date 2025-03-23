//Scenario 3: Pizza Order System
//A pizza delivery service requires a Pizza Order System to manage customer orders efficiently.
//Problem Statement:
//         Define a Pizza class with private instance variables for:
//                o size (small, medium, large)
//                o cheeseToppings
//                o pepperoniToppings
//                o hamToppings
// Implement constructors to initialize all variables.
//         Provide public getter and setter methods.
//         Implement calcCost() to compute the total cost:
//               o Small: $10 + $2 per topping
//               o Medium: $12 + $2 per topping
//               o Large: $14 + $2 per topping
//         Implement getDescription() to return the pizza details.
//         Create a PizzaOrder class that holds up to three Pizza objects and calculates the total cost.
//         Write a main method to test multiple pizzas and display their total cost.
package Assignment_2;

public class P3 {
    public static void main(String[] args) {
        P3_Pizza pizza1 = new P3_Pizza("large", 2, 1, 1);
        P3_Pizza pizza2 = new P3_Pizza("medium", 1, 2, 0);
        P3_Pizza pizza3 = new P3_Pizza("small", 0, 1, 1);

        P3_PizzaOrder order = new P3_PizzaOrder();
        order.setPizza(0, pizza1);
        order.setPizza(1, pizza2);
        order.setPizza(2, pizza3);

        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
        System.out.println("Total Order Cost: $" + order.calcTotalCost());
    }
}
