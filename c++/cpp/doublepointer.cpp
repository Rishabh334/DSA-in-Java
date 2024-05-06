#include<iostream>
using namespace std;

void update(int **p2){
//p=p+1;
//*p=*p+1;
//**p=**p+1;
**p2=**p2+1;
};
int main(){
    int i =4;
    int*p=&i;
    int **p2=&p;
    cout<<p<<endl;
    cout<<&p<<endl;
    cout<<i<<endl;
    cout<<p2<<endl;
    
    cout<<*p<<endl;
    cout<<*p2<<endl;
    cout<<**p2<<endl<<endl<<endl;


update(p2);
cout<<p<<endl;


}