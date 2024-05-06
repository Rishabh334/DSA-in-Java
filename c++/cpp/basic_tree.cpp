#include <iostream>
using namespace std;

class Node {
    public:
        int data;
        Node *left;
        Node *right;

        Node(int);
};

Node::Node(int data) {
    this -> data = data;
    this -> left = NULL;
    this -> right = NULL;
}

Node *insertNode(Node *root, int data) {
    if (root == NULL) {
        Node *value = new Node(data);
        root = value;
    } else if (data <= root -> data) {
        root -> left = insertNode(root -> left, data);
    } else {
        root -> right = insertNode(root -> right, data);
    }

    return root;
}

int main(void) {
    Node *root = NULL;

    root = insertNode(root, 35);

    return 0;
}
