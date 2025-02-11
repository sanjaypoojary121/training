import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int x,i;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the length of an Array:");
        x = myObj.nextInt();
        int[] Arr=new int[x];
        System.out.println("Enter the sensor data: ");
        for(i=0;i<x;i++){
        Arr[i]=myObj.nextInt();
    }
    int nc=0,fc=0;
    for(i=0;i<x;i++){
        if(Arr[i]>50)
        fc++;
        else if(Arr[i]>=20 && Arr[i]<=40)
        nc++;
    }
    System.out.println(nc+" Sensors are in normal range and "+fc+" sensors in Fault range");
    }
}