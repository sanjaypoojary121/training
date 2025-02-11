import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i,pos;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
        System.out.println("Enter Array elements: ");
        for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    int max=Arr[0];
    for(i=1;i<x;i++){
        if(Arr[i]>max)
        max=Arr[i];
    }
    pos=i;
    int c=0;
    for(i=pos+1;i<n;i++){
        c++;
    }
    if(c==1 || c==2 || c==0)
    System.out.println("debit count:"+c);
    else if(c=3)
    System.out.println("debit amount:"+max-100);
    else
    System.out.println("debit amount:"+max-500);
    }
}