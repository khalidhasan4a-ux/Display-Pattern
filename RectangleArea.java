import java.util.Scanner;

public class RectangleArea 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle : ");
        double width = sc.nextDouble();
        
        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        
        if (width <= 0 || height <= 0) 
	{
            System.out.println("Error : Width and height must be positive values.");
        } 
	else 
	{
            double area = width * height;
            double perimeter = 2 * (width + height);

	    System.out.println("Rectangle Calculation Results");
            System.out.println("Width : " + width);
            System.out.println("Height : " + height);
	    System.out.printf("The area of the rectangle is : %.2f\n", area);
	    System.out.printf("The Perimeter of the rectangle is : %.2f\n", perimeter);
        }
        
}
}
