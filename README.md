# Factory Method - A design pattern odyssey <img align="left" src="https://media.giphy.com/media/ZEUODEtQiUZWGg6IHR/giphy.gif" width="40"/>
The Factory Method Pattern just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. Basically, subclasses are responsible to create the instance of the class. 


### The factory method structure:

* Creator - declares the factory method that returns the object of the Product class. This element can also define a basic implementation that returns an object of a basic ConcreteProduct (concrete product) class;
* ConcreteCreator (Concrete Creator) - overrides the factory method and returns an object of the ConcreteProduct class;
* Product (abstract product) - defines an interface for objects created by the factory method;
* ConcreteProduct (concrete product) - an implementation for the Product interface.

![Factory_Method_UML_class_diagram](https://user-images.githubusercontent.com/41343708/92502279-0658ce00-f1d6-11ea-95fc-b6c32a2bf77a.png)

### Advantages

- Factory Method Pattern allows the sub-classes to choose the type of objects to create.
- If I want to instantiate in many places, I don't have to repeat my condition, so when I come to add a new class, I don't run the risk of missing one.
- I can write 3 tests for the factory, to make sure it returns the correct types on the correct conditions, then my calling class only needs to be tested to see if it calls the factory and then the required methods on the returned class. It needs to know nothing about the implementation of the factory itself or the concrete classes.
- When someone decides we need to add a new class D to this factory, none of the calling code, neither unit tests or implementation, ever needs to be told. We simply create a new class D and extend our factory method. This is the very definition of Open-Closed Principle.

### Examples

So we created an interface that defines the polygon. 
```java
public interface Polygon {
    Integer getNumberOfSides();
}
```
Having the interface that defines a polygon, we now create our implementations.
```java
public class Triangle implements Polygon {
    public Integer getNumberOfSides() {
		return 3;
	}
}

public class Square implements Polygon {
    public Integer getNumberOfSides() {
		return 4;
	}
}

public class Pentagon implements Polygon {
    public Integer getNumberOfSides() {
		return 5;
	}
}
```
From now, we created our object factory, which knows exactly which class to instantiate.
```java
public class PolygonFactory {
    public static Polygon getPolygon(int numberOfSides) {
		if (numberOfSides == 3) {
			return new Triangle();
		}
		if (numberOfSides == 4) {
			return new Square();
		}
		if (numberOfSides == 5) {
			return new Pentagon();
		}
	}
}

```
