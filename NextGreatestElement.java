import java.util.Arrays;
public class NextGreaterElement{
    public static void findNextGreater(int[] arr,int[] result,int index){
        if(index==arr.length){
            return;
        }
        result[index]=-1;
        for(int j=index+1;j<arr.length; j++){
            if(arr[j]>arr[index]){
                result[index]=arr[j];
                break;
            }
        }
        findNextGreater(arr,result,index+1);
    }
    public static int[] nextGreaterElements(int[] arr){
        int[] result=new int[arr.length];
        findNextGreater(arr,result,0);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{6,8,0,1,3})));
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{1,3,2,4})));
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{10,20,30,50})));
        System.out.println(Arrays.toString(nextGreaterElements(new int[]{50,40,30,10})));
    }
}
