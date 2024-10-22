import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
       

        int i = 0;
        
        while(i<numbers.size()){
            System.out.println(numbers.get(i));

            i = i + 1;

        }

    }
}


 //Write code that will:
    //1. Store the following values in an ArrayList: 6, 3, 1, 2
    //   The name of the ArrayList is up to you.
    //2. Print the contents of your ArrayList using loops. This should work even if 
    //   I add more elements to your ArrayList. For example, I might add 7 to the
    //   ArrayList and this should still work.