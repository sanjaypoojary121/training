import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
    System.out.println("Enter the price:");
    for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    int max=Arr[0];
    for(i=1;i<x;i++){
        if(Arr[i]>max)
        max=Arr[i];
    }
    int count=0;
    for(i=0;i<x;i++){
        if(Arr[i]==max)
        count++;
    }
    System.out.println("MAximum price:"+max);
    System.out.println("Count:"+count);
    }
}