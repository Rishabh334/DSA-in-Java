#include<iostream>
using namespace std;

class Employee{
    public:
    int EmployeeId;
    int age;
    int Phone_number;
    string gender;

    void setdata(){
        cout<<"Enter EmployeeId"<<endl;
        cin>>EmployeeId;
        cout<<"Enter age"<<endl;
        cin>>age;
        cout<<"Phone_number"<<endl;
        cin>>Phone_number;
        cout<<"Gender"<<endl;
        cin>>gender;
    }
    void getdata(){
        cout<<"Id of the Employee is "<<EmployeeId<<endl;
        cout<<"Age of the Employee is "<<age<<endl;
        cout<<"Phone number of the Employee is "<<Phone_number<<endl;
        cout<<"Gender of the Employee is "<<gender<<endl;
    }
};
int main(){
    Employee Rishabh;
    Rishabh.setdata();
    Rishabh.getdata();
    return 0;
}
