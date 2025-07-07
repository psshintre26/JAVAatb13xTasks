package Task24thJune2025_ifelseProgram;

import java.util.Scanner;

public class Lab011_CalculateGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Print your marks between 0 to 100");
        long imarks = s.nextLong();

        if (imarks >= 90) {
            System.out.println("You have obtained "+imarks+" makrs with grade A+");
        } else if (imarks >= 80) {
            System.out.println("You have obtained "+imarks+" makrs with grade A");
        } else if (imarks >= 70) {
            System.out.println("You have obtained "+imarks+" makrs with grade B");
        } else if (imarks >= 60) {
            System.out.println("You have obtained "+imarks+" makrs with grade C");
        } else if (imarks >= 50) {
            System.out.println("You have obtained "+imarks+" makrs with grade D");
        } else if (imarks >= 40) {
            System.out.println("You have obtained "+imarks+" makrs with grade E");
        } else if (imarks < 40) {
            System.out.println("You have obtained "+imarks+" You are failed try next time");
        }

    }
}
//        switch ((int) imoney) {
//            case imoney>=90:
//            case (imoney>=80):
//            case (imoney>=70):
//            case (imoney>=60):
//            case (imoney>=50):
//            case (imoney>=40):
//            case (imoney<40):
//                System.out.println("fail");
//
//        }
//        }
//    }
