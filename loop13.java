public class loop13 {
    public static void main(String[] args) {
        //loop -while , do while , for loop //100 time repeat hi
        int x=0;
        while (x<=4) {
            System.out.println("hi " + x);
            int j =1;
            while (j<=3) {
                System.out.println("hello" +j);
                j++;
            }
            x++;
        }
        System.out.println("bye"+ x);
    }
}
