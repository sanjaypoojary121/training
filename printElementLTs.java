
Sanjaya S . <4mt22ci046@mite.ac.in>
Mon, Feb 10, 11:24 AM (1 day ago)
to Gagan

import java.util.Scanner;
class Main {
    static void fact(int x){
    if(x==1)
    return 1;
    else
    return x*fact(x-1);
    }
    public static void main(String[] args) {
        int x;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = myObj.nextInt();
        int result=fact(x);
    System.out.println("factorial:"+result);
    }
}