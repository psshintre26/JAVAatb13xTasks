package Task24thJune2025_ifelseProgram;

import java.util.Scanner;

public class lab015TriangleSideCheck {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        int side1= s1.nextInt();
        int side2= s1.nextInt();
        int side3= s1.nextInt();
        if (side1+side2>side3 && side2+side3>side1 && side1+side3>side2){ //triangle inequality theorem.
            System.out.println("Valid sides of a triangle are "+side1+","+side2+","+side3);
        }else{
            System.out.println("Please check the sides of a triangle not valid");
        }
    }
}
