// //insert  at beginning and end
// class Node{
//     int data;
//     Node next;
//     Node prev;

// Node(int data){
//     this.data=data;
//     this.next=null;
//     this.prev=null;
// }
// }

// class LinkedList{
//     Node head=null;
//     Node tail=null;

// void insertbeg(int data) {
//     Node newnode = new Node(data);

//     if (head == null) {
//         head = newnode;
//         tail = newnode;

//         head.next = head;
//         head.prev = head;
//     }
//     else {
//         newnode.next = head;
//         newnode.prev = tail;

//         head.prev = newnode;
//         tail.next = newnode;

//         head = newnode;
//     }
// }

// void insertend(int data) {
//     Node newnode = new Node(data);

//     if (head == null) {
//         head = newnode;
//         tail = newnode;

//         head.next = head;
//         head.prev = head;
//     }
//     else {
//         newnode.next = head;
//         newnode.prev = tail;

//         tail.next = newnode;
//         head.prev = newnode;

//         tail = newnode;
//     }
// }
// void display() {
//     Node current = head;

//     if (head == null) {
//         System.out.println("List is empty");
//         return;
//     }

//     do {
//         System.out.print(current.data + " ");
//         current = current.next;
//     } while (current != head);

//     System.out.println();
// }
// }

// public class circularly {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.insertbeg(10);
//         list.insertbeg(20);
//         list.insertend(30);
//         list.insertend(40);

//         list.display();
//     }
// }


//delete at end and begining==================================================================================================================
class Node{
    int data;
    Node next;
    Node prev;

Node(int data){
    this.data=daa;
    this.next=null;
    this.prev=null;

}

}

class Linkedlist(int data){
    Node head=null;
    Node tail=null;

void deletebeg(){
   if (head==null){
    System.out.println("List is empty");
    return;
   }
   else if(head==tail){
    head=null;
    tail=null;
   }
   else{
    head=head.next;
    head.prev=tail;
    tail.next=head;
   }

}
void deleteend(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    else if(head==tail){
        head=null;
        tail=null;
    }
    else{
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }
}