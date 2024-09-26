public class LogicalOperators8 {
    public static void main(String[] args) {
        int x =7;
        int y=5;
        int a = 5;
        int b = 9;

        boolean result = x>y || a<b; //T
        boolean result1 = x>y && a<b; //F
        boolean result2 = a>b;
        System.out.println(!result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
