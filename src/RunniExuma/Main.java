package RunniExuma;

public class Main{

    public static void main(String[] args){
        System.out.print(RExumaLib.isPalindrome("madam")); /* isPalindrome method- The word madam is a palindrome. */
        System.out.print(RExumaLib.dateStr("04/09/1981")); /* Beyonce's Birthday - dateStr Method */
        System.out.print(RExumaLib.multiplicationTable(0,12)); /* multiplicationTable method */
        System.out.print(RExumaLib.sumUpTo(10)); /* sumUpTo method */
        System.out.print(RExumaLib.primePrinter(6)); /* primePrinter method */




    }
/* This is the Vigenere encryption method. */
    public static void main(String[] args)
    {
        String key = "Vigenere Encryption";
        String message = "The United States is a settler colonialist project.";
        System.out.print(RExumaLib.vigCyph(message, key));
    }
}
