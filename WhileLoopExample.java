// public class WhileLoopExample {
//     public static void main(String[] args){
//         int  i=1;
//         while(i<=5){
//             System.out.println(i);
//             i++;
//         }
//     }
    
// }
//Que. 1
//income tax calculator
//take  salary as input and calculator tax
//up to  to 2.5L - No Tax
//5L-5L - 5%
//above 10L- 30%
/*  if you are woman
   if u are senoir citizen your are eligible for tax free income
 */


/* Advance Que : Level Medium 
  Que 2. 
       Given an array of three positive integers, representing the sides of triangle, determine if they form a valid triangle 
       1. sum of any two sides greater than thirs sides.
 */

/*  */

 /*
     Que 1. level  Basis 
  Reverse the digit of the number (random num) and print it while loop 
 */

 public class WhileLoopExample{
    public static void main(String[] args){
         int num= 1234; // Example number to reverse
         int rev = 0;
         int temp = num;
         while(num!=0){
            int a = temp % 10;           
            rev = rev * 10 + a; 
            temp = temp / 10; 

                          
         }

          System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + rev);
          
    }
 }

//  int a = temp % 10;           
//             rev = rev * 10 + a; 
//             temp = temp / 10; 

