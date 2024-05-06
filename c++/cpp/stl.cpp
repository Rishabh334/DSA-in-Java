#include<iostream>
#include<map>
using namespace std;
int main()
{
	map<int,int>m={{1,2},{2,3},{3,4}};
	map<string,int>map1;
	map1["abc"]=100;
	map1["b"]=20;
	map1["c"]=30;
	
	map<int,int>::iterator itr;
	for(itr=m.begin();itr!=m.end();++itr)
	{
		cout<<"abckspace"<<itr->first<<"  ";
		cout<<"abckspace"<<itr->second<<"\n";
	}
	return 0;
}