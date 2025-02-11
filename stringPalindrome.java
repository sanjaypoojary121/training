import java.io.*;
class Main {
    public static void main(String[] args) {
        int i,flag=1;
        String str = new String("mom");
        String rev = "";
        for(i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=rev.charAt(i)){
                flag=0;
                break;
            }
        }
        if(flag==0)
        System.out.println("Given String is not palindrome");
        else
        System.out.println("Given String is a palindrome");
    }
}