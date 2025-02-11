import java.util.Scanner;
class Main {
    static int print(int x,int cur){
        if(cur==0)
        return 1;
        else
        System.out.print(cur+" ");
        return print(x,cur-1);
    }
    public static void main(String[] args) {
        int x;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the number:");
        x=myObj.nextInt();
        print(x,5);
    }
}
