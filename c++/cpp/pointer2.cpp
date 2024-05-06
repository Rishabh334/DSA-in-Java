#include <iostream>
using namespace std;
void print (int *p){
    cout<<p<<endl;
}
void update(int*p){
 *p=*p+1;
}
void change(int x){
    x++;
}
int main(){
    int x=5;
int *p=&x;
change(x);
cout<<" after update the *p is "<< "int"<<x<< p <<*p <<endl;




cout<<"after update "<<*p<<endl;
update(p);

cout<<"beforeupdate "<<endl;
cout<<*p<<endl;

}