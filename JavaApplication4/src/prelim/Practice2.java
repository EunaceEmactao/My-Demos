
package prelim;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberOne = 0;
        int numberTwo = 0;
        
        System.out.println("Input the first number = ");
        numberOne = in.nextInt();
        
        System.out.println("Input the second number = ");
       numberTwo = in.nextInt();
       
       System.out.println(numberOne + " " + "+" + " " + numberTwo + " " + "=" + " " + (numberOne + numberTwo));
        System.out.println(numberOne + " " + "-" + " " + numberTwo + " " + "=" + " " + (numberOne - numberTwo));
        System.out.println(numberOne + " " + "/" + " " + numberTwo + " " + "=" + " " + (numberOne / numberTwo));
        System.out.println(numberOne + " " + "x" + " " + numberTwo + " " + "=" + " " + (numberOne * numberTwo));
        System.out.println(numberOne + " " + "mod" + " " + numberTwo + " " + "=" + " " + (numberOne % numberTwo));
    }
}
