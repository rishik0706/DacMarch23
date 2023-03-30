public class Q11_clichar2 {
    public static void main(String[] args) {
        char c=args[0].charAt(0);
        if( check(c)  ){
            if(Character.isUpperCase(c)){
                c=Character.toLowerCase(c);
                System.out.println(c + " with code point " + (int)c);
            }else{
                c=Character.toUpperCase(c);
                System.out.println(c + " with code point " + (int)c);
            }
            
        }
    }

    private static boolean check(char ch) {
        boolean flag=false;
        if(Character.isAlphabetic(ch)){
            flag = true ;
        }else{
            flag= false ; 
        }

        return flag;
    } 
}
