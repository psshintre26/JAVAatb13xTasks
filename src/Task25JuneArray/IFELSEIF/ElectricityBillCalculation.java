package Task25JuneArray.IFELSEIF;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        double rate = 1;
        Scanner s1 = new Scanner(System.in);
        int sunits = s1.nextInt();
        if (sunits <=100) {
        //0.5 per unit
            rate = sunits * 0.5;
        } else if (sunits <=200 && sunits>100) {
            // 0.75 per unit
            rate = sunits *0.75;

        } else if (sunits<=300 && sunits >200) {
            //1.2 rate
            rate = sunits * 1.2;

        } else if (sunits>300) {
            //1.5 rate
            rate = sunits *1.5;

        }
        System.out.println("Units used are "+sunits+" And the bill is "+rate);
    }
}
