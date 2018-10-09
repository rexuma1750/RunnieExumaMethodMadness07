package RunniExuma;

public class RExumaLib {
        /* This method checks whether a word is a Palindrome or not. I created a function
         * that reverses the word that is inputted, by taking its length and removes one character. If the reverse
         * result equals the initial word, then the method returns true. If they are not equal, it returns false. */
        public static boolean isPalindrome(String word) {
                String reverse = "";
                for (int i = word.length() - 1; i >= 0; i++) {
                        reverse += word.substring(i, i+1);
                }
                if (reverse.equals(word)) {
                        return true;
                } else
                        {
                        return false;
                }
        }
/* This method replaces the forward slash in the data with dashes.The three strings for
 day, year, and month select the numbers in between the slashes, resulting in the exclusion of the slashes.
 Finally, the method returned places "-" between the numbers, effectively replacing the forward
 slashes with dashes.*/
        public static String dateStr(String date)
        {
                String day = date.substring(3,5);
                String month = date.substring(0,2);
                String year = date.substring(6);
                return (day + "_" + month + "_" + year);
        }
/* This method creates a multiplication table from 0 to a specified range. The method prints the base that is inputted
 * multiplied by every number less than or equal to the range that is inputted. */
        public static int multiplicationTable(int base, int range){
                int i = 0;
                while (i<=range){
                        System.out.print(base * i + ",");
                        i++;
                }
                return i;
        }
/* This method adds up all the numbers from zero to a the number assigned as the input. The while function
 * of the method ensures that all the numbers from one to the number inputted are added together, noting
  * that while i is less than or equal to the number inputted, they will be added. */
        public static int sumUpTo(int n){
                int output = 0;
                int i = 1;
                while (i<=n){
                        output+=i;
                        i++;
                }
                return output;
        }

        /* This method detects and prints prime numbers in a specified sequence by dividing all the numbers between
         * zero and the terminating number of the sequence inputted, by 2 and returning the remainder.
         * If the remainder of the number divided by 2 is equal to zero, then it is not prime.
         * It is subsequently removed from the sequence of numbers by the indexOf function.
         * The else function directs all prime numbers to be printed out the system. */

        public static String primePrinter(int n) {
                for(int i = 2;i<n;i++) {
                        if (n % i == 0) {
                                 return String.indexOf(n);
                        } else {
                                System.out.print(n + " ");
                        }
                }


/* This method creates encrypted messages using the Vigenere cipher. In order to encrypt the message inputted, the char
* function takes every value of every character in the message that's a part of the alphabet and divides it by the number
* of letters in the alphabet (26) to  group them into 5 characters, and shifts its position using the String key. */

      public static String vigCyph(String message, String key){
                        String encryption = "";
                        String key = "Vigenere Encryption";
                        for (int i = 0; i < message.length(); i++) {
                                char c = message.charAt(i);
                                if (c < 'A' || c > 'Z') ;
                                encryption += (char) ((c + key.charAt(i) - 2 * 'A') % 26 + 'A');
                                ++i;
                                i = i % key;
                        }
                        return encryption;
                }



