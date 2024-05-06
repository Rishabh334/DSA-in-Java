/*#include <iostream>

#include <vector>

using namespace std;

int main()

{

vector<int> myvector{ 1, 2, 3, 4, 5 };

cout << myvector.size();

return 0;

}*/

//output 5


/*
#include <iostream>

#include <vector>

using namespace std;

int main()

{

vector<int> myvector{};

if (myvector.empty())

{

cout << "True";

}

else {

cout << "False";

}

return 0;

}
output:true


*/


/*
#include <iostream>

#include <vector>

using namespace std;

int main()

{

vector<int> myvector;

myvector.push_back(3);

myvector.push_back(4);

myvector.push_back(1);

myvector.push_back(7);

myvector.push_back(2);

// Vector becomes 3, 4, 1, 7, 2

cout << myvector.back();

return 0;
}


*/



/*
#include <iostream>
#include <vector>
using namespace std;
int main()
{
vector<int> myvector{ 1, 2, 3, 4, 5 };
myvector.push_back(6);
// Vector becomes 1, 2, 3, 4, 5, 6
for (auto it = myvector.begin(); it != myvector.end(); ++it)
cout << ' ' << *it;
}
output:2,3,4,5*/


#include <iostream>
#include <vector>
using namespace std;
int main()
{
vector<int> myvector{ 1, 2, 3, 4, 5 };
myvector.pop_back();
// Vector becomes 1, 2, 3, 4
for (auto it = myvector.begin(); it != myvector.end(); ++it)
cout << ' ' << *it;
}



// CPP program to illustrate
// pop_front() function
#include <iostream>
#include <list>
using namespace std;
int main()
{
list<int> mylist{ 1, 2, 3, 4, 5 };
mylist.pop_front();
// list becomes 2, 3, 4, 5
for (auto it = mylist.begin(); it != mylist.end(); ++it)
cout << ' ' << *it;
}


// CPP program to illustrate the // list::push_front() function
#include <bits/stdc++.h>
using namespace std;
int main()
{ // Creating a list
list<int> demoList;
// Adding elements to the list // using push_back()
demoList.push_back(10);
demoList.push_back(20);
demoList.push_back(30);
demoList.push_back(40);
// Initial List:
cout << "Initial List: ";
for (auto itr = demoList.begin(); itr != demoList.end(); itr++)
cout << *itr << " ";
// Adding elements to the front of List // using push_front
demoList.push_front(5);
// List after adding elements to front
cout << "\n\nList after adding elements to the front:\n";
for (auto itr = demoList.begin(); itr != demoList.end(); itr++)
cout << *itr << " ";
return 0;
}


// CPP program to illustrate the // list::front() function
#include <bits/stdc++.h>
using namespace std;
int main()
{
// Creating a list
list<int> demoList;
// Add elements to the List
demoList.push_back(10);
demoList.push_back(20);
demoList.push_back(30);
demoList.push_back(40);
// get the first element using front()
int ele = demoList.front();
// Print the first element
cout << ele;
return 0;
}

#include <iostream>
#include <deque>
using namespace std;
int main()
{
deque<int> mydeque{ 1, 2, 3, 4, 5 };
mydeque.push_back(6);
// deque becomes 1, 2, 3, 4, 5, 6
for (auto it = mydeque.begin();
it != mydeque.end(); ++it)
cout << ' ' << *it;
}
Output: