public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s =" hello world end  ";
        int length=0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;

        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            length++;
        }
        System.out.println(length);
        StringBuilder result=new StringBuilder();
    }
}
