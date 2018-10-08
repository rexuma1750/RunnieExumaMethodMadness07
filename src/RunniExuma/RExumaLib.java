package RunniExuma;

public class RExumaLib {
        /* This method check whether a word is a Palindrome or not. */
        public static boolean isPalindrome (String str) {
                String reverse = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.substring(i, i+1);
                }
                if (reverse.equals(str)) {
                        return true;
                } else {
                        return false;
                }
        }
/* This method replaces the forward slash in the data with dashes. e*/
        public static String dateStr(String date) {
                String month = date.substring(0, 2);
                String day = date.substring(3, 5);
                String year = date.substring(6);
                return (day + "_" + month + "_" + year);
        }
/* This method creates a multiplication table from 0 to a specified range. */
        public static int multiplicationTable(int base, int range){
                int i = 0;
                while (i<=range){
                        System.out.print(base * i + " ");
                        i++;
                }
                return i;
        }
/* This method adds up all the numbers from zero to a the number assigned as the input. */
        public static int SumUpTo (int n){
                int output = 0;
                int i = 1;
                while (i<=n){
                        output+=i;
                        i++;
                }
                return output;
        }
        }

