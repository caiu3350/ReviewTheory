package Part1;

public class MathClassAndShortcuts {

    public static void main(String[] args) {
        //Math class is part of java language, no import is needed
        int x = 10;
        System.out.println(Math.pow(x, 3));//1000
        System.out.println(Math.sqrt(x));//square root 10
        double y=8.9876;
        System.out.println(Math.round(y));//rounds to nearest (9)
        System.out.println(Math.max(x, y));//10 also min
        int roll = (int)(Math.random() *6+1);//from 1 to 6
        //Math.random() * range + start number
        //ex -> 30 and 50 (int)(Math.random() * 21 + 30);
        System.out.println(roll);
        System.out.println("\n\nSHORTCUTS\\n=========");
        int a = 10;
        a+=10;
        System.out.println("a is "+a);
        int b=a;
        b++;
        System.out.println("b is "+b);
        a *=2;
        System.out.println("a is "+a);
        int c = b++;
        System.out.println("");
    }
    
}
