# BurgerHouse Order System (Java)

A Java console application simulating a simplified fast-food restaurant ordering system. This project demonstrates core Object-Oriented Programming (OOP) concepts, including inheritance, method overriding, and polymorphic behavior, to manage different meal items and calculate the total order cost.

## Project Structure

BurgerHouse/ 
├── Burger.java       # Base class for all burgers and specific subclasses (Cheeseburger, DeluxeBurger, etc.) 
├── Drink.java        # Base class for all drinks and specific subclasses (Cola, IceTea, Sprite, etc.) 
├── SideItem.java     # Base class for side orders and specific subclasses (MediumFries, LargeFries, etc.) 
├── Meal.java         # Class responsible for handling user input to create specific meal components. 
├── Main.java         # Main class containing the primary logic, user interface, and total cost calculation. 
└── README.md         # This file 

## How to Use

1. **Compile and Run:**
   Ensure all `.java` files are compiled, then run the main class:
   ```bash
   java Main
   ```
   **or**
   Run `Main` by clicking *Run* on IDE you are using (must be compatible with Java).
2. **Start Ordering:**
   The application will greet the user and ask if they want to order the classic set (Hamburger, small Water, Small Fries for 18zl).
3. **Custom Order Flow:**
   If the classic set is declined, the user is guided through the custom order process:
    * Burger Selection: Choose the type of burger (Cheeseburger, JalapenoBurger, Deluxe Burger, or Hamburger).
    * Toppings: Option to add extra toppings (Cheese, Meat, Bacon, Sauce). The system enforces different limits for regular burgers (max 3) and Deluxe Burger (max 2).
    * Drink Selection: Choose a drink type (Cola, IceTea, Sprite, or Water).
    * Volume Change: Option to change the drink volume (0.5l or 0.7l) which adjusts the price.
    * Side Item: Option to add a side order (Medium Fries, Large Fries, or Small Fries).
4. **Checkout:**
   The program continuously tracks and displays the running total cost.
5. **Reorder:**
   After the order is complete, the user is prompted to start a new order, demonstrating recursion in the order() method.

## Features
* **OOP Principles:** Extensive use of inheritance (e.g., Cola extends Drink), polymorphism (Burger.getBurger()), and encapsulation.
* **Meal Customization:** Allows detailed customization of burgers (toppings, limits) and drinks (volume change).
* **Price Calculation:** Dynamically calculates the total cost based on the chosen items and customizations.
* **Resource Management Simulation:** Handles different topping limits based on the burger type.
* **Console User Interface:** Provides a simple, interactive command-line interface for taking orders.

## Technologies
* **Java 17+** (Utilizes features like switch expressions in getDrink() and getBurger())
* **Object-Oriented Programming (OOP)**
* **Inheritance and Method Overriding** (toString() method for specific items)
* **Input Handling** (java.util.Scanner)
* **Control Flow** (if/else, switch, loops)

## Future Improvements
* Refactor Main.java to extract the ordering logic into the Meal class to improve separation of concerns (Single Responsibility Principle).
* Add error handling for invalid input types (e.g., catching NumberFormatException when parsing strings to integers).
* Introduce a base MenuItem interface or abstract class for all components (Burger, Drink, SideItem).
