public class Arrays19 {
    public static void main(String[] args) {
      int nums [] ={4,5,6}; //1st way to declare array
        System.out.println(nums[0]);

        int nums1 [] = new int[4]; //2nd way to declare array
        nums1[0] =6;
        nums1[1] =8;
        nums1[2] =3;
        nums1[3] =1;
        for (int i=0; i<4; i++) {
            System.out.println(nums1[i]);
        }
    }
}
