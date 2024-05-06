#include<iostream>
using namespace std;
int main(){
int a;
int b;
int c;
cin>>a;
cin>>b;
cout<<"1.sum"<<endl<<"2.sub"<<endl<<"3.Mul"<<endl<<"4.div"<<endl;
cin>>c;

if(c==1){
	cout<<a+b;
}
if(c==2){
	cout<<a-b;
}
if(c==3)
{cout<<a*b;
}
if(c==4){
	cout<<a/b;
}

