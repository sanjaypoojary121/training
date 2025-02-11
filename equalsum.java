import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i,s,output=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
    System.out.println("Enter Array Elements:");
    for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    int sum=0,lsum=0,rsum=0;
    for(i=0;i<x;i++){
        sum=sum+Arr[i];
    }
    rsum=sum;
   for(i=0;i<x;i++){
        lsum=lsum+Arr[i];
        rsum=rsum-Arr[x-(i+1)];
        if(lsum==rsum){
            output=i+1;
            break;
        }
    }
    System.out.println("Output:"+output);
}
}