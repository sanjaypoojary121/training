import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i,s,pos=0;
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
    System.out.println("Enter element:");
    s=myObj.nextInt();
    int mid,l=0,h=x-1;
    while(l<h){
    mid=(l+h)/2;
    if((Arr[mid]*Arr[mid])==s){
    pos=Arr[mid];
    break;
    }
    else if((Arr[mid]*Arr[mid])<s)
        l=mid;
    else
    h=mid+1;
    }
    System.out.println("element:"+ pos);
}
}