
// class Node {
//     int data;
//     Node next;
//     Node prev;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//         this.prev = null;
//     }
// }

// class LinkedList {
//     Node head = null;
//     Node tail = null;

//Insert at Beginning==========================================================================================================================

//     void insertbeg(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//             head.next = head;
//             head.prev = head;
//         } else {
//             newnode.next = head;
//             newnode.prev = tail;
//             head.prev = newnode;
//             tail.next = newnode;
//             head = newnode;
//         }
//     }

// Insert at End=============================================================================================================================
//     void insertend(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//             head.next = head;
//             head.prev = head;
//         } else {
//             newnode.next = head;
//             newnode.prev = tail;
//             tail.next = newnode;
//             head.prev = newnode;
//             tail = newnode;
//         }
//     }

//Insert at Position---------------------------------------------------------------------------------------------------------------------------

//     void insertpos(int data, int pos) {
//         Node newnode = new Node(data);

//         if (pos == 1) {
//             insertbeg(data);
//             return;
//         }

//         Node temp = head;

//         for (int i = 1; i < pos - 1 && temp != tail; i++) {
//             temp = temp.next;
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

//Insert by Value----------------------------------------------------------------------------------------------------------------------------

//     void insertvalue(int data, int value) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node temp = head;

//         do {
//             if (temp.data == value) {

//                 if (temp == head) {
//                     insertbeg(data);
//                     return;
//                 }

//                 newnode.next = temp;
//                 newnode.prev = temp.prev;
//                 temp.prev.next = newnode;
//                 temp.prev = newnode;

//                 return;
//             }

//             temp = temp.next;
//         } while (temp != head);

//         System.out.println("Value not found");
//     }

// Delete at Beginning-----------------------------------------------------------------------------------------------------

//     void deletebeg() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         else if (head == tail) {
//             head = null;
//             tail = null;
//         } else {
//             head = head.next;
//             head.prev = tail;
//             tail.next = head;
//         }
//     }

//  Delete at End-----------------------------------------------------------------------------------------------------------------------------

//     void deleteend() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         else if (head == tail) {
//             head = null;
//             tail = null;
//         } else {
//             tail = tail.prev;
//             tail.next = head;
//             head.prev = tail;
//         }
//     }

// Delete at Position------------------------------------------------------------------------------------------------------------------------
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
//         for (int i = 1; i < pos && temp != tail; i++) {
//             temp = temp.next;
//         }
//         if (temp == tail && pos > 1) {
//             if (temp == head) {
//                 System.out.println("Invalid position");
//                 return;
//             }
//             deleteend();
//             return;
//         }
//         temp.prev.next = temp.next;
//         temp.next.prev = temp.prev;
//     }

//Delete by Value-----------------------------------------------------------------------------------------------------------------------------------------
//     void deletevalue(int value) {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         Node temp = head;
//         do {
//             if (temp.data == value) {

//                 if (temp == head) {
//                     deletebeg();
//                     return;
//                 }

//                 if (temp == tail) {
//                     deleteend();
//                     return;
//                 }

//                 temp.prev.next = temp.next;
//                 temp.next.prev = temp.prev;

//                 return;
//             }

//             temp = temp.next;
//         } while (temp != head);

//         System.out.println("Value not found");
//     }

//     void display() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         Node current = head;

//         do {
//             System.out.print(current.data + " ");
//             current = current.next;
//         } while (current != head);

//         System.out.println();
//     }
// }

// public class circularlydoublelinkedlist {
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