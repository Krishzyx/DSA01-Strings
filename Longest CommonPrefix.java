import java.util.*;
class Longest{

    public String longestCommonPrefix( String [] a){
        int size = a.length;
    // if size is zero return empty string 

    if ( size == 0)
    return " ";

    if(size == 1)
    return a[0];

   //sort the Strings

   Arrays.sort(a);

   //find min length from minimum and maximum string

   int end = Math.min(a[0].length(), a[size-1].length());

   // find the common prefix between the first and last string
   int i = 0;
   while( i< end && a[0].charAt(i)==a[size-1].charAt(i))
   i++;

   String pre = a[0].substring(0,i);
   return pre;
      }
      //diver code 
      public static void main(String [] args){
        Longest longest = new Longest();
        String [] input = {"geeksforgeeks","geeks","geek","geezer"};
        System.out.println("The longest Common prefix is: "+ longest.longestCommonPrefix(input));
      }
}
