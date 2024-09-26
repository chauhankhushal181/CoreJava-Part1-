class A1 { //Parent

}
class B extends  A1{ //child

}
class C extends B{ //MultipleInheritance will not work in java. //child


}
public class Inheritance39 {
    public static void main(String[] args) {
        calc39 obj = new calc39();
        int r3 = obj.add(8,9);
        int r4 = obj.sub(8,8);
//        int r1 = obj.div(15,4);
//        int r2 = obj.mul(45,5);
//        int r5 = obj.Power(89,99);
//        System.out.println(r1 + r2 + r5);
          System.out.println(STR."\{r3} : \{r4}");


    }
}
