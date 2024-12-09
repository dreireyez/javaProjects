import java.util.*;

public class ArrayTest
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        //declare number of elements inside the array
        System.out.print("Enter number of elements in array: ");
            int num = input.nextInt(); 
                
            String[] tite = new String[num];
            
            //initializing the array
            for (int i=0; i < tite.length; i++) {
                tite[i] = " ";
            }

            //input content of each element inside the array
            for (int i = 0; i < tite.length; i++) {
                System.out.print("Enter content of array at index " + i + ": ");
                input.nextLine();
                tite[i] = input.nextLine();
            }

        //display content of the array
        for (int i=0; i < tite.length; i++) {
            System.out.println(tite[i]);
        }

        input.close();
    
    }
}