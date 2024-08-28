public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "Hello World first program";
        int length = lastword(s);
        System.out.println(length);
    }
    public static int lastword(String s) {
        int i = s.length()-1;
        int length =0;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            length++;
        }
        return length;
    }
}
