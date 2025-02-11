import java.util.Arrays;
public class Main{
    public static int[] computePostfixSum(int[] fuel){
        int[] postfixSum=new int[fuel.length];
        postfixSum[fuel.length-1]=fuel[fuel.length-1];
        for(int i=fuel.length-2;i>=0;i--){
            postfixSum[i]=postfixSum[i+1]+fuel[i];
        }
        return postfixSum;
    }
    
    public static void main(String[] args){
        int[] fuel={5,10,3,7,8};
        System.out.println("PostfixSum[] = "+Arrays.toString(computePostfixSum(fuel)));
    }
}