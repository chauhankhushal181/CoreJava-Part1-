public class Jagged3dArrays21 {
    public static void main(String[] args) {
        int numbers[][] = new int[3][];
        numbers[0] = new int[3];
        numbers[1] = new int[4];
        numbers[2] = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int n[] : numbers) {
            for (int m : n) {
                System.out.print(STR."\{m} ");
            }
            System.out.println();
        }
    }
}

