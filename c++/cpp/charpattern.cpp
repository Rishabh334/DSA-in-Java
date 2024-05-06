#include <iostream>
using namespace std;
/*int main(){
    int n;
    cin>>n;
    int i=1;
    while (i<=n){
        int j=1;
        while(j<=n){
        char ch = 'a'+j-1;
         cout<< ch;
         j++;

        }cout <<endl;
        i++;
    }
}
abcde
abcde
abcde*/
/*int main(){
    int n;
    cin>>n;
    int i=1;
    while (i<=n)
    {
        int j=1;
        while (j<=i){
            char ch = 'A'+j-1;
            cout<< ch;
            j++;
        }cout<<endl;
        i++;
    }
    
}
A
AB
ABC
ABCD*/
/*
int main(){
    int n;
    cin>> n;
    int i=1;
    while (i<=n){
        int j=1;
        while (n>=j){
            char ch ='a'+i-1;
            cout <<ch;
            j++
        ;}cout<< endl;
        i++;
        
    }
}
aaaa
bbbb
cccc
dddd*/
/*
int main(){
    int n;
    cin>> n;
    int i=1;
    while (i<=n){
        int j=1;
        char startchar ='A'+i-1;
        while (n>=j){
            char ch =startchar+j-1;
            cout <<ch;
            j++
        ;}cout<< endl;
        i++;
        
    }
}
*/
// #include<iostream>
// using namespace std;
// int main(){
//     int n;
//     cin>>n;
//     int i=1;
//     while (i<=n){
//         int j=1;
//         while (j<=i){
//         char ch ='A'+i-1;
            
//             cout<< ch;
//             j++;
//         }cout <<endl;
//         i++;
//     }
// }



#include <iostream>
using namespace std;


int main(){

   
    int n,i,j;
    n=5;
    i=1;

    while(i<=n){
        j=1;
        while(j<=i){
            char myval = 64 + n - i + j;
            cout << myval;
            j++;
        }
        i++;
        cout << endl;
    }
    
}


