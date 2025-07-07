package Task24thJune2025_ifelseProgram;

import java.util.Scanner;

public class Lab002_LargestOfTwoNumbers {
    public static void main(String[] args) {
        int ilargest = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int inum1 = s.nextInt();
        System.out.println("Enter Second number");
        int inum2 = s.nextInt();
        if (inum1>inum2){
            ilargest = inum1;
        }else{
            ilargest = inum2;
        }
        System.out.println("Largest Number is "+ilargest);
    }
}
