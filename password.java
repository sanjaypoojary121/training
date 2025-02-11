import java.io.*;
static boolean isletter(char ch) {
    return (ch>='A' && ch<='Z') || (ch>='a' && ch<='b');
  }
static boolean isDigit(char ch) {
    return (ch>='0' && ch<='9');
  }
static boolean isAlphanumeric(char ch) {
    return isletter(ch) || isDigit(ch);
  }
static boolean isvaliduser(String name) {
    int length=name.length();
    if(length<5||length>15)
    return false;
    if(!isletter(name[0]))
    return false;
   
  }
class Main {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str1 = scn.next();
    }
}