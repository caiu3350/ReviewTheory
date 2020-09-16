package Part2;

public class LoopReview {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.format("1 is now %d\n",i);
        }
        for (double temp = 20; temp >= 10; temp-=0.5) {
            System.out.print("the temperature is now "+temp);
            String weather = temp>=15? "WARM":"COLD";
            System.out.println("\t\tThe weather is "+weather);
        }
        int rnum;
        int tries = 0;
        System.out.println("GAME 1\n============\n");
        do{
            rnum=(int)(Math.random()*20+1);
            tries++;
            System.out.format("Try %d -> number picked %d\n",tries,rnum);
        }while(rnum !=7);
        rnum=0;
        tries=0;
        System.out.println("GAME 2\n============\n");
        while(rnum!=7){
            rnum=(int)(Math.random()*20+1);
            tries++;
            System.out.format("Try %d -> number picked %d\n",tries,rnum);
        }
        rnum=0;
        tries=0;
        System.out.println("GAME 2\n============\n");
        while(true){
            rnum=(int)(Math.random()*20+1);
            tries++;
            System.out.format("Try %d -> number picked %d\n",tries,rnum);
            if(rnum==7) break;
        }
        System.out.println("Game over you got it in "+tries);
    }
    
}
