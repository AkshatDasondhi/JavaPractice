import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String c = new String(ch1);
        String d = new String(ch2);
        if(c.equals(d)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        sc.close();
    }
}
