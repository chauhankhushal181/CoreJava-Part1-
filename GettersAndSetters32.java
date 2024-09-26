class Human1 {
    private int age;
    private String name; //instance should be private and
    // we can access the private instance variable
    //but with some ways


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

    public class GettersAndSetters32 {
        public static void main(String[] args) {
            Human1 obj = new Human1();
            obj.setAge(23);
            obj.setName("khushal");
            System.out.println(obj.getName() + obj.getAge());
        }
    }
}

