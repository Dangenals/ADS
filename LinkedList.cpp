#include <iostream>
using namespace std;
class Node{
public: 
int data;
string text;
Node *next;
Node(){
  next=NULL;
}
Node(int a){
  data=a;
  next=NULL;
}
Node(int a, int b){
  data = a + b;
  next = NULL;
}
};
int main(){
  Node *first = new Node();
  first->data = 70;
  first->next = NULL;
  Node *second = new Node();
  second->data = 90;
  first->next = second;
  second->next=NULL;
  Node *pre = new Node();
  pre->data = 50;
  Node *current = new Node;
  current = pre;
  Node *afterpre = new Node;
  afterpre->data = 60;
  afterpre->next=first;
  while(current->next!=NULL){
    current = current ->next;
  }
  current->next = afterpre;
  while(current!=NULL){
    cout<<current->data<<" ";
    current = current->next;
  }
}
