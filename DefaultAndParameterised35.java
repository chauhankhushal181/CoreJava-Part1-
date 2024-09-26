class fomo  {
    public int age;
    private String name;

    public fomo(){ //default
        age = 12;
        name="json";
    }
//    public fomo (int a, String n){ //parameterised
//       age = a;
//       name = n;
//    }


    public fomo(int age, String name) { //parameterized constructor
        this.age = 12;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class DefaultAndParameterised35 {
    public static void main(String[] args) {

        fomo guy = new fomo();
        fomo guy1 = new fomo(16,"Navin");
        System.out.println(guy.getName() +" : " +guy.getAge());
//        System.out.println(guy1.getName() +" : " +guy1.getAge());
    }
}
