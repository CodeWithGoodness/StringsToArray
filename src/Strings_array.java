import java.util.*;
public class Strings_array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println ("Name: ");
     String name =   input.next();
        char[] my_name = name.toCharArray();
        System.out.println (my_name [0]);
    }
}
