// Name: Amiti Ganguly   
// Date: 9/15/2023
// import java.util.*;
// import java.io.*;
// public class PigLatin
// {
//    public static void main(String[] args) 
//    {
//    //   part_1_using_pig();
//       part_1_using_pig();
//       // part_2_using_piglatenizeFile();
//       
//       /*  extension only    */
//       // String pigLatin = pig("What!?");
//       // System.out.print(pigLatin + "\t\t" + pigReverse(pigLatin));   //Yahwta!?
//       // pigLatin = pig("{(Hello!)}");
//       // System.out.print("\n" + pigLatin + "\t\t" + pigReverse(pigLatin)); //{(Yaholle!)}
//       // pigLatin = pig("\"McDonald???\"");
//       // System.out.println("\n" + pigLatin + "  " + pigReverse(pigLatin));//"YaDcmdlano???"
//    }
// 
//       public static void part_1_using_pig()
//    {
//       Scanner sc = new Scanner(System.in); //input from the keyboard
//       while(true)
//       {
//          System.out.print("\nWhat word? ");
//          String s = sc.next();     //reads up to white space
//          if(s.equals("-1"))
//          {
//             System.out.println("Goodbye!"); 
//             System.exit(0);
//          }
//          String p = pig(s);
//          System.out.println( p );
//       }		
//    }
// 
//    public static final String punct = ",./;:'\"?<>[]{}|`~!@#$%^&*()";
//    public static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//    public static final String vowels = "AEIOUaeiou";
//    
//    public static String pig(String s)
//    {
//      
//      // if(s.length() == 0)
//         // return "";
//    
//       //remove and store the beginning punctuation 
//            
//            
//       //remove and store the ending punctuation 
//          
//          
//       //START HERE with the basic case:
//       //     find the index of the first vowel
//       //     y is a vowel if it is not the first letter
//       //     qu
//       
//       // if (s.contains(vowels)){
// //          String indexOfVowel = s.indexAt(vowels);
// //       }
// //      String basicCase = s.substring();
// 
//    String prefix = "";
//    String modifiedWord = "";
//    int firstVowelIndex = 0;
//    boolean flag = false;
//    boolean firstLetterVowel = false;
//    
//    if (vowels.contains(String.valueOf(s.charAt(0)))){
//       
//       firstLetterVowel = true;
//    }
//    
//    boolean isCapitalized = Character.isUpperCase(s.charAt(0));
//    
//    for(int i = 0; i < s.length(); i++){
//       char character = s.charAt(i);
//       CharSequence charConverted = String.valueOf(character);
//       
//       if(flag == true){
//          modifiedWord+=character;
//       }
//       if(vowels.contains(charConverted) && flag == false){
//             firstVowelIndex = i;
//             modifiedWord += character;
//             flag = true;
//          
//    
//       }
//       if(flag == false){
//          prefix += character;
//       }
//        
//    }
//    modifiedWord += prefix;
//    if(firstLetterVowel == true){
//       modifiedWord += "way";
//    }
//    else {
//       modifiedWord += "ay";
//    }
//    if(flag == false){
//       modifiedWord = "**** NO VOWEL ****";
//    }
//    // System.out.println(prefix);
// //    System.out.println(modifiedWord);
//    return modifiedWord;
//    
//    if (isCapitalized==true) {
//         modifiedWord = Character.toUpperCase(modifiedWord.charAt(0)) + modifiedWord.substring(1);
//     }
// 
//     return modifiedWord;
// }
//    
// //    boolean flag2 = false;
// //          if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(""+s.charAt(0))){
// //             s.toLowerCase();
// //             flag2=true;
// //             
// //          }
// //       }
//       
//       //return the piglatinized word 
//    //    if(flag2==true){
// //          return s
// //       }
// //       else{
// //          return s
// //       } 
// //       
// //    }
//    //System.out.println(firstVowelIndex);
//       
//       
//       //if no vowel has been found
//       
//       
//       //is the first letter capitalized?
//       
//       
//       //return the piglatinized word 
//       
//       
//       
//    }
// 
// 
// 
//    public static void part_2_using_piglatenizeFile() 
//    {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("input filename including .txt: ");
//       String fileNameIn = sc.next();
//       System.out.print("output filename including .txt: ");
//       String fileNameOut = sc.next();
//       piglatenizeFile( fileNameIn, fileNameOut );
//       System.out.println("Piglatin done!");
//    }
// 
// /****************************** 
// *  piglatinizes each word in each line of the input file
// *    precondition:  both fileNames include .txt
// *    postcondition:  output a piglatinized .txt file 
// ******************************/
//    public static void piglatenizeFile(String fileNameIn, String fileNameOut) 
//    {
//     Scanner infile = null;
//     PrintWriter outfile = null;
// 
//     try {
//         infile = new Scanner(new File(fileNameIn));
//         outfile = new PrintWriter(new FileWriter(fileNameOut));
// 
//         while (infile.hasNextLine()) {
//             String line = infile.nextLine();
//             String[] words = line.split("\\s+"); // Split the line into words
// 
//             for (String word : words) {
//                 // Remove leading/trailing punctuation
//                 word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
// 
//                 if (!word.isEmpty()) {
//                     String pigLatinWord = pig(word);
//                     outfile.print(pigLatinWord + " "); // Write the pig-latin word to the output file
//                 }
//             }
// 
//             outfile.println(); // Add a newline after processing each line
//         }
//     } catch (IOException e) {
//         System.out.println("Error: " + e.getMessage());
//         System.exit(1); // Terminate the program with an error code
//     } finally {
//         if (infile != null) {
//             infile.close();
//         }
//         if (outfile != null) {
//             outfile.close();
//         }
//     }
// 
//     System.out.println("Piglatin done!");
//    }
//    
//    /** EXTENSION: Output each PigLatin word in reverse, preserving before-and-after 
//        punctuation.  
//    */
//    public static String pigReverse(String s)
//    {
//       if(s.length() == 0)
//          return "";
//          
//       return "";   //just to compile   
//    }
// }

