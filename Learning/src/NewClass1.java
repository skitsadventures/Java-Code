import java.util.Scanner;
public class NewClass1 {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter width of the room: ");
        double width = scanner.nextDouble();
        System.out.println("please enter length of the room: ");        
        double length = scanner.nextDouble();
        double area = width*length;
        
        System.out.println("Area of room is: " + area);
    }
}
