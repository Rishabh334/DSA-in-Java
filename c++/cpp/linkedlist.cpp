
#include<bits/stdc++.h>
#include<iostream>
using namespace std;
class Node{
    public:
    int data;
    Node*next;

};
int main(){
Node* head=Null;
Node* second=Null;
Node* third=Null;

head  = new Node();
second=new Node();
third=new Node();


 head->data=1;
 head->next=second;

head->data=2;
 head->next=third;
 head->data=3;
 head->next=Null;
 return 0;
 
}

