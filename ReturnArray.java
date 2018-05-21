/**
   This program demonstrates how a reference to an
   array can be returned from a method.
*/

public class ReturnArray
{
   public static void main(String[] args)
   {
      double[] values =  {1.2, 2.3, 4.5, 6.7, 8.9 };

      values = getArray(values);
      
      for (int index = 0; index < values.length; index++)
         System.out.print(values[index] + "  ");
   }

   /**
      getArray method
      @return A reference to an array of doubles.
   */

   public static double[] getArray(double [] myarray)
   {
      //double[] array;
      
      for (int i = 0; i < myarray.length; i++)
      {
        myarray[i] = myarray[i] * myarray[i];  
      }

      return myarray;
   }
}
