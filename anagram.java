import java.util.Arrays;
import java.util.Scanner;
public class anagram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        a=a.replaceAll("\\s","").toLowerCase();
        b=b.replaceAll("\\s","").toLowerCase();
        char[] array1=a.toCharArray();
        char[] array2=b.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if (Arrays.equals(array1,array2)){
            System.out.println("anagram");
        }else{
            System.out.println("not a anagram");
        }
        
        
        
        
    }
   
}
