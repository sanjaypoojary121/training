import java.util.Arrays;

public class PrefixSumCalculator {
    public static int[] computePrefixSum(int[] sales) {
        int[] prefixSum = new int[sales.length];
        prefixSum[0] = sales[0];
        for (int i = 1; i < sales.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + sales[i];
        }
        return prefixSum;
    }
    
    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};
        System.out.println("PrefixSum[] = " + Arrays.toString(computePrefixSum(sales)));
    }
}
