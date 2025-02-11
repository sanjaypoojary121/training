import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    String str1 = str.toLowerCase();
    int vcount=0,ccount=0;
    for(int i=0;i<str1.length();i++){
            if(st1r.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
             vcount++;
             else if(str1.charAt(i)>='a'||str1.charAt(i)>='z')
             ccount++;
    }
    System.out.println("vowels:"+vcount);
    System.out.println("consonants:"+ccount);
    }
}