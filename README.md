# Factory-Design-Pattern


The Factory Design Pattern is a creational design pattern used in object-oriented programming to create objects. The main idea is to define an interface or abstract class for creating an object, but let subclasses decide which class to instantiate. This pattern allows a class to defer instantiation to subclasses, promoting loose coupling and enhancing flexibility and scalability.

Key Concepts
Factory Method: A method that returns an instance of a class, typically a new one, without specifying the exact class.
Product: The type of object the factory method creates.
Creator: A class that contains the factory method.
Benefits
Encapsulation: The instantiation logic is encapsulated in one place.
Loose Coupling: The client code relies on the abstract product interface rather than concrete classes.
Scalability: Adding new products requires minimal changes to existing code.
Example
Suppose we have a Shape interface with multiple implementations like Circle, Square, and Rectangle. The factory method can be used to instantiate these shapes without exposing the instantiation logic to the client.
