// // // // // Name:  
// // // // // Date: 
// // // //   
// // // // public class Sentence
// // // // {
// // // //    
// // // //    
// // // //    //Precondition:  str is not empty.
// // // //    //               Words in str separated by exactly one blank.
// // // //    public Sentence( String str )
// // // //    { 
// // // //       mySentence = str;
// // // //       
// // // //    }
// // // //    
// // // //    public int getNumWords()
// // // //    {  
// // // //       return myNumWords;  
// // // //    }
// // // //    
// // // //    public String getSentence()
// // // //    {
// // // //       return mySentence; 
// // // //    }
// // // //    
// // // //    //Returns true if mySentence is a palindrome, false otherwise.
// // // //    //calls the 3-arg isPalindrome(String, int, int)
// // // //    public boolean isPalindrome(String s, int start, int end)
// // // //    {
// // // //       if (start == end){
// // // //          return true;
// // // //       }
// // // //       return isPalindrome(mySentence, 0, mySentence.length()-1);
// // // //       // else if (s.charAt(start+1)==s.charAt(end-1)){ 
// // // // //       }
// // // //    }
// // // //    //Precondition: s has no blanks, no punctuation, and is in lower case.
// // // //    //Recursive method.
// // // //    //Returns true if s is a palindrome, false otherwise.
// // // //    public static boolean isPalindrome(  )
// // // //    {
// // // //       
// // // //    }
// // // //    //Returns copy of String s with all blanks removed.
// // // //    //Postcondition:  Returned string contains just one word.
// // // //    public static String removeBlanks( String s )
// // // //    {  
// // // //       
// // // //    }
// // // //    
// // // //    //Returns copy of String s with all letters in lowercase.
// // // //    //Postcondition:  Number of words in returned string equals
// // // //    //						number of words in s.
// // // //    public static String lowerCase( String s )
// // // //    {  
// // // //       
// // // //    }
// // // //    
// // // //    //Returns copy of String s with all punctuation removed.
// // // //    //Postcondition:  Number of words in returned string equals
// // // //    //						number of words in s.
// // // //    public static String removePunctuation( String s )
// // // //    { 
// // // //       String punct = ".,'?!:;\"(){}[]<>"; 
// // // //       
// // // //    }
// // // // }
// // 
// // //Amiti Ganguly 9/21/2023
// // public class Sentence
// // {
// //    private String mySentence;
// //    
// //    //Precondition:  str is not empty.
// //    //Words in str separated by exactly one blank.
// //    
// //    public Sentence(String str)
// //    { 
// //       mySentence = str;
// //    }
// //    
// //    public int getNumWords()
// //    {  
// //       int count = 0;
// //       boolean inWord = false;
// //       String result = "";
// //       
// //       for (int i = 0; i < mySentence.length(); i++) {
// //          char c = mySentence.charAt(i);
// //          
// //          
// //          if (c != ' ' && !inWord) {
// //             count++;
// //             inWord = true;
// //             result += c;
// //          } 
// //          
// //          else if (c == ' ' && inWord) {
// //             inWord = false;
// //          } else if (c != ' ') {
// //             result += c;
// //          }
// //       }
// //       
// //       mySentence = result;
// //       return count;
// //    }
// //    
// //    public String getSentence()
// //    {
// //       return mySentence; 
// //    }
// //    
// //    
// // //Returns true if mySentence is a palindrome, false otherwise.
// // //calls the 3-arg isPalindrome(String, int, int)
// //    
// //    public boolean isPalindrome(String s, int start, int end)
// //    {
// //       if (start >= end) {
// //          return true;
// //       }
// //       
// //       if (s.charAt(start) != s.charAt(end)) {
// //          return false;
// //       }
// //       
// // //Precondition: s has no blanks, no punctuation, and is in lower case.
// // //Recursive method.
// // //Returns true if s is a palindrome, false otherwise.
// // 
// //       return isPalindrome(s, start + 1, end - 1);
// //    }
// //    
// //    public boolean isPalindrome()
// //    {
// //       
// //       String cleanSentence = removePunctuation(lowerCase(removeBlanks(mySentence)));
// //       
// //       int length = cleanSentence.length();
// //       
// //       
// //       return isPalindrome(cleanSentence, 0, length - 1);
// //    }
// //    
// //    public String removeBlanks(String s)
// //    {  
// //       
// //       String result = "";
// //       
// //       for (int i = 0; i < s.length(); i++) {
// //          char c = s.charAt(i);
// //          if (c != ' ') {
// //             result += c;
// //          }
// //       }
// //       
// //       return result;
// //    }
// //    
// // //Returns copy of String s with all letters in lowercase.
// // //Postcondition:  Number of words in returned string equals number of words in s.
// // 
// //    
// //    public String lowerCase(String s)
// //    {  
// //       
// //       return s.toLowerCase();
// //    }
// //    
// // //Returns copy of String s with all punctuation removed.
// // //Postcondition:  Number of words in returned string equals number of words in s.
// // 
// //    
// //    public String removePunctuation(String s)
// //    { 
// //       String punct = ".,'?!:;\"(){}[]<>";
// //       
// //       
// //       for (char c : punct.toCharArray()) {
// //          s = s.replace(String.valueOf(c), "");
// //       }
// //       
// //       return s;
// //    }
// // }
// // 
// 
// 
// public Sentence(String str)
// {
//     mySentence = str;
//     myNumWords = getNumWords();
// }
// 
// public static boolean isPalindrome(String s, int start, int end)
// {
//     if (start >= end) {
//         return true;
//     }
// 
//     char leftChar = s.charAt(start);
//     char rightChar = s.charAt(end);
// 
//     if (leftChar == rightChar) {
//         return isPalindrome(s, start + 1, end - 1);
//     }
// 
//     return false;
// }
// 
// 
// public boolean isPalindrome()
// {
//     String cleanSentence = removePunctuation(lowerCase(removeBlanks(mySentence)));
//     return isPalindrome(cleanSentence, 0, cleanSentence.length() - 1);
// }
// 
// 
// public static String removeBlanks(String s)
// {
//     return s.replaceAll(" ", "");
// }
// 
// public static String lowerCase(String s)
// {
//     return s.toLowerCase();
// }
// 
// public static String removePunctuation(String s)
// {
//     return s.replaceAll("[.,'?!:;\"(){}\\[\\]<>]", "");
// }
// 
// 


