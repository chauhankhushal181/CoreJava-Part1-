class Calculator1 {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    public class MethodOverLoading18 {
        public static void main(String[] args) {
            Calculator1 obj = new Calculator1();
            Calculator1 obj1 = new Calculator1();
            Calculator1 obj3 = new Calculator1();
            int r1 = obj.add(3, 4);
            System.out.println(r1);

            int r2 =obj1.add(3,4,2);
            System.out.println(r2);

            double r3 = obj3.add(2.3,4.2,1.2);
            System.out.println(r3);
        }
    }
}

