class calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public void config() {
        System.out.println("in A config");
    }

    class AdvCalc extends calc {
        public int add(int n1, int n2) {
            return n1 + n2 +1;
        }
    }

        public class MethodOverloading40 {
            public void main(String[] args) {
                AdvCalc obj = new AdvCalc();
                obj.config();
                obj.add(3, 4);

            }
        }
    }

