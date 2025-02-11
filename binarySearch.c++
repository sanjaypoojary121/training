#include <iostream>
using namespace std;
int main() {
    int i,n,s;
    cout<<"Enter the size of an areray:"<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the array elements:"<<endl;
    for(i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Enter the element to search:"<<endl;
    cin>>s;
    int l=0,h=n-1,mid;
    while(l<h){
    mid=(l+h)/2;
    if(arr[mid]==s){
        cout<<"element found at "<<mid+1;
        break;
    }
    else if(arr[mid]<s)
        l=mid;
    else
    h=mid+1;
    }
    return 0;
}