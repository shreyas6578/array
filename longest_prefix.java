import java.util.Arrays;

public class longest_prefix {
    public static void main(String[] args) {

        String [] stirs = {"flower","flow","flight"};
        Arrays.sort(stirs );
        String first = stirs[0];
        String last = stirs[stirs.length-1];
        int index=0;
       while(index<stirs.length){
       if(first.charAt(index)==last.charAt(index)){
        index++;
       }
       else {
           break;
       }

       }
      System.out.println(first.substring(0,index));
       }
    }

