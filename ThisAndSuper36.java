class a {
    public a(){
        super();
        System.out.println("in a");
    }
    public a(int n){
        super();
        System.out.println("in a int ");
    }
}

class b extends a{
    public b(){
        super(); //super here called in a int .
        System.out.println("in b");
    }
    public b(int n){
        this();
        System.out.println("in b int");
    }
}
public class ThisAndSuper36 {
    public static void main(String[] args) {
        b obj = new b(5);


    }
}
