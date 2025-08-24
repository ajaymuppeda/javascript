# Method Overloading
```java
// package is a library 
package oops.lab;
public class MethodOverloading {

 // sum() with 2 int parameters
    int sum(int a, int b) {
        return a + b;
    }

    // sum() with 3 int parameters
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // sum() with 2 double parameters
    double sum(double a, double b) {
        return a + b;
    }

    // sum() with 2 float parameters
    float sum(float a, float b) {
        return a + b;
    }

  public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Sum of 10 and 20 (int): " + obj.sum(10, 20));
        System.out.println("Sum of 10, 20, and 30 (int): " + obj.sum(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5 (double): " + obj.sum(10.5, 20.5));
        System.out.println("Sum of 5.5f and 4.5f (float): " + obj.sum(5.5f, 4.5f));
  }
}
```