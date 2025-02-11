import java.util.Scanner;
class Main {
    static void merge(int Arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftarr=new int[n1];
        int[] rightarr=new int[n2];
        for(int i=0;i<n1;i++){
            leftarr[i]=Arr[left+i];
        }
        for (int i=0;i<n2;i++){
            rightarr[i]=Arr[mid+1+i];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2){
            if(leftarr[i]<=rightarr[j]){
                Arr[k]=leftarr[i];
                i++;
            }else{
                Arr[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            Arr[k]=leftarr[i];
            i++;
            k++;
        }
        while(j<n2){
            Arr[k]=rightarr[j];
            j++;
            k++;
        }
    }
    static void mergesort(int Arr[],int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(Arr,left,mid);
            mergesort(Arr,mid+1,right);
            merge(Arr,left,mid,right);
        }
    }
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int x=myObj.nextInt();
        int[] Arr=new int[x];
        System.out.println("Enter array elements:");
        for (int i=0;i<x;i++){
            Arr[i]=myObj.nextInt();
        }
        mergesort(Arr,0,x-1);
        System.out.println("Sorted array:");
        for (int i=0;i<x;i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
}
