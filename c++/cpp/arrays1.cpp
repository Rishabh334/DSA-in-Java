/*#include <iostream>
using namespace std;
void printarray(int a[6]){
    int n=6;
    for (int i=0 ;i<n;i++){
        cout<< a[i]<< endl;

    }
};
int main(){
    int a[6]={1,2,3,4,5,6};
    printarray(a);

}*/



//max min

#include<iostream>
#include <climits>
using namespace std;
int getMax(int arr[],int n){
    int max=INT_MIN;

    for (int i=0; i<n;i++){
        if (arr[i]>max){
            max =arr[i];
        }
    }
    return max;

}

int getMin(int arr[],int n){
    int min= INT_MAX;

    for (int i=0; i<n;i++){
        if (arr[i]<min){
            min =arr[i];
        }
    }
    return min;

}
int main(){
    int n;
cout<<"size of array"<<endl;
    cin>>n;

    int arr[n];
    for (int i=0; i<n;i++){
        cin>>arr[i];

    }
cout<<"maximum value "<<getMax(arr,n)<<endl;
cout<<"minimum value "<<getMin(arr,n)<<endl;

}
