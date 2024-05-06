#include<iostream>
using namespace std;
int main(){
    char c;
    c=cin.get();
    int digits=0;
    int characters=0;
    int spaces=0;
    while(c!='$'){
        if(c>='a'&& c<='z'){
            characters++;

        }
        else if(c>=0&&c<=9){
            digits++;
        }
        else{
            spaces++;

        }
        c=cin.get();


    }
    cout<<characters<<""<<digits<<" "<<spaces;v v-
}