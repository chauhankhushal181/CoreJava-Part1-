public class Ternary11 {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;
//        if (n%2==0) //5%2==1 so the remainder is 2
//            result = 10;
//        else
//            result = 20;
//        ?: //Ternary Operator

        result = n%2 ==0 ? 10 : 20; //5%2 == 0 remainder is not 0
        System.out.println(result);

    }
}
