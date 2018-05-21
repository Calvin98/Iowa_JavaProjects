import java.util.ArrayList; // Needed for ArrayList class

/**
   This program demonstrates an ArrayList.
*/

public class ArrayListDemo1
{
   public static void main(String[] args)
   {
       // Create an ArrayList to hold some names.
       ArrayList<String> nameList = new ArrayList<String>();

       // Add some names to the ArrayList.
       nameList.add("James");
       nameList.add("Martin");
       nameList.add("Pradeep");
       // Display the size of the ArrayList.
       System.out.println("The ArrayList has " +
                         nameList.size() +
                         " objects stored in it.");

       // Now display the items in nameList.
       for (int index = 0; index < nameList.size(); index++)
          System.out.println(nameList.get(index));
       
       //System.out.println(nameList.remove(1));
       nameList.set(2, "John");
       // Display the size of the ArrayList.
       System.out.println("The ArrayList has " +
                         nameList.size() +
                         " objects stored in it.");
       
       // Now display the items in nameList.
       for (int index = 0; index < nameList.size(); index++)
          System.out.println(nameList.get(index));
/*
  nameList.add(26);

  int myvar1 = 20;

        double myvar2 = (double) myvar1;

  System.out.println(myvar2);

*/
    }

}