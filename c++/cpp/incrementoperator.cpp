/*#include<iostream>
using namespace std;
int main(){
    int a =10;
    cout<<a++<<endl;
    cout<<++a<<endl;


}*/
#include <iostream>
using namespace std;
int main()
{
    int x = 10;
    int y = 20;
    if(x++ > 10 && ++y > 20 ){
    cout << "Inside if ";
    } else{
    cout << "Inside else ";
    }
}