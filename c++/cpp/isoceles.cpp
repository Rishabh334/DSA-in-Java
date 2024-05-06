#include<iostream>
using namespace std;
/*int main(){
    int n;
    cin>>n;
    int i=1;
    while (i<=n){
        int j=1;
        while(j<=n-i){
            cout<<' ';
            j++;

        }int x=1;
        while(x<=i){
            cout<<x;
            x++;
              }
              x=i-1;
        while(x>=1){
            cout<<x;
            x=x-1;
  
        
        
        }
        cout<<endl;
        i++;

    }

}
*/

int main(){
    int n;
    cin>>n;
    int i=1;
    while(i<=n){
    int space=1;
    while (space<=n-i){
        cout<<" ";
        space++
    ;}
    int star=1;
    while(star<=i){
        cout<<"?"  ;
        star++;


    }
    int x=1;
    while(x<=i-1){
        cout<<"?    ";
        x++;
    }cout<<endl;
    i++;

    }

}