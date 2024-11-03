import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the string that you want to reverse the string: ");
        String a=scanner.nextLine();
        String b= new StringBuilder(a).reverse().toString();
        if (a.equals(b)){
            System.out.println("The entered name is Palindrome");
        }else{
            System.out.println("The entered name is not palindrome");
        }

        
    }
    
}
