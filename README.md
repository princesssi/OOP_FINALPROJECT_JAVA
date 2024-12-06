I. A brief project overview
- The Restaurant Food Ordering System is a console-based Java application that simplifies food ordering in a restaurant. It allows users to browse the menu, place orders, view receipts, and even make a small contribution to food programs supporting the fight against hunger. The system focuses on providing a seamless ordering experience while promoting social good.

II. Explanation of how OOP principles were applied

* Encapsulation
- Data and methods related to menu items, orders, and customers are encapsulated in dedicated classes. For instance, the Menu class contains all details about food items, while the Order class handles the order process. Access to these classes' properties is restricted using private variables and public getter and setter methods.

* Inheritance
- A base class (e.g., User) is extended by subclasses (e.g., Customer and Admin), inheriting common attributes like names and roles while adding unique functionalities.
Polymorphism

* Polymorphism is used in methods like calculateTotal(), which works differently for regular orders and special promotions. Overriding allows a child class to provide its version of a method, enhancing flexibility.
Abstraction

* Abstract classes and interfaces are used to define a framework for operations like Payment or Donation, leaving the details to be implemented by specific classes.

III. Details of the chosen SDG and its integration into the project
- This project integrates SDG 2: Zero Hunger by offering customers the option to donate to food programs after completing their orders. By incorporating this feature, the system helps raise awareness about global hunger and provides an easy way for users to contribute to the cause.

* Example:
After placing an order, the program prompts the customer to donate a small amount. These donations can be directed toward local or global organizations addressing food security.

IV. Instructions for running the program

* Prerequisites
- Install Java Development Kit (JDK) (version 8 or higher).
- Use a Java IDE like IntelliJ IDEA, Eclipse, or any text editor with Java support.
- Ensure you have a working environment for Swing (Java's GUI framework).

* Steps to Run:

1. Download or clone this project to your local machine.
2. Open the project in your Java IDE.
3. Compile and run the RestaurantGUI class.
4. Follow the on-screen instructions to:
- Register as a new customer or log in as an existing customer.
- View the menu, add items to your cart, and proceed to place order.
- Optionally donate to the hunger relief program.
- View your receipt and decide to log out or order again.
