
public class LastLetterCount {
    public static void main(String[] args) {
        int count = 0;
        String j = "this is used for any tool and technology";
        String j2;
        String temp[] = j.split(" ");
        for (int i =0; i < temp.length; i++) {
            if (temp[i].trim().endsWith("s") || temp[i].trim().endsWith("y"))
                count++;
        }
        j2 = j.replaceFirst("this", "any");
        System.out.println("The total amount of words that end in s and y are: " +count);
        System.out.println("j2 = " + j);
        System.out.println("j = " + j2);
    }

}

