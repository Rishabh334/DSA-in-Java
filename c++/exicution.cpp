#include <iostream>
using namespace std;
void test(int x)
{
    try
    {
        if(x>0)
        {
            throw x;
        }
        else
        {
            throw 'x';
        }
        }
    catch (int no)
    {
        cout<<"caught an integer";
    }
    catch (char ch)
    {
cout<<"caught an character";
    }
}
int main()
{
    test(-7);
    test(3);
    return 0;
}