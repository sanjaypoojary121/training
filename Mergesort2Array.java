import java.util.Scanner;
class Main {
    public static void main(String[] args){
        int x,y,i,j;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an 1 Array:");
        x = myObj.nextInt();
        System.out.println("Enter the length of an 2 Array:");
        y = myObj.nextInt();
        int[] Arr=new int[x];
        int[] Arrb=new int[y];
    System.out.println("Enter Array 1 Elements:");
    for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    System.out.println("Enter Array 2 Elements:");
    for(i=0;i<y;i++){
        Arrb[i]=myObj.nextInt();
    }
    int k=0;
    int[] Arrc=new int[x+y];
    for(i=0;i<x;i++){
        Arrc[k]=Arr[i];
        k++;
    }
    for(i=0;i<y;i++){
        Arrc[k]=Arrb[i];
        k++;
    }
    int temp;
    for(i=0;i<(x+y);i++){
    for(j=0;j<((x+y)-1)-i;j++){
        if(Arrc[j]>Arrc[j+1]){
            temp=Arrc[j];
            Arrc[j]=Arrc[j+1];
            Arrc[j+1]=temp;
        }
    }
    }
    System.out.println("Array Elements are :");
    for(i=0;i<(x+y);i++){
        System.out.print(" "+Arrc[i]);
    }
    }
}