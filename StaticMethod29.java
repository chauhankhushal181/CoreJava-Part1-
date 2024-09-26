class Mobile {
    String brand;
    static int price;
    String network; //instance variable
    static String name;

    public void show(){
        System.out.println(STR."\{brand} : \{price} Dollar \{name}");
    }
    public static void show1(Mobile1 obj){
        System.out.println(STR."\{obj.brand} : \{price} Dollar \{obj.name}");
    }

}
public class StaticMethod29 {
    public static void main(String[] args) {
        Mobile1 obj = new Mobile1();
        Mobile1.name = "Smartphone";
        obj.brand= "Apple";
        obj.network= "Airtel";
        obj.price =1500;

        Mobile1 obj2 = new Mobile1();
        Mobile1.name = "Smartphone";
        obj2.brand= "Samsung";
        obj2.network= "Airtel";
        obj2.price =1200;

        //obj.name="phone";
        Mobile1.name= "Phone";
        // static keyword changing name from smartphone to phone.
        //of both phone obj and obj2
        //because are used by all the variable

        obj.show();
        obj2.show();

//        Mobile.show1(obj2); //static variable can be used in static method only
//        //but after having object reference in the static method,
//        //we can use it.
//        Mobile.show1(obj);

    }
}
