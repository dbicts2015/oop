// InterfacesTest.java
// Demonstrating polymorphism with interfaces.
package interfaces;

import javax.swing.JOptionPane;

public class TestAge
{
   public static void main( String[] args )
   {
      Tree tree = new Tree( 1978 );
      Person person = new Person( "Bob", "Jones", 1971 );

      // create array of Age references
      Age[] iAgeArray = new Age[ 2 ];
 
      // iAgeArray[ 0 ] refers to Tree object polymorphically
      iAgeArray[ 0 ] = tree;

      // iAgeArray[ 1 ] refers to Person object polymorphically
      iAgeArray[ 1 ] = person;

      // display tree information
      String output = tree + ": " + tree.getName() + "\nAge is " + 
         tree.getAge() + "\n\n";

      // display person information
      output += person + ": " + person.getName() + "\nAge is: " 
         + person.getAge() + "\n\n";

      // display name and age for each IAge object in iAgeArray
      for ( int i=0; i< iAgeArray.length; i++ )
      {
         output += iAgeArray[i].getName() + ": Age is " + 
            iAgeArray[i].getAge() + "\n";
      }

      JOptionPane.showMessageDialog(null, output);
      
   } // end method main

} // end class InterfacesTest
