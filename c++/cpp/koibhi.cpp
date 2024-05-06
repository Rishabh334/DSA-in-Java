/*#include<iostream>
using namespace std;
// base class
class Vehicle {
public:
int a;
Vehicle()
{
cout << "This is a Vehicle\n";
}
};q@
// sub class derived from a single base classes
class Car : private Vehicle {
    int b=4;
    int a=b;

};
int main()
{
    
// Creating object of sub class will
// invoke the constructor of base classes
Car obj;
int a=9;
cout<<a;
return 0;
}
*/

#include<iostream>
using namespace std;
int main(){child obj1;
obj1.id_c =7;
obj1.id_p=91;
cout<<"child is"<<obj1.id_c<<endl;
cout<<"parent id is "<<obj1.id_p<<endl;
return 0;
}





#include<iostream>
using namespace std;
    class Vehical {
        public:
        Vehical(){
            cout<<"this is a vehical"<<endl;

        }

    };  
    class Car : public Vehical{};
    int main()
    {
        car obj;
        return 0;
    }

4





#include <iostream>
using namespace std;
    class vehicle{
        public:
        vehicle (){
            cout<<"this vehicle"<<endl;

        }

    };
    class FourWheeler{
        public:
        FourWheeler(){
            cout<<"this is a four Wheeler"<<endl;
            }
};
class Car: public Vehicle, public FourWheeler {

};
int main(){
    Car obj;
    return 0;

}































