package Task24thJune2025_ifelseProgram;

import java.util.Scanner;

public class Lab008_SmallestOfthreenumbers {
    public static void main(String[] args) {


        int ismallest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Print number 1");
        int inum1 = scanner.nextInt();
        System.out.println("Print number 2");
        int inum2 = scanner.nextInt();
        System.out.println("Print number 3");
        int inum3 = scanner.nextInt();
        if (inum1<inum2 && inum1<inum3) {
            ismallest = inum1;
        }else if(inum2<inum3) {
            ismallest = inum2;
            }else{
            ismallest = inum3;
            }

        System.out.println("Smallest number is "+ismallest);

    }
}