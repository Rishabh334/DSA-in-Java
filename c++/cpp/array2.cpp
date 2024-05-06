/*Sum arr*/

#include <iostream>
using namespace std;
/*void printarray(int arr[],int n){
    for (int i=0;i<n;i++){
        cout<<arr[i]<<endl;

    }


}*/
/*
void sumarr(int arr[],int n, int sum=0){
    for (int i; i<n;i++){
        sum =sum+arr[i];
        cout<<sum<<endl;


    }
}*/
/*
int main(){
    int n;
    int arr[n];
    cin>>n;

    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
       cout<<sum;

}
*/
/*
///linear search
#include<iostream>
using namespace std;
bool search(int arr[],int key,int n){
    for (int i=0 ; i< n; i++){
        if (arr[i]==key){
            return 1;
        }
    }
    return 0;


}
int main(){
int arr[6]={1,3,4,5,4 ,46};
cout<<"enter the number for search"<<endl;
    int key;
cin>>key;
bool found =search( arr,6,key);
if (found)
{
    cout<<"it is present"<<endl;
}
else{
    cout<< "not in data"<<endl;
}
    }

*/
bool search(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == key)
        {
            return 1;
        }
    }
    return 0;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int key;

    cin >> key;
    bool found = search(arr, n, key);
    if (found)
    {
        cout << "key is present" << endl;
    }
    else
    {
       cout<< "not found "<<endl;
    }
}*/