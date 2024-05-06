/*#include <iostream>
using namespace std;
int factorial(int n)
{
    int ans = 1;
    int i = 1;
    while (i <= n)
    {
        ans = ans * i;
        i++;
    }
    return ans;
}
int main()
{
    int n, r;
    cout << "Enter number of terms" << endl;

    cin >> n;
    cout << "Enter number of arrangements" << endl;
    cin >> r;
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_n_r = factorial(n - r);
    int ans = fact_n / (fact_r * fact_n_r);
    cout << ans << endl;
}
*/
/*


PRIME NUMBER CHECK


#include <iostream>
using namespace std;
bool Isprime(int n)
{
    int d = 2;
    while (d < n)
    {
        if (n % d == 0)
        {

            return false;

        }
        d++;
    }
    return true ;

}


int main()
{
    int a;
    cin >> a;
    if (Isprime(a)){
        cout<<a<<" yeh prime number  hai "<<endl;
    }

    else
    {
cout<<a<<"yeh prime number nhi hai"<<endl;
    }


  //  cout << Isprime(a) << endl;
}*/

/*NUMBERS FROM 1 TO N



#include <iostream>
using namespace std;
int Print_1_to_n(int n){

    for(int i=1; i<=n; i++){
cout<<i<<endl;

    }

}
int main(){
    Print_1_to_n(10);

}*/
/*

#include <iostream>
using namespace std;
void multiply(float n,float c){
    cout<<n*c<<endl
;}
int main(){
    multiply(7.5,3);
}*/

// Farenhiets

/*
#include <iostream>
using namespace std;
void temp(int s, int e, int w){
 while(s<=e){
     int farh;
     farh=(5.0/9.0)*(s-32);
     cout<<s<<"\t"<<farh<<endl;
     s=s+w
; }
}
int main(){
    temp(1,100,1);
}
*/
#include <iostream>
using namespace std;
bool Isprime(int n)
{
    int d = 2;
    while (d < n)
    {
        if (n % d == 0)
        {

            return false;
        }
        d++;
    }
    return true;
}
int main()
{
    int n;
    cin >> n;
    for (int x = 2; x <= n; x++)
    {
        if (Isprime(x))
        {
            cout << x << endl;
        }
    }
}