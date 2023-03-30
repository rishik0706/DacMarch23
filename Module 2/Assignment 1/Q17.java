public class Q17 {
    public static void main(String[] args) {
        Integer x = new Integer(123);   
        byte b = x.byteValue();
        short s = x.shortValue();
        long l = x.longValue();
        double d = x.doubleValue();
        float f = x.floatValue();

        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("long: "+ l);
        System.out.println("double: "+d);
        System.out.println("float: "+f);
    }
}
