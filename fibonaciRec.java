import java.util.Scanner;
class Main {
    static int fib(int x){
        if(x==1||x==0)
        return x;
        else
        return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args) {
        int x;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the number:");
        x=myObj.nextInt();
        int result=fib(x);
        System.out.println("Fibonaci: "+result);
    }
}