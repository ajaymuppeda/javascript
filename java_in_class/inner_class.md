# Inner Class
```java
package oops.lab;
public class MethodOverloading{

private String msg = "Hello from OuterClass!";

 class InnerClass {
        void display() {
            System.out.println("Message from InnerClass: " + msg);
        }
    }

 public static void main(String[] args) {
 	MethodOverloading obj = new MethodOverloading();
        MethodOverloading.InnerClass inner = obj.new InnerClass();  // Creating inner class object
	inner.display();
 }
}
```

## Step by Step explanation
1. package oops.lab;
- This is a package name 
- Packages in java are nothing but folder 
- The class is the part of oops.lab package

2. public  class methodoverloading{}
- This is the outer class named Method Overloading{}

