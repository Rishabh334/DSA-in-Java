#include<iostream>
using namespace std;
int main(){
    int arr[5]={1,2,3,5,6};
    int n=10;
    for (int i=0; i<=n; i++){
        int x;
        cout<< "enter digit"<<endl;
        cin>>x;
        if (arr[i]==x){ 
            cout<< arr[i] << endl;

        }
        else{
            cout<<"oops wrong entry"<<endl;
        }
    }
    

}
