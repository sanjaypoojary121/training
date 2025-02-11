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
    System.out.print("\n");
    int index=0;
    int max=Arr[0];
    for(i=1;i<x;i++){
        if(Arr[i]>max){
          max=Arr[i];
          index=i;
        }
    }
    Arr[index]=0;
    System.out.print("1nd Maximum Element is:");
    System.out.println(max);
    max=Arr[0];
    for(i=0;i<x;i++){
        if(Arr[i]>max){
          max=Arr[i];
        }
    }    
    System.out.print("2nd Maximum Element is:");
    System.out.println(max);
    }
}