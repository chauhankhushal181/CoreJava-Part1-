class Student {
    int rollno;
    String name;
    int marks;

}
public class ArraysOfObject22 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno =1;
        s1.name="Navin";
        s1.marks=99;

        Student s2 = new Student();
        s2.rollno =2;
        s2.name="Harsh";
        s2.marks=69;

        Student s3 = new Student();
        s3.rollno =3;
        s3.name="Kiran";
        s3.marks=32;

        Student student[] =new Student[3];
        student[0] =s1;
        student[1] =s2;
        student[2] =s3;

        for (Student value : student) {
            System.out.println(value.name + " : " + value.marks);
        }

//        int nums[] = new int[6];
//        nums[0]=4;
//        nums[1]=6;
//        nums[2]=9;
//        nums[3]=4;
//
//        for (int i =0; i<nums.length; i++){
//            System.out.println(nums[i]);
//
//        }
    }
}
