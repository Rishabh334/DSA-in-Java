#include <iostream>
#include<bits/stdc++.h>
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
class Queue {
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
	}
void enQueue(int x)
	{
QNode *front, *rear;
		// Create a new LL node
		QNode* temp = new QNode(x);

		// If queue is empty, then
		// new node is front and rear both
		//if (isempty()) {
		//	front = rear = temp;
		//	return;
		//}

		// Add the new node at
		// the end of queue and change rear
		rear->next = temp;
		rear = temp;
	}

// Function to remove
	// a key from given queue q
	void deQueue()
	{

        QNode *front, *rear;
		// If queue is empty, return NULL.
		//if (isempty())
		//	return;

		// Store previous front and
		// move front one node ahead
		QNode* temp = front;
		front = front->next;

		// If front becomes NULL, then
		// change rear also as NULL
		if (front == NULL)
			rear = NULL;

		delete (temp);
	}
	void displayQueue()
	{
       
 		/*if (isempty())
  			cout<<"Queue is empty\n";*/
 		//else
 		//{
  			QNode *ptr = front;
  			while( ptr !=NULL)
  			{
   				cout<<ptr->data<<" ";
   				ptr= ptr->next;
  			}
 		//}
	}	
;







};


// Driven Program
int main()
{

	Queue q;
	q.displayQueue();
	q.enQueue(10);
	q.enQueue(20);
	q.deQueue();
	q.deQueue();
	q.enQueue(30);
	q.enQueue(40);
	q.enQueue(50);
	q.deQueue();
	q.displayQueue();
}
// This code is contributed by rathbhupendra
