package RunniExuma;

class RExumaLib

public static boolean isPalindrome(int n)
{
    String forward = ""+n;
    String backward = " ";
    for (int i =0; i<forward.length(); i++);
    {
        backward = forward.substring(i, i + 1) + backward;

        if (forward.equals(backward)) {
            return true;
        }
    }
}
}

public static String cutOut(String input){
    int index = 0;
        String output = "";
        while (index<input.length())
        {
            output = output + input.substring(index, index +2);
            )
        return output;
        }




public static void multiplyNumbers(String[] args) {
        int a;
        int b;
        int sum;
            for (a = 1; a <= 12; ++a) {
            for (b = 1; b <= 12; ++b) {
            sum = a * b;
        System.out.print(sum);
        if(sum < 10)
        {
            System.out.print("    ");
        }
        else if(sum >= 100)
        {
            System.out.print("  ");
        }e
        lse if(sum >= 10){
            System.out.print("   ");
        }

        }
        System.out.println();
        }
        }



       public static boolean primePrinter(int n) {
            for(int i=2;i<n;i++) {
                if(n%i==0)
                return false;
        }
        return true;
        }


