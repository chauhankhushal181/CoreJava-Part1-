public class IfElseIf10 {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;

        if (x>y && x>z) //8>7 && 8>9
            System.out.println(x); //False it will not print 8
        else if (y>x && y>z) //7>8 && 7>9
            System.out.println(y); //False it will not print 7
        else
            System.out.println(z);
    }
}