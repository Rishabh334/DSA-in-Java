#include <iostream>
using namespace std;

class QNode {
	public:
	int data;
	QNode* next;
	
	QNode(int d)
	{
		data = d;
		next = NULL;
	}
	
};



class Queue{
public:

	QNode *front, *rear;
Queue()
	{
		front = rear = NULL;
	}
	bool isempty()
	{
 		if(front == NULL && rear == NULL)
		 	return true;
 		else
 			return false;
	};
void enQueue(int x)
{
    QNode *temp =new QNode(x);
    if(isempty()){
        front =rear =temp;
        return ;
         rear ->next =temp;
         temp =rear;
         

    }
}

void displayQueue()
	{
 		if (isempty())
  			cout<<"Queue is empty\n";
 		else
 		{
  			QNode *ptr = front;
  			while( ptr !=NULL)
  			{
   				cout<<ptr->data<<" ";
   				ptr= ptr->next;
  			}
 		}
}
};

int main()
{

	Queue q;
//	q.displayQueue();
	q.enQueue(10);
	q.enQueue(20);
	//q.deQueue();
	//q.deQueue();
	q.enQueue(30);
	q.enQueue(40);
	q.enQueue(50);
	//q.deQueue();
	q.displayQueue();
}
// This code is contributed by rathbhupendra

