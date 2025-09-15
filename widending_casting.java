import java.util.*;
public class widending_casting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer (number:)");
        int number = scan.nextInt();
        //winding casting
        float float_nu = number;
        double double_nu = float_nu;
        //narrowing casting
        char name = (char)float_nu;
        short smallno = (short)float_nu;
        byte result = (byte)number;
        System.out.println("windending casting");
        System.out.println("the float value:"+float_nu);
        System.out.println("the double value:"+double_nu);
        System.out.println("narrowing casting");
        System.out.println("the char value:"+name);
        System.out.println("the short value:"+smallno);
        System.out.println("the byte value:"+result);

    }
}
