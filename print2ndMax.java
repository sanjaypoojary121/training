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
    System.out.println("Array Elements Are:");
    for(i=0;i<x;i++){
        System.out.print(Arr[i]);
        System.out.print(" ");
    }
    int y=x;
    System.out.print("\n");
    for(i=0;i<x;i++){
        for(j=0;j<x-1;j++){
            if(Arr[j]>Arr[j+1]){
                int t=Arr[j];
                Arr[j]=Arr[j+1];
                Arr[j+1]=t;
            }
        }
        x--;
    }
    System.out.print("2nd Maximum Element is:");
    System.out.print(Arr[y-2]);
    }
}