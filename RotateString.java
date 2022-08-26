
public class RotateString {
    public static void main(String args[]){
        String a = "Apple";

        char[] char2 = a.toCharArray();
        int size =char2.length;
        char last = char2[size-1];

        for (int i=size-1;i>0;i--) {

            char2[i] = char2[i-1];
        }
     char2[2] = last;

     StringBuffer sb = new StringBuffer();

     for(char c: char2) {

         sb.append(c);
     }
     System.out.println(sb);
    }
}


