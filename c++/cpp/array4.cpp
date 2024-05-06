/*#include <iostream>
using namespace std;
void printarray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}for { int i=0;i<n;}
void swapalter(int arr[], int size)
{
    for (int i = 0; i < size; i += 2)
    {
        if (i + 1 < size)
        {
            swap(arr[i], arr[i + 1]);
 ;
        }
    }
}
int main()
{
    int even[8] = {2, 4, 5, 7, 3, 9, 0, 1};
    int odd[7] = {1, 2, 3, 5, 6, 7, 8};
    swapalter(even, 8);
    printarray(even, 8);

    cout << endl;

    swapalter(odd, 7);

    printarray(odd, 7);
    return 0;
}*/
/*
#include<iostream>
using namespace std;
int findunique(int *arr,int size){
    int ans=0;
    for(int i=0 ;i<size;i++){
ans =ans ^ arr[i];
}
return ans;

}
int main(){
    int n;
    cin>>n;

    int arr[n];
    for (int i=0; i<n; i++){
        cin >>arr[i];

    }

    cout<<"unique number is "<<findunique(arr,n);

}
*/

// binary search
/*#include <iostream>
using namespace std;
int binarysearch(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;
    int mid = start + (end - start) / 2;
    while (start <= end)
    {
        if (arr[mid] == key)
        {
            return mid;
        }
        // go right
        if (arr[mid] < key)
        {
            start = mid + 1;
        }
        else
        { // key<mid go left
            end = mid - 1;
        }
        mid = start + (end - start) / 2;
    }
    cout<<"couldn't found ";
    return -1;
}
int main()
{
    int odd[5] = {1, 2, 3, 4, 5};
    int even[6] = {6, 7, 8, 9, 10, 11};

    int oddindex = binarysearch(odd, 5, 1);

     cout<<"index of 1 = "<<oddindex<<endl;


    int evenindex = binarysearch(even, 6, 13);


    cout << "index of 9 = " << evenindex << endl;


    return 0;

}*/
#include <iostream>
using namespace std;
void array(int arr[],int n){
    for (int i=0;i<=0;i++){
        cin>>arr[i];

    }
    void printarray(int arr[],int n){
        for(int i=0;i<=n;i++){
            cout<<arr[i];
        }
    }

}
int binarysearch(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;
    int mid;
    while (start <= end)
    {
        mid = (start + end) / 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        if (arr[mid] < key)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    return -1;
}
int main()
{
   /* int odd[5] = {3, 4, 6, 7, 8};
    int even[4] = {2, 4, 6, 8};
    int indexodd = binarysearch(odd, 5, 3);
    cout << "Index of key in odd = " << indexodd << endl;
    cout << "POSITION of key in odd = " << indexodd+1 << endl;
    int indexeven = binarysearch(even, 4, 2);
    cout << "Index of key in even = " << indexeven << endl;
    cout << "POSITION OF KEY IN EVEN = " << indexeven+1 << endl;
    return 0;
}






/*
#include <iostream>
using namespace std;
int binaryseach(int arr[],int n,int key){
    int s=0;
    int e=n-1;
int mid = s+(e-s)/2;
while(s<=e){

    mid=s+(e-s)/2;

    if(arr[mid]=key){
        return mid;

    }
    if(arr[mid]>key){
        end=mid-1;

    }
    else{

    }

}


}*/