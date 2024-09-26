public class StringBufferAndBuilder27 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2,"v");
        System.out.println(sb);
        sb.insert(6 ," Java " );
        System.out.println(sb);
        sb.setLength(30);
        System.out.println(sb);
        sb.ensureCapacity(100);
//        String str = sb.toString();

    }
}
