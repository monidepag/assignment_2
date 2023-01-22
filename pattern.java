import java.util.Scanner;
public class pattern {
    public static void main (String[] args)  
{ 

    System.out.print("Enter the number of rows::");
    Scanner sc=new Scanner (System.in);
    int number = sc.nextInt(); 

    int i, j; 
    for(i = number; i >= 1; i--) 

    { 

        for(j = i; j < number; j++) 

        { 

            System.out.print(" "); 

        }
        for(j = 1; j <= (2 * i - 1); j++) 

        { 

            System.out.print("*"); 

        } 
 System.out.println();
}
}
}
