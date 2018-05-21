/**
   This program demonstrates that two variables can
   reference the same array.
*/

public class SameArray
{
   public static void main(String[] args)
   {
      int[] array1 = { 2, 4, 6, 8, 10 };
     
	  double avg = findAverage(array1);
	 
	  showArray(array1);
	  System.out.print("Average is: " + avg);
      System.out.println();

    
      // Change one of the elements using array1.
     //array1[0] = 200;


      // Change one of the elements using array2.
      //array2[4] = 1000;

      // copy array1 to array2
   /*   for (int index = 0; index < array1.length; index++)
      {
      		array2[index] = array1[index];
      }
      System.out.println();

      array2[4] = 1000;

     
      */
   }
   
   public static void showArray(int[] array)
   {
      // Display the array elements.
      for (int index = 0; index < array.length; index++)
         System.out.print(array[index] + " ");
   }
   
   public static double findAverage (int [] marksarray)
   {
   		double temp_avg = 0;
   		
   		for (int i = 0; i < marksarray.length; i++)
   		{
   			temp_avg += marksarray[i];
   		}
   		temp_avg /= marksarray.length;
   		
   		return temp_avg;
   		
   	}
}