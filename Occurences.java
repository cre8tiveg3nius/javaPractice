import java.util.Arrays;

public class Occurences {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 10, 5, 12, 3, 5};

        Arrays.sort(arr);
        int numOfOccurences = 0;

        for (int i = 0, length =arr.length - 1; i <length; i++) {
            if (arr[i] == arr[i +1]) {
                numOfOccurences++;
            }
        }
        System.out.println("Number of same occurences :" + numOfOccurences);
        }
    }

