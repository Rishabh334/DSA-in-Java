#include<iostream>
    using namespace std  ;

    
    
        int main(){
        int a;
        int b;
        int c;
        cin>>a;
        cin>>b;
        

        cout<<"1.a"<<endl<<"2.s"<<endl<<"3.m"<<endl<<"4.d"<<endl;
        cin>>c;
        
        if (c==1){
            cout<<a+b;
        }
        
        else if (c==2){
            cout<<a-b;
        }
        
         else if (c==3){
            cout<<a*b;

        } else if (c==4) {
            cout<<a/b;
        }
        else{
            cout<<"koina";
        }

 return 0;
    }4
