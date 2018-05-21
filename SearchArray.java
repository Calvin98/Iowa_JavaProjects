/**
   This program sequentially searches an
   int array for a specified value.
*/

public class SearchArray
{
   public static void main(String[] args)
   {
      int[] tests = { 87, 75, 98, 100, 82 };
      boolean found = false;

      int value = 100;
      
      for (int i = 0; i < tests.length ; i++)
      {
        if ( value == tests[i] )
        {
          found = true;
          System.out.println ("Element found at index " + i );
          i = tests.length;
       }
      }
      if (!found) 
      {
        System.out.println ("Element is not found");
      }
   }
}