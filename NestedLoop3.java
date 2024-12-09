public class NestedLoop3 
{
    public static void main(String[] args) 
    {
       int num=4;
       int row,col;
       int magic = 0, deductor = 0, adder = 1;
       
       for(row = 1; row<=num; row++)
       {
            for (col=1; col<=num; col++)
            {
                if (col==1)
                {
                    magic = row;
                }
                else if ((col%2) == 0)
                {
                    magic = num*col - deductor;
                }
                else
                {
                    magic += adder;
                    
                }
                System.out.print(magic + "\t");
            }
        System.out.println();
        deductor++;
        adder += 2; //Basically incrementing by 2
        }
    }      
}
