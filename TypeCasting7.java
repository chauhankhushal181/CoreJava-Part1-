public class TypeCasting7 {
    public static void main(String[] args) {
        byte b = 125;
        int a = 256;
        b=(byte)a; //casting
        a=b;

        float f = 5.8f;
        int x =(int)f;

        byte c= 4;
        byte e = 5;
        int result=  c*a;

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        System.out.println(x);
        System.out.println(f);

    }
}
