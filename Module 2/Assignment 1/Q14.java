class Q14{
    public static void main(String[] args) {
        short s= 130;
        Short b1 = new Short(s);

        
        byte b = (byte)s;
        int i =  b1;
        long l =  b1;
        double d =  b1;
        float f =  b1;

        // Anothr method is 
        byte b2 = b1.byteValue(); // Can work on all data types

        System.out.println("byte: "+ b);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("double: "+d);
        System.out.println("float: "+f);
    }
}