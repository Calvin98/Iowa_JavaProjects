

public class ArrayDemo2
{
   public static void main(String[] args)
   {
      final int SIZE = 3;             // Number of elements
      char[] array1 = new char[SIZE];  // Array 1
      char[] array2 = new char[SIZE];	// Array 2 
      
      array1[0] = 'P';
      array1[1] = 'K';
      array1[2] = 'A';
       
       // copy array1 into array2
      for (int index = 0; index < array1.length; index++)
      {
	  		array2[index] = array1[index];
	  }

      System.out.println("Array2 is: ");

      // Display Array2
      for (int index = 0; index <= array2.length; index++)
         System.out.println(array2[index] + " ");
   }
}     
