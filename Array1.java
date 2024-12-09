import java.util.Scanner;

public class Array1 
{
    public static void main(String[]args)
    {
    Scanner input = new Scanner(System.in);

    // Declare number of elements inside the array
    System.out.print("Enter number of elements in array: ");
    int num = input.nextInt();
    
    // Initialize the array
    String[] tite = new String[num];
    
    // Input content of each element inside the array
    for (int i = 0; i < tite.length; i++) {
        System.out.print("Enter content of array at index " + i + ": ");
        input.nextLine();
        tite[i] = input.nextLine();
    }
    
    // Display content of the array
    for (int i = 0; i < tite.length; i++) {
        System.out.println("Content of array at index " + i + ": " + tite[i]);
    }
    
    input.close();
}
    }    
