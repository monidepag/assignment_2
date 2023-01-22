import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) 
    {
        int l, b, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        area = l * b;
        System.out.println("Area of rectangle:"+area);
    }

}
