class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in a show");
    }
}
public class AnonymousObject38 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

//        new A().show(); //Anonymous object
    }
}
