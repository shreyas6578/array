public class Plainmoid {
    public static void main(String[] args) {
        // Calling the method to check if a number is a palindrome
        boolean result = isPalindrome(121);  // Example input
        System.out.println("Is palindrome: " + result);
        String a ="vdovjaepfjv" ;
        char[] ac = a.toCharArray();
        int start =0;
        int End =ac.length-1;
        char temp ;
        while(start < End){
            temp = ac[start];
            ac[start] = ac[End];
            ac[End] = temp;
            start++;
            End--;

        }

        int x =1589;
        int resvere =0;
        while (x!=0){
            int digit = x%10;
            resvere = resvere*10 + digit;
            x = x/10;
        }

        System.out.println(resvere);
        if(a.equals(new String(ac))){
            System.out.println("Is palindrome");
        }
        System.out.println(ac);
    }



    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        int original = x;
int resverse =0;
while (x != 0) {
    int lastDigit = x % 10;
    resverse = resverse * 10 + lastDigit;
    x = x/10;
}

        // Check if the original number is equal to the reversed number
        return  original== resverse;
    }
}
