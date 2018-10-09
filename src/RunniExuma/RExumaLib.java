package RunniExuma;

public class RExumaLib {
        /* This method checks whether a word is a Palindrome or not. */
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
/* This method replaces the forward slash in the data with dashes. e*/
        public static String dateStr(String date)
        {
                String month = date.substring(0, 2);
                String day = date.substring(3, 5);
                String year = date.substring(6);
                return (day + "_" + month + "_" + year);
        }
/* This method creates a multiplication table from 0 to a specified range. */
        public static int multiplicationTable(int base, int range){
                int i = 0;
                while (i<=range){
                        System.out.print(base * i + ",");
                        i++;
                }
                return i;
        }
/* This method adds up all the numbers from zero to a the number assigned as the input. */
        public static int sumUpTo(int n){
                int output = 0;
                int i = 1;
                while (i<=n){
                        output+=i;
                        i++;
                }
                return output;
        }

        /* This method detects and prints prime numbers. */
        public static boolean primePrinter(int n) {
                for(int i=2;i<n;i++) {
                        if(n%i==0)
                                return false;
                }
                return true;
        }

        /* This method creates encrypted messages using the Vigenere cipher. */
        public static String vigCypher(String message, String key) {
                String key = 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z';
                String output = message.substring(key)%26;
                return output;
        }
        }

