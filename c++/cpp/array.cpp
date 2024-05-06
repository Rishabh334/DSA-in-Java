/*#include<iostream>
#include<climits>
using namespace std;
int main(){
    int n;
    cin>>n;
    int input[100];
    for (int i=0;i<n;i++){

        cin>>input[i];
    }
    for (int i = 0; i<n; i++){
        cout << input[i]<<endl;
    }
    //print array
    for (int i=0;i<n;i++){
        cout<<input[i]<<endl;
    }
    //largest  element in the array
    int max =INT_MIN;
    for (int i=0;i<n;i++){
    if(input[i]>max){
    max=input[i];
    }
}
cout<<"max"<< max<<endl;

}*/

///////////ARRAY SUM

/* #indclude<iostream>
#include<climits>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
    int sum=0;
    for (int i=0;i<n;i++){
         sum=sum+arr[i]
 ;   }
 cout<<sum;

} */

/* #include <iostream>

int main(void) {
    int size, *ptr_size = &size;

    std::cout << "Enter array size: ";
    std::cin >> *ptr_size;

    int arr[*ptr_size], *ptr_arr = arr;

    // Taking user inputs for array elements
    std::cout << "Enter array elements: ";
    for (int i = 0; i < *ptr_size; i++) {
        std::cin >> *(ptr_arr + i);
    }

    // Sorting array elements using bubble sort
    for (int i = 0; i < *ptr_size; i++) {
        for (int j = 1; j < *ptr_size - i; j++) {
            if (*(ptr_arr + j) < *(ptr_arr + j -1)) {
                int temp = *(ptr_arr + j);
                *(ptr_arr + j) = *(ptr_arr + j - 1);
                *(ptr_arr + j - 1) = temp;
            }
        }
    }

    // Printing sorted array elements
    std::cout << "Array: ";
    for (int i = 0; i < *ptr_size; i++) {
        std::cout << *(ptr_arr + i) << " ";
    }
    std::cout << std::endl;

    return 0;
} */

// BUBBLE sort

/*
#include <iostream>
using namespace std;

int main(void) {
    int size;

    cout << "Enter array size: ";
    cin >> size;

    int arr[size];

    cout << "Enter array elements: ";
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < size; i++) {
        for (int j = 1; j < size - i; j++) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    cout << "SorterArray: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
*/
/*
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int n, even = 0, odd = 0, diff = 0;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
      cin >> arr[i];
  }
  for (int i = 0; i < n; i++)
  {
      if (arr[i] % 2 == 0)
      {
          even = even + arr[i];
      }
      else
      {
          odd = odd + arr[i];
      }
  }
  diff = even - odd;
  cout << abs(diff);
  return 0;
}*/
/*

#include <iostream>
using namespace std;
int lenearsearch(int arr[], int size, int key)
{
    for (int i = 0; i < size; i++)
    {
        if (key == arr[i])
        {
            cout << "FOund" << endl;
        }

        else
        {
            cout << "not found" << endl;
        }
        return -1;
    }
}
int main()
{
    int size;
    cout << "enter size" << endl;
    cin >> size;
    int arr[size];
    for (int i = 0; i <= size; i++)
    {
        cin >> arr[i];
    }
    cout << lenearsearch << endl;
    return 0;
}*/
/*
#include<iostream>
using namespace std;
int main(){


int n;
cin>>n;

int arr[100];
for(int i=0; i<=n; i++){
    cin>>arr[i];
}
for(int i=0; i<=n ; i++){
    cout<< arr[i]<<endl;
}



}

*/
#include <iostream>
#include <climits>
using namespace std;

int getMax(int arr[], int n)
{
    int max = INT_MIN;
    for (int i = 0; i < n; i++)
    {

        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
return max;
}
int main()
{

    int arr[5] = {1, 2, 34, 5, 6};
   cout<<"print maximum number "<< getMax(arr, 5);
}
/*
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
*/