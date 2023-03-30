public class Q21 {
    public static void main(String[] args) {
        Long x = new Long(100_00_000L);

        byte b = x.byteValue();  
        short s = x.shortValue(); 
        int i = x.intValue(); 
        double d = x.doubleValue();
        float f = x.floatValue();

        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("double: "+d);
        System.out.println("float: "+f);
    }
}
