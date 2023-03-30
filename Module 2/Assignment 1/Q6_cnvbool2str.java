class Q6_cnvbool2str{
    public static void main(String[] args) {
        boolean flag=false;

        //  boolean value into String

        String str=Boolean.toString(flag);
        System.out.println(str.getClass());

        // boolean value into Boolean instance.

        boolean b=Boolean.valueOf(flag);
        System.out.println(b);
        
        // String value into boolean value
        // String value into Boolean instance.

        String bool="true";
        boolean val=Boolean.valueOf(bool);
        System.out.println(val);
        
    }
}