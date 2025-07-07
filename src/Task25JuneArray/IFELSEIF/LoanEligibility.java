package Task25JuneArray.IFELSEIF;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int age = s1.nextInt();
        double salary = s1.nextDouble();
        int creditscore = s1.nextInt();
        //age 18 to 80 andpositive
        //salary positive num min 30000
        //cs 650 to 850
        if (age<=80 && age>18 && age>0){

            if (salary>0 && salary>30000){

                if (creditscore >0 && creditscore>650 && creditscore<850){
                    System.out.println("This person with age: "+age+" Salary: "+salary+" Credit score: "+creditscore+ " is thus eligible for the loan");
                }else{
                    System.out.println("Not eligible");
                }
            }
        }
    }
}
