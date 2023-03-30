class Q13_cnvShort{
    public static void main(String[] args) {
        short s = 7;
        short max = 127;
        String str = "300";

        String str_short = String.valueOf(s);
        Short Short_max = new Short(max);
        Short Short_str = Short.parseShort(str);

        System.out.println("Short to string  "+str_short);
        System.out.println("short value to instance  "+Short_max);
        System.out.println("String instance to short instance "+Short_str);
    }
} 