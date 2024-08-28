public class valid_palindrome_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String palindrome = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = palindrome.length()-1;
        while(i<=j)
        {
            if (palindrome.charAt(i) != palindrome.charAt(j)) {
                System.out.println("not a palindrome");
            }
            else{
                System.out.println("palindrome");
            }
            i++;
            j--;
        }
    }
}
