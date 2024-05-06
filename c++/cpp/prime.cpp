/*#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "enter the number"<<endl;

    cin >> n;
    int d = 2;
    bool divided = false;
    while (d < n)
    {
        if (n % d == 0)
        {
            divided = true;
            break;
        }
        d++;
    }
    if (divided)
    {

        cout << "not prime" << endl;
    }

    else
    {
        cout << "it is a prime number";
    }
}
*/
#include <iostream>
using namespace std;

void updateValue(int *p){
    *p = 610 % 255;
}

int main(){
    char ch = 'A';
    updateValue((int*)&ch);
    cout << ch;
}