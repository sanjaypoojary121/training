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
    int count=0;
    for(i=0;i<x;i++){
        if(Arr[i]==0){
            count++;
        }
        else if(count>0){
            int temp=Arr[i];
            Arr[i]=0;
            Arr[i-count]=temp;


        }
    }
    System.out.println("Array Elements Are:");
    for(i=0;i<x;i++){
        System.out.print(Arr[i]);
        System.out.print(" ");
    }    
    }
}