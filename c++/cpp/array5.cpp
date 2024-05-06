/*#include <iostream>
using namespace std;
int firstoutcome(int arr[], int size, int key)
{
    int s = 0;
    int e = size - 1;
    int mid = s + (e - s) / 2;
    int ans = -1;
    while (s <= e)
    {
        if ( arr[mid] == key)
        {

            ans = mid + 1;
            s = mid + 1;
        }
        else if (key >arr[mid])
        {
            s = mid + 1;
        }
        else if (arr[mid] > key)
        {
            e = mid - 1;
        }
        mid = s + (e - s) / 2;
    }
    
    return -1;
    
    }

    int lastoutcome(int arr[], int size, int key){
        int s = 0;
        int e = size - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;
        while (s <= e)
        {
            if (arr[mid] == key)
            {

                ans = mid + 1;
                e = mid - 1;
            }
            else if (key >arr[mid] )
            {
                s = mid + 1;
            }
            else if (arr[mid] > key)
            {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
    return ans;
    }*/


#include<iostream>
using namespace std;
int firstoutcome(int arr[],int size,int key){
    int s=0;
    int e= size-1;
    int mid = s+(e-s)/2;
int x=-1;

    while(s<=e){
if(arr[mid]==key){
    x=mid;
    e=mid-1;
         

}
else if (arr[mid]<key){
   s= mid+1;

}
else{
    e=mid-1;

}
mid=s+(e-s)/2;

    }
    return x;
}
int lastoutcome(int arr[],int size,int key){
    int s=0;
    int e= size-1;
    int mid = s+(e-s)/2;
int x=-1;

    while(s<=e){
if(arr[mid]==key){
    x=mid;
    s=mid+1;
         

}
else if (arr[mid]<key){
   s= mid+1;

}
else{
    e=mid-1;

}
mid=s+(e-s)/2;

    }
    return x;
}

    int main()
    {
        //int odd[5] = {1, 2, 3, 4, 4};
        
        
        int ara[6] = {3, 3, 4, 9, 9, 9};

       /// int oye = firstoutcome(even, 6, 9);
        cout << "first outcome of 9 is " <<firstoutcome(ara,6,9) << endl;
       //int oyo = lastoutcome(even, 6, 9);
        cout << " lastoutcome of 9 is " << lastoutcome(ara,6,9) << endl;
    return 0;
    }
