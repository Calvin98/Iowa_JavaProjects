/**
   This program demonstrates passing individual array
   elements as arguments to a method.
*/

public class PassElements
{
   public static void main(String[] args)
   {
      	int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

	 
      	int total = sum(numbers);
      	
      	System.out.println("The sum is " + total);
   }

   /**
      The showValue method displays its argument.
      @param n The value to display.
   */

   public static int sum(int [] num)
   {
   	   	int total = 0;
      	for (int i = 0; i < num.length; i++)
      	{
      		total = total + num[i];
      	}
      	return total;
   }
}