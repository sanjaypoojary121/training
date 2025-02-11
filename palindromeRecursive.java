mport java.io.*;
class Main {
    static int reverse(int n,int rev)
    {
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
    static boolean palindrome(int n){
        if(n<0){
            return false;
        }
        return n==reverse(n,0);
    }
    public static void main(String[] args) {
        int n=1232;
        if(palindrome(n))
        System.out.println("Given number is palindrome");
        else
        System.out.println("Given number is not palindrome");
    }
}