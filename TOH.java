import java.io.*;
import java.math.*;
import java.util.*;
class Main{
    static void towerOfHanoi(int n,char A,char C,char B){
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, A, B, C);
        System.out.println("Move disk "+n+" From "+A+" to "+C);
        towerOfHanoi(n - 1,B,C,A);
    }
    public static void main(String args[]){
        int N=3;
        towerOfHanoi(N,'A','C','B');
    }
}
ṇ