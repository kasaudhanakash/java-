
public class Main{
 public static void main(String[]args){
     int  num = 10;
     if (num > 0) {
         System.out.println("The number is positive");
     } else if (num < 0 ) {
         System.out.println("The number is negative");
     } else {
         System.out.println("The number is zero");
     }

     int day=3;
     String Day;
     switch (day)
     {
         case 1:
             Day="Sunday";
             break;

         case 2:
             Day="Monday";
             break;

         case 3:
             Day="Tuesday";
             break;

         case 4:
             Day="Wednesday";
             break;

         case 5:
             Day="Thursday";
             break;

         case 6:
             Day="Friday";
             break;

         case 7:
             Day="Saturday";
             break;

         default:
             Day="Invalid day";



     }
     System.out.println("day:" +Day);

     System.out.println("\n for loop:");
     for (int i=1; i<5; i++)
     {
         System.out.println("i="+i);

     }
     System.out.println("\n while loop;");
     int count =1;
     while (count<5) {
         System.out.println("count=" + count);
         count++;
     }
         System.out.println("\n Do-while loop:");
         int j=1;
         do {
             System.out.println("j"+j);
             j++;
         }
         while(j<=5);
     

 }
}