public class consonants {

    public static void main(String args[]){

        String j = "*a***e* a*e *e*e* **a* *a**a*e*"; //original string was "waffles are better than pancakes"
        int count = 0; //letter count
        int cCount =0; //consonant count

        for(int i=0; i<j.length();i++) {
            if(j.charAt(i)!=' ') {
                count++;
            }
           if(j.charAt(i)>'a' && j.charAt(i)<'z') {
               cCount++;
           }
        }
        System.out.println("Total number of characters are " +count);
        System.out.println("Total number of consonants are " +cCount);



    }
}






