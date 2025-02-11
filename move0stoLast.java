import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i,j;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
    System.out.println("Enter Array Elements:");
    for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    int[] Arrb=new int[x];
    for(i=0,j=0;i<x;i++){
        if(Arr[i]!=0){
        Arrb[j]=Arr[i];
        j++;
        }
    }
    for(i=0;i<x;i++){
        if(Arr[i]==0){
        Arrb[j]=Arr[i];
        j++;
        }
    }
    System.out.println("Array Elements Are:");
    for(i=0;i<x;i++){
        System.out.print(Arrb[i]);
        System.out.print(" ");
    }    
    }
}