public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Division by Zero not Possible");
        } finally {
            System.out.println("Done Execution.");
        }
    }
}
