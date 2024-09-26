class Mobile1 {
    String brand;
    static int price;
    String network; //instance variable
    static String name;

    static {
        name ="phone";
    }

    static {
        name="phone";
        System.out.println("in a static block");
    }

    public Mobile1(){
        brand = "";
        price =200;
        name ="phone";
        System.out.println("In a Constructor");

    }
    public void show(){
        System.out.println(brand + " : "+ price + ": " + name);
    }
public class StaticBlock30 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile1");
//        Mobile1 obj = new Mobile1();
//        Mobile1.name = "Smartphone";
//        obj.brand= "Apple";
//        obj.network= "Airtel";
//        obj.price =1500;
//
//        Mobile1 obj2 = new Mobile1();
        //static can only run first then the constructor will run.

    }
    }
}
