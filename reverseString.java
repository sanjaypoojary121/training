import java.util.Scanner;
class Main {
  static void Reverse(int x,int Arr[]){
    int i;
    System.out.println("Reverse order:");
    for(i=x-1;i>=0;i--){
    System.out.print(Arr[i]);
    System.out.print(" ");
  }
  }
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
    Reverse(x,Arr);
    }
}