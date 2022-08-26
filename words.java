import java.util.Scanner;

public class words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String p = sc.nextLine();
        int count= countNumberOfWords(p);
        System.out.println("total words in this sentence = " +count);

    }

    private static int countNumberOfWords(String p) {
        int count = 0;
        if(p.charAt(0)!=' ');{
            count++;
    }
// checking to see spaces in between words in string
    for(int i=0;i<p.length();i++){
        if(p.charAt(i)==' ' && p.charAt(i+1)!=' '){
            count++;
        }
    }
        return count;
    }
}
