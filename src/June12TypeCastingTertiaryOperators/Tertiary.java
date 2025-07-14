package June12TypeCastingTertiaryOperators;

public class Tertiary {
    public static void main(String[] args) {

        //can vote after 18
        int age = 10;
        String canIvote = age > 18 ? "Yes" :"No";
        System.out.println(canIvote);

        //find positive or negative
        String Ispositive = age > 0 ? "Positive" : "Negative";
        System.out.println(Ispositive);
        int x = 22;

        int y = 77;

        //find max number
        System.out.println(Math.max(33,66));
        int max = x > y ? x:y;
        System.out.println(max);

        //find min number
        int min = x<y?x:y;
        System.out.println(min);

        //find even odd
        int n1 =3;
        String r1 = (n1 % 2 == 0) ? "even": "odd";
        System.out.println(r1);

        //adult or not
        int a1 = 18;
        String adult = a1>= 18 ? "adult": "Not adult";
        System.out.println(adult);
    }
}
