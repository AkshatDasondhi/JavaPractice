import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] heights = {168,179,171,170,166};
        for(int i = 0; i < 5 ; i++){
            System.out.println(heights[i]);
        }
        System.out.println("Number of Sudents : " + heights.length);
        System.out.println("Sorted Form : " );
        Arrays.sort(heights);
        for(int i = 0; i < 5 ; i++){
            System.out.println(heights[i]);
        }
    }
}