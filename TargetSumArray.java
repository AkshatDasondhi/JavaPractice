public class TargetSumArray {
    public static void main(String[] args) {
        int[] myarr = {2, 3, 5, 6, 8, 12, 16, 18, 24};
        int target = 20;
        for (int i = 0; i < myarr.length ; i++){
            for (int j = 1 ; j < myarr.length ; j++){
                if((myarr[i] + myarr[j]) == target ){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}