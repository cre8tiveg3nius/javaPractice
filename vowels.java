public class vowels {

    public static void main(String[] args) {

        String str = "i am an amazing guy.";
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a' ||  str.charAt(j) == 'e'
            ||  str.charAt(j) == 'i'
            ||  str.charAt(j) == 'o'
            ||  str.charAt(j) == 'u' ) {
                count++;
            }
        }
        System.out.println("the total numbers of vowels in string are: " + count);

        //To confirm how many vowels are in the current string
        System.out.println("Does str contains a " + str.contains("a"));
        System.out.println("Does str contains e " + str.contains("e"));
        System.out.println("Does str contains i " + str.contains("i"));
        System.out.println("Does str contains o " + str.contains("o"));
        System.out.println("Does str contains u " + str.contains("u"));
        System.out.println();


    }
}
