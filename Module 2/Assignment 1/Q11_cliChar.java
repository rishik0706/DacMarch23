class Q11_cliChar{
    public static void main(String[] args) {
        char c=args[0].charAt(0);
        if( check(c)  ){
            System.out.println("digit Value is :"+args[0].charAt(0));
            System.out.println("Digits code point is :"+(int)(+args[0].charAt(0)));
        }
    }

    private static boolean check(char ch) {
        boolean flag=false;
        if(Character.isDigit(ch)){
            flag = true ;
        }else{
            flag= false ; 
        }

        return flag;
    }   

}