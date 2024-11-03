import java.util.Scanner;
public class vowels_an{
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the name: ");
      String a=scanner.nextLine();
      a=a.toLowerCase();
      int b=0;
      int c=0;
     
      for (int i=0;i<a.length();i++){
          char d=a.charAt(i);
          if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
              b++;
          }else{
              c++;
          }
      }
      System.out.println(b);
      System.out.println(c);
        
    }
    
}
