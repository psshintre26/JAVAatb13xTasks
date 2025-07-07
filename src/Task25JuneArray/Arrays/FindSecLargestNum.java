package Task25JuneArray.Arrays;

import java.util.Arrays;

public class FindSecLargestNum {
    public static void main(String[] args) {
        int[] num = {11,12,13,44,6334,45};

        Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }
}
