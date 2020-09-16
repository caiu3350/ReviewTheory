package Part1;

public class VariablesReview {

    public static void main(String[] args) {
        //primitive data types
        int a = 1234567890;//4 bytes
        long d = 1234567890123456789L;//8 bytes
        short c = 12345;//2 bytes
        byte b = 127;//one byte and can only be a number that is inbetween or is 127 and -127
        //decimal
        double dbl = 45.78;//8
        float flt = 45.75F;//4
        //2 others
        char chr = 'x';//one character
        boolean bool = true;//or false
        //Strings - > not primitive
        String s = "I went to school today";
        //String is capital (like all objects)
        //"s" has abilities (a.k.a. methods)
        
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3, 8);
        String str2 = s.substring(4);
        //note on all methods
        //1 - all methods have a return type (send back something), except v
        //2 - methods may or may NOT require parameters - data sent in
        //3 - some methods have more than one version
        System.out.println("Length of \"s\" is : "+len);
        System.out.println("character at loc 7 is "+lett);
        System.out.println("location 3 to 8: "+str1);
        System.out.println("location 4 to the end: "+str2);
        //escape codes: \" \\ \t(tab) \n(new line)
        System.out.println("First\t\tLast\t\tEmail Address");
        System.out.println("C:\\Documents\\Users");
        System.out.println("He went\n\nto the shore");
        
        
    }
    
}
