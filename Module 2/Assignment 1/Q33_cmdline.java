public class Q33_cmdline {
    public static void main(String[] args) {
        int i=Integer.parseInt(args[ 0 ]);
        float f=Float.parseFloat(args[ 1 ]);
        double d=Double.parseDouble(args[ 2 ]);

        // System.out.println(i +"\n"+f+"\n"+d);

        double sum = i + f + d;
        double sub = i - f - d;
        double mul = i * f * d;
        double div = i / f / d;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        
    }
}
