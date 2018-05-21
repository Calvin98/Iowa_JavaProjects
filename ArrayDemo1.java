import java.util.Scanner;   // Needed for Scanner class

/**
   This program shows values being stored in an array's
   elements and displayed.
*/

public class ArrayDemo1
{
   public static void main(String[] args)
   {
      	int[][] scores = {
      	{23, 24, 120, 49},
      	{74, 92, 59, 20},
      	{48, 28, 49, 10}
      	};
      	
      	int[][] tscores  = new int [4][3];
     /*    Scanner keyboard = new Scanner(System.in);
        
     	for (int row = 0; row < 3; row++)
		{
		  	for (int col = 0; col < 4; col++)
			{
		    	System.out.print("Enter a score: ");
		    	scores[row][col] = keyboard.nextInt();
		  	}
		}
      */
      
      	for (int row = 0; row < 4; row++)
		{
		  	for (int col = 0; col < 3; col++)
			{
		    	tscores[row][col] = scores[col][row];
		  	}
		  	System.out.print("\n");
		}


    	for (int row = 0; row < 4; row++)
		{
		  	for (int col = 0; col < 3; col++)
			{
		    	System.out.print(tscores[row][col] + "\t");
		  	}
		  	System.out.print("\n");
		}


    }
}     

