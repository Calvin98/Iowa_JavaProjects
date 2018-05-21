/**
 * Auto Generated Java Class.
 */
public class ArraySum {

  public static void main(String[] args) { 
    int[] numbers = {30, 12, 40, 32, 67};
    
    int total = computeSum(numbers);
    
    System.out.println("The sum is " + total);
  }
  /** 
   * The computeSum method calculates the sum of the numbers in an array
   * @param value The array that you wish to process
   * @return int The sum of the numbers in the given array
   */
  public static int computeSum(int[] value)
  {
      int sum = 0;
    
      // Compute the sum of numbers in the value array
      for (int i = 0; i < value.length; i++)
      {
        sum = sum + value[i];
      }
      return sum;
  }
  
}
