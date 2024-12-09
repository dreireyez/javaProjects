public class NestedLoop1 
{
    public static void main(String[] args) 
    {
            int a=1,j;
            while (a<=3)
            {
                j=1;
                do
                {
                    if (a % 2 == j % 2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    j++;
                }while(j<=5);
            System.out.println();
            a++;
            }
    }    
}