import java.util.*;
import java.io.*;

public class PigLatin {
   public static void main(String[] args) {
        // part_1_using_pig();
      part_1_using_pig();
        // part_2_using_piglatenizeFile();
   
        /* extension only */
        // String pigLatin = pig("What!?");
        // System.out.print(pigLatin + "\t\t" + pigReverse(pigLatin)); //Yahwta!?
        // pigLatin = pig("{(Hello!)}");
        // System.out.print("\n" + pigLatin + "\t\t" + pigReverse(pigLatin)); //{(Yaholle!)}
        // pigLatin = pig("\"McDonald???\"");
        // System.out.println("\n" + pigLatin + "  " + pigReverse(pigLatin));//"YaDcmdlano???"
   }

   public static void part_1_using_pig() {
      Scanner sc = new Scanner(System.in); // input from the keyboard
      while (true) {
         System.out.print("\nWhat word? ");
         String s = sc.next(); // reads up to white space
         if (s.equals("-1")) {
            System.out.println("Goodbye!");
            System.exit(0);
         }
         String p = pig(s);
         System.out.println(p);
      }
   }

   public static final String punct = ",./;:'\"?<>[]{}|`~!@#$%^&*()";
   public static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
   public static final String vowels = "AEIOUaeiou";
// 
//     public static String pig(String s) {
//     boolean flag = false;
//     String prefix = "";
//     String modifiedWord = "";
//     int firstVowelIndex = 0;
//     boolean firstLetterVowel = false;
// 
//     if (vowels.contains(String.valueOf(s.charAt(0)))) {
//         firstLetterVowel = true;
//     }
// 
//     boolean isCapitalized = Character.isUpperCase(s.charAt(0));
// 
//     for (int i = 0; i < s.length(); i++) {
//         char character = s.charAt(i);
//         CharSequence charConverted = String.valueOf(character);
// 
//         if (flag == true) {
//             modifiedWord += character;
//         }
//         if (vowels.contains(charConverted) && flag == false) {
//             firstVowelIndex = i;
//             modifiedWord += character;
//             flag = true;
//         }
//         if (flag == false) {
//             prefix += character;
//         }
//     }
// 
//     modifiedWord += prefix;
//     if (firstLetterVowel == true) {
//         modifiedWord += "way";
//     } else {
//         modifiedWord += "ay";
//     }
//     if (flag == false) {
//         modifiedWord = "**** NO VOWEL ****";
//     }
// 
//     if (isCapitalized == true) {
//         modifiedWord = Character.toUpperCase(modifiedWord.charAt(0)) + modifiedWord.substring(1);
//     }
// 
//     return modifiedWord;
// }

