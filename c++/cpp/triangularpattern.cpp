#include <iostream>
using namespace std;
int main(){
    int n;
    int i=1;
    while (i<=n){
        int j=1;
        int k=1;
        while (j<=i){
            cout << k;
            j++;
            k++;
        }
        cout<<endl;
        i++;
    }
}