public class ConditionalStatement9 {
    public static void main(String[] args) {
        int x =8;
        int y =8;
        int a =2;
        int b = 5;
        
        if(x>5)
            System.out.println("hello");
        if (x>10)
            System.out.println("hello");
        if(true)
            System.out.println("hello");
        if (false)
            System.out.println("hello");
        if (y>10 && y<=20) //8>10 && 8<=20 = False //11-20
            System.out.println("hello");
        if (x>10 && x<=20) //8>10 && 8<=20 = true //11-20
            System.out.println("hello");
            System.out.println("bye");

        if (x>10 && x<=20){
        System.out.println("hello");
        }else {
        System.out.println("bye");
             }

        if(a<b) {
            System.out.println(a);
            System.out.println("Thank You");
        }
        else {
            System.out.println(b);
        }



    }
}
