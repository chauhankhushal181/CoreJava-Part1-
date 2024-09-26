 class dog{
    private int age;
    private String name;

     public int getAge() {
         return age;
     }

     public void setAge(int age, dog dog) {
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

public class ThisKeyword33 {
    public static void main(String[] args) {
        dog dog= new dog();
        dog.setAge(32, dog);
        dog.setName("Madona ");
        System.out.println(dog.getName() + ": "+ dog.getAge());
    }
}
