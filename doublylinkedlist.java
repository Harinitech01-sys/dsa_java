

// class Node {
//     int data;
//     Node next;
//     Node prev;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }



// class LinkedList {
//     Node head = null;
//     Node tail = null;

//InsertBeginning=================================================================================================================================

//     void insertbeg(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             newnode.next = head;
//             head.prev = newnode;
//             head = newnode;
//         }
//     }

//Insert at End===================================================================================================================================

//     void insertend(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             newnode.prev = tail;
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//Insert by Position====================================================================================================================

//     void insertpos(int data, int pos) {
//         Node newnode = new Node(data);

//         if (pos == 1) {
//             insertbeg(data);
//             return;
//         }

//         Node temp = head;

//         for (int i = 1; i < pos - 1 && temp != null; i++) {
//             temp = temp.next;
//         }

//         if (temp == null) {
//             System.out.println("Invalid position");
//             return;
//         }

//         if (temp == tail) {
//             insertend(data);
//             return;
//         }

//         newnode.next = temp.next;
//         newnode.prev = temp;
//         temp.next.prev = newnode;
//         temp.next = newnode;
//     }

//Insert  Value=====================================================================================================================

//     void insertvalue(int data, int value) {
//         Node newnode = new Node(data);
//         Node temp = head;

//         while (temp != null && temp.data != value) {
//             temp = temp.next;
//         }

//         if (temp == null) {
//             System.out.println("Value not found");
//             return;
//         }

//         if (temp == head) {
//             insertbeg(data);
//             return;
//         }

//         newnode.next = temp;
//         newnode.prev = temp.prev;
//         temp.prev.next = newnode;
//         temp.prev = newnode;
//     }

// Delete at Beg=======================================================================================================================

//     void deletebeg() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         else if (head == tail) {
//             head = null;
//             tail = null;
//         }

//         else {
//             head = head.next;
//             head.prev = null;
//         }
//     }

// Delete at End======================================================================================================================

//     void deleteend() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         else if (head == tail) {
//             head = null;
//             tail = null;
//         }

//         else {
//             tail = tail.prev;
//             tail.next = null;
//         }
//     }

// Delete at Position==============================================================================================================

//     void deletepos(int pos) {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (pos == 1) {
//             deletebeg();
//             return;
//         }

//         Node temp = head;

//         for (int i = 1; i < pos && temp != null; i++) {
//             temp = temp.next;
//         }

//         if (temp == null) {
//             System.out.println("Invalid position");
//             return;
//         }

//         if (temp == tail) {
//             deleteend();
//             return;
//         }

//         temp.prev.next = temp.next;
//         temp.next.prev = temp.prev;
//     }

// Delete by Value==============================================================================================================

//     void deletevalue(int value) {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node temp = head;

//         while (temp != null && temp.data != value) {
//             temp = temp.next;
//         }

//         if (temp == null) {
//             System.out.println("Value not found");
//             return;
//         }

//         if (temp == head) {
//             deletebeg();
//             return;
//         }

//         if (temp == tail) {
//             deleteend();
//             return;
//         }

//         temp.prev.next = temp.next;
//         temp.next.prev = temp.prev;
//     }



//     void display() {
//         Node current = head;

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }

//         System.out.println();
//     }
// }

// public class doublylinkedlist {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.insertbeg(10);
//         list.insertbeg(20);
//         list.insertend(30);
//         list.insertend(40);
//         list.insertpos(25, 3);
//         list.insertvalue(15, 20);

//         list.display();

//         list.deletebeg();
//         list.deleteend();
//         list.deletepos(2);
//         list.deletevalue(25);

//         list.display();
//     }
// }
// }