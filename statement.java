// // public class statement {
// //     public static void main(String[] args) {
// //     //     int a = 2;
// //     //     if(a % 2 == 0) {
// //     //         System.out.println("Even");
// //     //     } else {
// //     //         System.out.println("Odd");
// //     //     }


// //     }
// // }

// /* 
//   A telphone campany offer data packs as follows:
//    1.if uses is upto 1GB - No extra charge
//    2.if data usage is more than 1 GB but upto 3GB - Charge Rs.10 per GB beyound 1GB
//    3.If data usage is more than 3GB but upto 5GB - Charge Rs.20 per GB beyound 3GB+Rs.20 for previous 2GB Slab
//     for invalid ( Nagavtive data usage) - Print "Invalid Data Usage"

//     Write a JAVA program that takes data Usage in GB as input(as a double) and prints the total charge.

//     Ex. Input : 4.5GB
//     charges 0 - 1GB -> 0
//     charges  1 - 3GB -> 2GB * 10
//     charges 3- 4.5GB -> 1.5GB * 20
//  */

// import java.util.*;
// public class statement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double usage= sc.nextDouble();
//         double totalbill=0.0;
//         if(usage<0){
//             System.out.println("Usage cannot be negative");
//         }
//         else if(usage>0 && usage<1){
//             System.out.println("Low usage no billing");
//         }
//         else if(usage>=1 && usage<=3){
//             totalbill = usage*10;
//         }
//         else{
//             totalbill = usage*20+20;
//         }
//         System.out.println("The total bill is: "+totalbill);
//     }
// }


        


      

       

    

    