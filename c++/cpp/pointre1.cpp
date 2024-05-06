/*#include <iostream>
using namespace std;
int main(){
    int arr[4]={1,2,3,4};
    int *p= arr;
    int *z=p;

cout<< arr<<endl;
cout<< arr[2]<<endl;
cout<< &arr[2]<<endl;

  /*  cout<<p<<endl;
    cout<<*p<<endl;
    cout<<z<<endl;
*/


//}
/**/
/*
#include<iostream>
using namespace std;

int main(){
  int n=10;
  for(int i=0;i<=n;i++){
    cout<<i<<endl;
  }
}
*/

/*
// C++ program to illustrate Pointer Arithmetic
#include <bits/stdc++.h>
using namespace std;
void geeks()
{
    // Declare an array
    int v[3] = { 10, 100, 200 };
  
    // declare pointer variable
    int* ptr;
  
    // Assign the address of v[0] to ptr
    ptr = v;
  
    for (int i = 0; i < 3; i++) {
        cout << "Value at ptr = " << ptr << "\n";
        cout << "Value at *ptr = " << *ptr << "\n";
  
        // Increment pointer ptr by 1
        ptr++;
    }
}
  
// Driver program
int main() { geeks(); }*/








// A complete working C++ program to 
// demonstrate all insertion methods
// on Linked List

/*#include<iostream>
using namespace std;*/
/*
int main(){

int rishabh[4]={1,2,3,4};
int *ptr= &rishabh;
cout<<ptr+1<<endl;
cout<<sizeof(rishabh)<<endl;
cout<<sizeof(*ptr)<<endl;

}*//*
int main(){
    char ch[6] ="bcdef";
    char*ptr=ch;
    cout<<ptr<<endl; 
    cout<<*ptr<<endl;
int a;
cin>>a;
while (a==1){
char temp = 'z';
char *p=&temp;
cout<<p<<endl;
a++;

}
    

}                       


*/








#include <bits/stdc++.h>
using namespace std;
  
// A structure to represent a stack
class StackNode {
public:
    int data;
    StackNode* next;
};
  
/*StackNode* newNode(int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}*/
  
int isEmpty(StackNode* root)
{
    return !root;
}
  
void push(StackNode** root, int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    //stackNode->next = NULL;
    stackNode->next = *root;
    *root = stackNode;
    cout << data << " pushed to stack\n";
}
  
int pop(StackNode** root)
{
    if (isEmpty(*root))
        return INT_MIN;
    StackNode* temp = *root;
    *root = (*root)->next;
    int popped = temp->data;
    free(temp);
  
    return popped;
}
  
int peek(StackNode* root)
{
    if (isEmpty(root))
        return INT_MIN;
    return root->data;
}
  
// Driver code
int main()
{
    StackNode* root = NULL;
  
    push(&root, 10);
    push(&root, 20);
    push(&root, 30);
  
    cout << pop(&root) << " popped from stack\n";
  
    cout << "Top element is " << peek(root) << endl;
      
    cout <<"Elements present in stack : ";
     //print all elements in stack :
    while(!isEmpty(root))
    {
        // print top element in stack
        cout << peek(root) <<" ";
        // remove top element in stack
        pop(&root);
    }
  
    return 0;
}
  
// This is code is contributed by rathbhupendra
