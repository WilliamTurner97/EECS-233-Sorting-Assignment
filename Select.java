/** @author William Turner
  * SelectionSort class for sorting assignment
  * Note: Modified version of Select.java by Michael Main, available at 
  * http://www.cs.colorado.edu/~main/docs/Select.html
  * (Assignment was to make alterations and additions to provided example code/codes)
  */

public class Select {
   /** 
    * (Original Code Comment)
    * The main method illustrates the use of a selection sort to sort a 
    * small array.
    * @param args
    *   not used in this implementation
    **/
   public static void main(String[ ] args) {
     
      final String BLANKS = "  "; // A String of two blanks

      int[ ] data = {80, 10, 50, 70, 60, 90, 20, 30, 40, 0};

      // Print the array before sorting:
      System.out.println("Here is the entire original array:");
      
      for (int i = 0; i < data.length; i++) {
         System.out.print(data[i] + BLANKS);
      }  
      System.out.println( );

      // (Original Code Comment) Sort the numbers, and print the result with two blanks after each number.
      selectionSort(data, 0, data.length);
      
      System.out.println("I have sorted all but the first and last numbers.");
      System.out.println("The numbers are now:");
      
      for (int i = 0; i < data.length; i++) {
         System.out.print(data[i] + BLANKS);
      }
      System.out.println( );
   }
   
   
   /**
   * (Original Code Comment) 
   * Sort an array of integers from smallest to largest, using a selection sort
   * algorithm.
   * @param data
   *   the array to be sorted
   * @param first
   *   the start index for the portion of the array that will be sorted
   * @param n
   *   the number of elements to sort
   * <b>Precondition:</b>
   *   <CODE>data[first]</CODE> through <CODE>data[first+n-1]</CODE> are valid
   *   parts of the array.
   * <b>Postcondition:</b>
   *   If <CODE>n</CODE> is zero or negative then no work is done. Otherwise, 
   *   the elements of <CODE>data</CODE> have been rearranged so that 
   *   <CODE>data[first] &lt;= data[first+1] &lt; ... &lt;= data[first+n-1]</CODE>.
   * @exception ArrayIndexOutOfBoundsException
   *   Indicates that <CODE>first+n-1</CODE> is an index beyond the end of the
   *   array.
   * */
   public static void selectionSort(int[ ] data, int first, int n) {
     
      int i, j; // (Original Code Comment) Loop control variables
      int big;  // (Original Code Comment) Index of largest value in data[first]...data[first+i]
      int temp; // (Original Code Comment) Used during the swapping of two array values
      
      for (i = n-1; i > 0; i--) {  
        
         // (Original Code Comment) Calculate big as the index of the largest value in data[first]...data[first+i]:
         big = first;
         
         for (j = first+1; j <= first+i; j++) {
            if (data[big] < data[j])
               big = j;
         }
      
         // (Original Code Comment) swap data[first+i] with data[big]:
         temp = data[first+i];
         data[first+i] = data[big];
         data[big] = temp;
         
         /* (Author Comment)
          * runs through the data array and adds the element index, as well as "   " or " * ", with " * "
          * indicating that the sorted portion of the array is on the right
          */
            for (int q = 0; q < data.length; q++) {
           
              if (q == i-1)
                System.out.print(data[q] + " * ");
              else
                System.out.print(data[q] + "   ");
            }
            
            System.out.println();
         }
    }
}


