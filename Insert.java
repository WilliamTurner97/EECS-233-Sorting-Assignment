/** @author William Turner
  * Insert class for sorting assignment
  * Note: Modified version of Insert.java by Michael Main, available at
  *  http://www.cs.colorado.edu/~main/docs/Insert.html
  *  (assignment was to make alterations and additions to provided example code/codes)
  */
public class Insert {
  
   /** 
    * (Original Code Comment)
    * The main method illustrates the use of an insertion sort to sort a 
    * small array.
    * @param args
    *   not used in this implementation
    **/
  
   public static void main(String[ ] args) {
     
      final String BLANKS = "  "; // (Original Code Comment) A String of two blanks
      int i;                      // (Original Code Comment) Array index

      int[ ] data = {80, 10, 50, 70, 60, 90, 20, 30, 40, 0};

      // (Original Code Comment) Print the array before sorting:
      System.out.println("Here is the entire original array:");
      
      for (i = 0; i < data.length; i++)
         System.out.print(data[i] + BLANKS);
      
      System.out.println( );

      // (Original Code Comment) Sort the numbers, and print the result with two blanks after each number.
      
      insertionsort(data, 0, data.length);
      System.out.println("I have sorted all but the first and last numbers.");
      System.out.println("The numbers are now:");
      
      for (i = 0; i < data.length; i++)
         System.out.print(data[i] + BLANKS);
      
      System.out.println( );
   }
   
   /**
   * (Original Code Comment) 
   * Sort an array of integers from smallest to largest, using an insertion sort
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
   *   <CODE>data[first] &lt;= data[first+1] &lt;= ... &lt;= data[first+n-1]</CODE>.
   * @exception ArrayIndexOutOfBoundsException
   *   Indicates that <CODE>first+n-1</CODE> is an index beyond the end of the
   *   array.
   * */
   
   public static void insertionsort(int[ ] data, int first, int n) {
      int i, j;   // (Original Code Comment) Loop control variables
      int entry;  // (Original Code Comment) The element that is currently being inserted
      
      /* (Author Comment)
       * Goal: Run through data and perform insertion sorting
       * Iteration subgoal: shift data after first to the right; insert data at first in appropriate location 
       */
      for (i = 1; i < n; i++) {
        
         entry = data[first+i];
         
         /* (Author Comment)
          * Goal: Shift data after forst to the right
          * Iteration subgoal: move data at index j to index j-1
          */
         for (j = first+i; (j>first) && (data[j-1] > entry); j--) {
            data[j] = data[j-1]; 
         }
         data[j] = entry; 
         
         /* (Author Comment)
          * Goal: print array with marker for sorted portion
          * Iteration subgoal: print data at q with appropriate marker to the right
          */
         for (int q = 0; q < n; q++) {
        
             System.out.print(data[q]);
           
           if (q == i && q != 0)
             System.out.print(" * ");
           else
             System.out.print("   ");
         }
         
         System.out.println( );
      }
   } 
}


