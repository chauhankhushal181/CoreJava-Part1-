class Human {
    private int age ;
    private String name ; //instance should be private and
    // we can access the private instance variable
    //but with some ways

    public void setAge(int a){
        age=a;
    }

    public void setName(String b){
        name=b;
    }

    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation31 {
    public static void main(String[] args) {
        Human obj = new Human();
//        obj.age=11;
//        obj.name="Navin";
        obj.setAge(23);
        obj.setName("khushal ");
        System.out.println(obj.getName() + obj.getAge());
    }
}
