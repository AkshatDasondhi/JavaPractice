import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        if (a.length() == b.length()){
            boolean bl = true;
            int count = 0;
            int x = 0;
            while(bl != false && x < a.length()){
                if (finder(ch2, ch1[x]) == true){
                    count++;
                }else {
                    bl = false;
                }
                x++;
            }
            if(count == a.length()){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }
        sc.close();
    }
    static boolean finder(char[] arr, char target){
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}