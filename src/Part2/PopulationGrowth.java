package Part2;

import java.text.NumberFormat;

public class PopulationGrowth {

    public static void main(String[] args) {
        int pop = 160000;
        int growth = 0;
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.format("%10s","YEAR");
        System.out.format("%20s","POPULATION");
        System.out.format("%20s","GROWTH");
        System.out.format("%20s\n","NEW POPULATION");
        for (int year = 2020; year <=2120; year+=10) {
            System.out.format("%10s",year);
            System.out.format("%20s",nf.format(pop));
            growth=(int)(0.06*pop);
            System.out.format("%20s",nf.format(growth));
            pop+=growth;
            System.out.format("%20s\n",nf.format(pop));
        }
    }
    
}
