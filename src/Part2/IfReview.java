package Part2;

import java.util.Scanner;

public class IfReview {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int num = s.nextInt();
        if(num>7){
            System.out.println("Too high");
            num--;
        }
        else if(num<7){
            System.out.println("Too low");
            num++;
        }
        else{
            System.out.println("7 is just right");
        }
        System.out.println("number is set to "+num);
        System.out.print("Enter another number -> ");
        int num2 = s.nextInt();
        int max;
        max = Math.max(num, num2);
        System.out.println("The highernumber is: "+max);
        if(num>num2)max=num;
        else max=num2;
        System.out.println("The highernumber is: "+max);
        max = num>num2? num : num2;
        System.out.println("The highernumber is: "+max);
        //  =  ask question? pick this if true : pick this if false
    }
    
}
