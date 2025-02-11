public class Main{
    public static int countInversions(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] P1={30,45,25,60,20};
        System.out.println("The inversion count is "+countInversions(P1));
        int[] P2={1,9,6,4,5};
        System.out.println("The inversion count is "+countInversions(P2));
    }
}
