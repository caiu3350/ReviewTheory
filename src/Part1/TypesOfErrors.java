package Part1;

import java.util.Scanner;

public class TypesOfErrors {

    public static void main(String[] args) {
        //3 types of errors - Syntax, Runtime, Logic
        
        //Syntax -> type error, program won't run;
        // int x = 45
        
        //runtime -> program starts but crashes or throws error
        //can be avoided by using try catch
        Scanner s = new Scanner(System.in);
        int candy = 100;
        int howmany, eachgets;
        System.out.println("How many people are you giving candy to? > ");
        howmany = s.nextInt();
        try{
            eachgets=candy/howmany;
        }catch(Exception e){
            System.out.println("Error - enter valid number");
            return;
        }
        System.out.println("Each person gets "+ eachgets );
        
        //Logic -> program runs, never crashes but does not do what it should
        //Hardest error to fix because the computer can't find it
        System.out.print("Enter wage/hr > ");
        double wage = s.nextDouble();
        System.out.println("Enter hours worked > ");
        double hours = s.nextDouble();
        double pay = wage + hours;
        System.out.println("Your pay is $" + pay);
    }
    
}