public class Sentence
{
    private String mySentence;
    private int myNumWords;

    public Sentence(String str)
    {
        mySentence = str;
        myNumWords = getNumWords();
    }

    public int getNumWords()
    {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < mySentence.length(); i++) {
            char c = mySentence.charAt(i);

            if (c != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (c == ' ' && inWord) {
                inWord = false;
            } else if (c != ' ') {
                
                inWord = true;
            }
        }

        return count;
    }

    public String getSentence()
    {
        return mySentence;
    }

    public static boolean isPalindrome(String s, int start, int end)
    {
        if (start >= end) {
            return true;
        }

        char leftChar = s.charAt(start);
        char rightChar = s.charAt(end);

        if (leftChar == rightChar) {
            return isPalindrome(s, start + 1, end - 1);
        }

        return false;
    }

    public boolean isPalindrome()
    {
        String cleanSentence = removePunctuation(lowerCase(removeBlanks(mySentence)));
        return isPalindrome(cleanSentence, 0, cleanSentence.length() - 1);
    }

    public static String removeBlanks(String s)
    {
        return s.replaceAll(" ", "");
    }

    public static String lowerCase(String s)
    {
        return s.toLowerCase();
    }

    public static String removePunctuation(String s)
{
    return s.replaceAll("[.,'?!:;\"(){}\\[\\]<>]", "");
}
}

   //  public static void main(String[] args)
//     {
//         // Example usage and testing
//         Sentence sentence1 = new Sentence("A Santa lived as a devil at NASA.");
//         System.out.println("Number of words: " + sentence1.getNumWords());
//         System.out.println("Is it a palindrome? " + sentence1.isPalindrome());
// 
//         Sentence sentence2 = new Sentence("Flo, gin is a sin! I golf.");
//         System.out.println("Number of words: " + sentence2.getNumWords());
//         System.out.println("Is it a palindrome? " + sentence2.isPalindrome());
// 
//         Sentence sentence3 = new Sentence("Eva, can I stab bats in a cave?");
//         System.out.println("Number of words: " + sentence3.getNumWords());
//         System.out.println("Is it a palindrome? " + sentence3.isPalindrome());
//     }
// }
// 