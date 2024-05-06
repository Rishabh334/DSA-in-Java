#include<iostream>
using namespace std;
/*
int main(){
    int n;
    cin>>n;
    int i=1;
    while (i<=n){
      int   space=1;
        while(space <=n-i){
            cout<<' ';
            space++;
        
        }
        int star=1;
        while(star<=i){
            cout<<'*'
;            star=star+1;
        } 
        cout<<endl;
        i++;
    }
}*/
int main(){
    int n;
    cin>>n;
    int i=1;
    while(i<=n){
        int j=1;
        while(j<=n-i+1){
            cout<<j;
            j++;
        }
        cout<<endl;
        i++;
    }
}