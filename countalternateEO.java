import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
    System.out.println("Enter Array Elements:");
    for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    System.out.println("Array Elements Are:");
    for(i=0;i<x;i++){
        System.out.print(Arr[i]);
        System.out.print(" ");
    }  
    System.out.println("\n");
    int count=1;
    for(i=1;i<x;i++){
        if((Arr[i]%2==0 && Arr[i-1]%2!=0) || (Arr[i]%2!=0 && Arr[i-1]%2==0))
        count++;
    }
    System.out.println("count:"+ count);
    }
}