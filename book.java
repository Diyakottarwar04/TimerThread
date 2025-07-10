//design the classs which is display the name of the book and author of the book and the rating of the book.
import java.util.Scanner;
public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thenbook Name");
        String title = sc.nextLine();
        System.out.println("Enter the Author Name");
        String author = sc.nextLine();
        System.out.println("Enter the Rating of the book");
        int rating = sc.nextInt();
        System.out.println("Book title is : " + title);
        System.out.println("Book Author is : " + author);
        System.out.println("Book rating is : " + rating + " stars");
        sc.close();


        // String title="The Great Gatsby";
        // String author="F. Scott Fitzgerald";
        // int rating= 5;
        // System.out.println("Book title is : "+ title);
        // System.out.println("Book Author is : "+ author);
        // System.out.println("Book rating is : "+ rating + " stars");
        
    }
    
}

/*Today we have covered code flow of Java code,also the syntax the varaibles and data types as a revision which we have seen on the first day as well . 

  1. Now we will se how to take a input from the user  we use Scanner class  . Java need   Scanner to expect from the user . 
  2. So we will use the command import java.util.Scanner; 
    
  
let say for example ... class area after that we will create the scanner object. 
  Objects are nothing but our runtime entity. And we will create the object with the help of the following command  :
    Scanner sc = new Scanner(System.in);

Now we will prompt the user withnhelp of print statement. And we will the read the width same for the height. 

Now we will calculate the area with the same command and after that we will display the area 



*/