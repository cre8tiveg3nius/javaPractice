public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        String strRev = new StringBuffer(str).reverse().toString();
        if (str.equals(strRev))
            System.out.println("this is a palindrome!");
        else
            System.out.println("this is not a palindrome.");
        }


    }