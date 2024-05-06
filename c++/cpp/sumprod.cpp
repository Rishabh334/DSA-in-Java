#include<iostream>
using namespace std;
int main(){
    int n;
    int c;
    cin>>n>>endl;
    cin>>c>>endl;
    int sum=0;
    int prod=0;
    for (int i=1;i<=n;i=0){
        if (c==1){
            sum=sum+i;
            
        }

}
        else{
            prod=prod*i;
        }
        if (c==1){
            cout<<sum<<endl;

        }
        else if (c==2){
            cout<<prod<<endl;

        }
        else{
            cout<<-1;
        }
    }