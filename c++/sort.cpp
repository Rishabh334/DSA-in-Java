#include <iostream>
using namespace std;

void insertion_sort(int arr[], int n){
    for(int i=1;i<n;i++){
        int j = i - 1;
        int key = arr[i];
        while(key<arr[j] && j>=0){
            arr[j+1] = arr[j];
            j--;

        }
        arr[j+1] = key;
    }
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}
int main(){
    int n;
    cin>>n;

    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[n];
    }

    insertion_sort(arr, n);

}
