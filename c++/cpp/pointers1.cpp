#include<iostream>
using namespace std;
/*int main(){
    int i=90;
    cout<<&i<<endl;
    int * p=&i;
    cout<<p<<endl;
    cout<<*p<<endl;
    float x=10;
    float*px= &x;
    
    double y=18;
    double*py=&y;


        


}
*/
#include<iostream>
using namespace std;
int main(){
    int i;
    int *x=&i;
    cout<< x<<endl;
    cout<<*x<<endl;
    cout <<sizeof(x)<<endl; 
}