package Task24thJune2025_ifelseProgram;

import java.util.Scanner;

public class Lab014ATMwithdrawlSimulation {
    public static void main(String[] args) {
        long ibalance = 50000;
        Scanner s1 = new Scanner(System.in);
        System.out.println("How much you would like to withdraw ?");
        long iamt = s1.nextLong();
        if (iamt % 100 == 0){
            if (iamt < ibalance){
                System.out.println("The Amount "+iamt+"Is beging withdrawn");
                long idiff = ibalance -iamt;
                System.out.println("Account balance remains "+idiff);
            }else{
                System.out.println("Out of money");
            }
        }else{
            System.out.println("Amount needs to be multiple of 100 SORRY cant withdraw");
        }

    }
}


