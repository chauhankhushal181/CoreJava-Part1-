class homo  {
    public int age;
    private String name;

    public homo(){
        age = 12;
        name="json";
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
public class Constructor34 {
    public static void main(String[] args) {
        homo guy = new homo();
        homo guy1 = new homo();
        System.out.println(guy.getName() +" : " +guy.getAge());

        //guy.setAge(32);
        //guy.setName("Amit "); //Constructor always gets called first rather than any
        // class
        //or method
        //every time u create obj u create constructor
        //if no value in guy by default u call it to the constructor
    }
}
