#include<iostream>
using namespace std;

class Counter {
 static int count;
 public:
 void setData(int c)
 {
 count = c;
 }
 void getData()
 {
 cout<<"count = "<<count;
 }
 void inc()
 {
 count++;
 }
};
int Counter::count=0;
int main() {
 Counter obj1, obj2;
 obj1.setData(10);
 obj2.setData(10);
 cout<<"Object 1 Count\n";
 obj1.inc();
 obj1.getData();
 cout<<"\n";
 cout<<"Object 2 Count\n";
 obj2.getData();
 return 0; }