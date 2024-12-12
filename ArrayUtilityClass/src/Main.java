import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String s1 = ArrayUtil.printArr(arr1);
        System.out.println(s1);

        double[] arr2 = {2.4, 8, 19, 4};
        System.out.println(ArrayUtil.getAerage(arr2));
    }
}