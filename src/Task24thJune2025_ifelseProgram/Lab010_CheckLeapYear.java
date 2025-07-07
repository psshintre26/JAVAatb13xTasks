package Task24thJune2025_ifelseProgram;

import java.util.Scanner;

public class Lab010_CheckLeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year");
        int iyear = s.nextInt();
        if (iyear % 4 == 0){
            System.out.println("Yes, "+iyear+" it's a leap year ");

        }else{
            System.out.println("Nope, "+iyear+" its not a leap year ");
        }
    }
}
