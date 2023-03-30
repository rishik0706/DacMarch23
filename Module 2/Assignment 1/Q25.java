public class Q25 {
    public static void main(String[] args) {
        Float x = new Float(35.5f);

        byte b = x.byteValue();  
        short s = x.shortValue(); 
        int i = x.intValue(); 
        double d = x.doubleValue();
        long l = x.longValue();

        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("double: "+d);
        System.out.println("long: "+l);
    }
}
