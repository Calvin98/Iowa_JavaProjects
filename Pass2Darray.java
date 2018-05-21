/**
   This program demonstrates methods that accept
   a two-dimensional array as an argument.
*/

public class Pass2Darray
{
   public static void main(String[] args)
   {
      int[][] numbers = { { 1,  2,  3,  4  },
                          { 5,  6,  7,  8  },
                          { 9, 10, 11, 12  } };

		int [][] temp_array = new int [3][4];
      // Display the contents of the array.
      System.out.println("Here are the values " +
                         " in the array.");
      temp_array = showArray(numbers);

	  for (int row = 0; row < temp_array.length; row++)
      {
         for (int col = 0; col < temp_array[row].length; col++)
             System.out.print(temp_array[row][col] + " ");
             
         System.out.println();
      }
      
      // Display the sum of the array's values.
      System.out.println("The sum of the values " +
                         "is " + arraySum(numbers));
   }

   /**
      The showArray method displays the contents
      of a two-dimensional int array.
      @param array The array to display.
   */

   private static int [][] showArray(int[][] array)
   {
      int [][] temp = new int[3][4];
      
     for (int col = 0; col < array[0].length; col++)
     {
         temp[0][col] = array[array.length-1][col];
         temp[1][col] = array[1][col];
         temp[array.length-1][col] = array[0][col];
     }
           
     return temp;
   }

   /**
      The arraySum method returns the sum of the
      values in a two-dimensional int array.
      @param array The array to sum.
      @return The sum of the array elements.
   */

   private static int arraySum(int[][] array)
   {
      int total = 0;   // Accumulator

      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
            total += array[row][col];
      }

      return total;
   }
}
