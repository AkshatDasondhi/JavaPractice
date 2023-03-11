import java.util.Arrays;

public class DistinctArrayElements {
    public static void main(String[] args) {
        int[] myarr = {1, 2, 3, 4, 4, 6, 6, 6, 7, 8, 8, 8, 8, 8};
        System.out.println(distinctElements(myarr));

    }

    static int distinctElements(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i = 1; i < arr.length ; i++){
            if(arr[i-1] != arr[i]){
                count++;
            }
        }
        return count+1;
    }
}