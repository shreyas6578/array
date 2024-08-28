import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        int [] array = {1,2,3,4,5};
      int c =  array.length;
      int a = list.size();
      System.out.println(a);
      int reversed =0;
      int x= 1223;
      while(x!=0){
          int digit = x % 10;
           reversed = reversed * 10 + digit;
          x /= 10;
      }

    }
}
