public class Q8_byte2str {
    public static void main(String[] args) {

        // byte value into String

        byte bt=123;
        String str = Byte.toString(bt);
        System.out.println(str);
        // System.out.println(str.getClass());

        // byte value into Byte instance.

        System.out.println(Byte.valueOf(bt));

        // 

        System.out.println(Byte.valueOf(bt));


    }
}
