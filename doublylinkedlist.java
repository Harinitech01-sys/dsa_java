//INSERT AT BEGINNING AND END =================================================================================================================
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

// void insertbeg(int data){
//     Node newnode=new Node(data);

//     if(head==null){
//         head=newnode;
//         tail=newnode;
//     }
//     else{
//         newnode.next=head;
//         head.prev=newnode;
//         head=newnode;
//     }
// }

// void insertend(int data){
//     Node newnode=new Node(data);

//     if(head==null){
//         head=newnode;
//         tail=newnode;
//     }
//     else{
//         tail.next=newnode;
//         newnode.prev=tail;
//         tail=newnode;
//     }
// }

// void display(){
//     Node current=head;
//     if(head==null){
//         System.out.println("List is empty");
//         return;
//     }
//     while(current!=null){
//         System.out.print(current.data+" ");
//         current=current.next;
//     }
//     System.out.println();
// }
// }

// public class doublylinkedlist {
//     public static void main(String[] args) {
//         LinkedList list=new LinkedList();
//         list.insertbeg(10);
//         list.insertbeg(20);
//         list.insertend(30);
//         list.insertend(40);
//         list.display();
//     }
// }


//delete at beginning and end =================================================================================================================
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

// void deletebeg(){
//     if(head==null){
//         System.out.println("List is empty");
//         return;
//     }
//     if(head==tail){
//         head=null;
//         tail=null;
//     }
//     else{
//         head=head.next;
//         head.prev=null;
//     }
// }

// void deleteend(){
//     if(head==null){
//         System.out.println("List is empty");
//         return;
//     }
//     if(head==tail){
//         head=null;
//         tail=null;
//     }
//     else{
//         tail=tail.prev;
//         tail.next=null;
//     }
// }

// void display(){
//     Node current=head;
//     if(head==null){
//         System.out.println("List is empty");
//         return;
//     }
//     while(current!=null){
//         System.out.print(current.data+" ");
//         current=current.next;
//     }
//     System.out.println();
// }
// }

// public class doublylinkedlist {
//     public static void main(String[] args) {
//         LinkedList list=new LinkedList();
//         list.deletebeg();
//         list.deleteend();
//         list.display();
//     }
// }


