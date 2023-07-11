// Java program to find if a sentence is
// palindrome
 class pallindrom
{
    // To check sentence is palindrome or not
    static boolean sentencePalindrome(String str)
    {   
        int l = 0;
        int h = str.length()-1;
         
        // Lowercase string
        str = str.toLowerCase();
         
        // Compares character until they are equal
        while(l <= h)
        {
             
            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);
             
            // If there is another symbol in left
            // of sentence
            if (!(getAtl >= 'a' && getAtl <= 'z'))
                l++;
             
            // If there is another symbol in right
            // of sentence
            else if(!(getAth >= 'a' && getAth <= 'z'))
                h--;
             
            // If characters are equal
            else if( getAtl == getAth)
            {
                l++;
                h--;
            }
             
            // If characters are not equal then
            // sentence is not palindrome
            else
                return false;
        }
         
        // Returns true if sentence is palindrome
        return true;   
    }
     
    // Driver program to test sentencePallindrome()
    public static void main(String[] args)
    {
        String str = "Too hot to hoot.";
        if( sentencePalindrome(str))
          System.out.println("Sentence is palindrome");
        else
          System.out.println("Sentence is not" + " " +
                                         "palindrome");
    }
}
