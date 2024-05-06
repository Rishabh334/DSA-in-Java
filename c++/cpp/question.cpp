

#include <iostream>

using namespace std;
class Node
{
public:
    int data;
    Node *next;
};

class linkedList
{
    Node *start;
    public:
    linkedList()
    {
        start =NULL;
    }
    void addNode(int d)
    {
        Node *n;
        n= new Node();
        n->data = d;
        n->next = start;
        start = n;
             
    }
    void insertSorted(int e)
    {
        Node *ptr=start,*n,*pptr;
        if(start ==NULL || ptr->data>e)
            addNode(e);
        else
        {
            while(ptr!=NULL && ptr->data<e)
                
            {
                pptr =ptr;
                ptr=ptr->next;
            }
            
           n= new Node();
           n->data=e;
           n->next =ptr;
           pptr->next =n;
        }
    }
    void printList()
    {
        Node *ptr;
        ptr = start;
        while(ptr!=NULL)
        {
            cout<<ptr->data<<endl;
            ptr  =ptr->next;
        }
    }

    
};

int main()
{
    linkedList l1;
    int num;
   
    while(1)
    {
      cin>>num;
    if(num==-1)
      break;
    l1.addNode(num);   
    }
    cin>>num;
    l1.insertSorted(num);
    l1.printList();
    return 0;
}




