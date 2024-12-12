import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){}

    // 用于返回整形数组中的内容,返回字符串格式为[10, 20, 20]
    public static String printArr(int[] arr){
        String result = new String();
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }
        result = sj.toString();
        return result;
    }

    // 求平均值只考虑一位浮点数数组
    public static double getAerage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double aerage = sum/arr.length;
        return  aerage;
    }
}
