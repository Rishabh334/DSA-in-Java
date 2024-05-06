#include <iostream>
using namespace std;

int binarysearch(int arr[], int size, int key)
{
    int s = 0;
    int e = size - 1;
    int mid;
    while(s<=e)
    {
        mid = (s + e) / 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        if (arr[mid] < key)
        {
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    } return -1;

}
int main()
{
    int oddarr[5] = {1, 2, 4, 5, 5};
    int evenarr[6] = {1, 2, 4, 5, 6, 6};
  int indexodd=binarysearch(oddarr, 5, 6) ;
    // cout<<"oddarr"<<printarray(oddarr,5,1)<<endl;
cout << "index or key " <<indexodd<<endl;
     int indexeven=binarysearch(evenarr, 6, 1);
cout << "index or key " << indexeven<<endl;
    //
    // cout<<"evenarr"<<printarray(evenarr,5,2)<<endl;
}
