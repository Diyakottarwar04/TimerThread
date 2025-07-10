// public class Area{
//     public static void main(String[] args) {
//         // Rectangle area
//         int l = 5;
//         int b = 10;
//         int rectArea = l * b;
//         System.out.println("Area of Rectangle: " + rectArea);

//         // Square area
//         int side = 4;
//         int squareArea = side * side;
//         System.out.println("Area of Square: " + squareArea);

//         // Triangle area
//         double breadth = 5;
//         double length = 10;
//         double triangleArea = 0.5 * breadth * length;
//         System.out.println("Area of Triangle: " + triangleArea);
//     }
// }

// // public class rectArea {
// //     public static void main(String[] args) {
// //         int l=5;
// //         int b=10;
// //         int area = l * b;
// //         System.out.println("Area of rectangle: " + area);
        
// //     }
// // }

// // public class squareArea{
// //     public static void main(String[] args) {
// //         int side=4;
// //         int area=side * side;
// //         System.out.println(("Area of square: " + area));
// //     }
// // }

// //Area of the triangle
// // public class triangleArea{
// //     public static void main(String[] args) {
// //     double breadth = 5;
// //     double length=10;
// //     double area= ((0.5)*(breadth*length));
// //     System.out.println("Area of Triangle  :" + area);
// //     }
// // }

//perimeter of rectangle

import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width :");
        int w = sc.nextInt();
        System.out.println("Enter height :");
        int h = sc.nextInt();
        int perimeter = 2 * (w + h);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        // int w=sc.nextInt();
        // System.out.println("Enter height :");
        // int h=sc.nextInt();
        // int area = w * h;
        // System.out.println("Area of Rectangle: " + area);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
/* Whenever we are using OOPS so the first feature  
     Classes and Objects : which we have seen through multiple examples. 
     The other features of OOPS are Encalpsulation , Abstraction , Polymorphism and Inheritance.

    1. Encapsulation : is nothing but binding the data and the methods together in a single unit.
    
 
 */