   public static String pig(String s) {
      String prefix = "";
      String modifiedWord = "";
      int firstVowelIndex = -1;
      boolean firstLetterVowel = false;
   
      if (vowels.contains(String.valueOf(s.charAt(0)))) {
         firstLetterVowel = true;
      }
   
      boolean isCapitalized = Character.isUpperCase(s.charAt(0));
   
      for (int i = 0; i < s.length(); i++) {
         char character = s.charAt(i);
         CharSequence charConverted = String.valueOf(character);
      
         if (firstVowelIndex == -1) {
            if (vowels.contains(charConverted)) {
               firstVowelIndex = i;
            }
         }
      
         if (firstVowelIndex != -1) {
            modifiedWord += character;
         }
      
         if (firstVowelIndex == -1) {
            prefix += character;
         }
      }
   
      if (firstVowelIndex == 0 || !Character.isLetter(s.charAt(0))) {
        // For words starting with non-alphabetic characters or where first letter is a vowel
         modifiedWord += "way";
      } else {
         modifiedWord += "ay";
      }
   
      if (prefix.isEmpty()) {
         modifiedWord = "**** NO VOWEL ****";
      }
   
      if (isCapitalized) {
         modifiedWord = Character.toUpperCase(modifiedWord.charAt(0)) + modifiedWord.substring(1);
      }
   
      return modifiedWord;
   }


   public static void part_2_using_piglatenizeFile() 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("input filename including .txt: ");
      String fileNameIn = sc.next();
      System.out.print("output filename including .txt: ");
      String fileNameOut = sc.next();
      piglatenizeFile( fileNameIn, fileNameOut );
      System.out.println("Piglatin done!");
   }

/****************************** 
*  piglatinizes each word in each line of the input file
*    precondition:  both fileNames include .txt
*    postcondition:  output a piglatinized .txt file 
******************************/
   public static void piglatenizeFile(String fileNameIn, String fileNameOut) 
   {
      // Scanner infile = null;
//       PrintWriter outfile = null;
//    
//       try {
//          infile = new Scanner(new File(fileNameIn));
//          outfile = new PrintWriter(new FileWriter(fileNameOut));
//       
//          while (infile.hasNextLine()) {
//             String line = infile.nextLine();
//             String[] words = line.split("\\s+"); // Split the line into words
//          
//             for (String word : words) {
//                 // Remove leading/trailing punctuation
//                word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
//             
//                if (!word.isEmpty()) {
//                   String pigLatinWord = pig(word);
//                   outfile.print(pigLatinWord + " "); // Write the pig-latin word to the output file
//                }
//             }
//          
//             outfile.println(); // Add a newline after processing each line
//          }
//       } catch (IOException e) {
//          System.out.println("Error: " + e.getMessage());
//          System.exit(1); // Terminate the program with an error code
//       } finally {
//          if (infile != null) {
//             infile.close();
//          }
//          if (outfile != null) {
//             outfile.close();
//          }
//       }
//    
//       System.out.println("Piglatin done!");
//    }
        Scanner infile = null;
        PrintWriter outfile = null;

        try {
            infile = new Scanner(new File(fileNameIn));
            outfile = new PrintWriter(new FileWriter(fileNameOut));

            while (infile.hasNextLine()) {
                String line = infile.nextLine();
                String[] words = line.split("\\s+"); 

                for (String word : words) {
                    //remove punc.
                    word = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

                    if (!word.isEmpty()) {
                        String pigLatinWord = pig(word);
                        outfile.print(pigLatinWord + " "); 
                    }
                }

                outfile.println(); 
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1); 
        } finally {
            if (infile != null) {
                infile.close();
            }
            if (outfile != null) {
                outfile.close();
            }
        }

        System.out.println("Piglatin done!");
    }
   /** EXTENSION: Output each PigLatin word in reverse, preserving before-and-after 
       punctuation.  
   */

   public static String pigReverse(String s) {
      if (s.length() == 0)
         return "";
   
      char[] wordChars = s.toCharArray();
      StringBuilder reversedWord = new StringBuilder();
      StringBuilder beforePunctuation = new StringBuilder();
      StringBuilder afterPunctuation = new StringBuilder();
   
      boolean beforePunctuationFlag = true;
   
      for (char c : wordChars) {
         if (punct.indexOf(c) != -1) {
            if (beforePunctuationFlag) {
               beforePunctuation.insert(0, c);
            } else {
               afterPunctuation.append(c);
            }
         } else {
            if (beforePunctuationFlag) {
               beforePunctuationFlag = false;
            }
            reversedWord.append(c);
         }
      }
   
      reversedWord.reverse();
      return beforePunctuation.toString() + reversedWord.toString() + afterPunctuation.toString();
   }
}