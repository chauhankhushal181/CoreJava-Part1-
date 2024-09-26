class mobile {
    String brand;
    static int price;
    String network; //instance variable
    static String name;

    public void show(){
        System.out.println(brand + " : " + price +" Dollar " + name);
    }

}
public class StaticKeyword28 {
    public static void main(String[] args) {
        mobile obj = new mobile();
        mobile.name = "Smartphone";
        obj.brand= "Apple";
        obj.network= "Airtel";
        obj.price =1500;

        mobile obj2 = new mobile();
        obj2.brand= "Samsung";
        obj2.network= "Airtel";
        obj2.price =1200;

        obj.name= "Phone"; //satic keyword changing name from smartphone to phone .
        //of both phone obj and obj2
        //because are used by all the variable

        obj.show();
        obj2.show();


    }
}
