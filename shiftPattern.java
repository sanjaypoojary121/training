import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int x,i,j,k;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
    System.out.println("Enter Array Elements:");
    for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    System.out.println("Enter the K value:");
    k = myObj.nextInt();
    int temp;
    for(i=1;i<=k;i++){
        temp=Arr[x-1];
        for(j=x-1;j>0;j--){
            Arr[j]=Arr[j-1];
        }
        Arr[0]=temp;
    }
    System.out.println("Array Elements are :");
    for(i=0;i<x;i++){
        System.out.print(" "+Arr[i]);
    }
    }
}