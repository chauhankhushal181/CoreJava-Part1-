public class MultiDimensionalArray20 {
    public static void main(String[] args) {
        int number[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                number[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(STR."\{number[i][j]} ");
            }
            System.out.println();
        }
        for (int n[] : number){
            for (int m:n)
            {
                System.out.print(STR."\{m} ");
            }
            System.out.println();
        }
    }
}

