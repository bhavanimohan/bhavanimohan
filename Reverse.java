import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the string that you want to reverse the string: ");
        String a=scanner.nextLine();
        String b= new StringBuilder(a).reverse().toString();
        System.out.println(b);;

        
    }
    
}
