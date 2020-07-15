package zegar;
import java.io.Console;
public class Zegar {

    public static void main(String[] args) {
        try {
            clock(new int[]{23,59 });
        }
        catch (Exception e){System.out.println("Przekroczyłeś zakres");}
    }
    static public void clock(int[] args) throws Exception {
        if (args==null) throw new Exception();
        if (args.length<2||args.length>3)throw new IllegalArgumentException();
        if (args[0]<0||args[0]>23) throw  new Exception();
        if (args[1]<0||args[1]>59) throw  new Exception();

        System.out.println(args[0]+":"+args[1]+":"+args[2]);

    }
}