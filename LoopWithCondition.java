public class LoopWithCondition
{
    public static void main(String[] args) 
    {
            int theNumber = 23100, factor = 1;
            System.out.print("Factors of "+theNumber+" are ");
            do {
                if (factor != 1)
                {
                    if (theNumber % factor == 0)
                    {
                    theNumber = theNumber/factor;
                    System.out.print(factor+" ");
                    }
                    if ((theNumber % factor) !=0)
                    {
                        factor++;
                    }
                    if (factor > theNumber) {
                        factor = 0;
                    }
                }
                else
                    {
                        factor++;
                    }
            } while (factor != 0);
    }    
}
