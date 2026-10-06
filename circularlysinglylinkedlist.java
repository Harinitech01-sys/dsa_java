
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }


// class LinkedList {
//     Node head = null;
//     Node tail = null;

// Insert at Beginning==========================================================================================================================

//     void insertbeg(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//             newnode.next = head;
//         } else {
//             newnode.next = head;
//             head = newnode;
//             tail.next = head;
//         }
//     }

// InsertEnd==============================================================================================================================================

//     void insertend(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//             newnode.next = head;
//         } else {
//             newnode.next = head;
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//Insert at Position=======================================================================================================================

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

//         if (temp == tail && pos > 1) {
//             insertend(data);
//             return;
//         }

//         newnode.next = temp.next;
//         temp.next = newnode;
//     }

//Insert by Value=============================================================================================================================

//     void insertvalue(int data, int value) {
//         Node newnode = new Node(data);
//         Node temp = head;

//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         do {
//             if (temp.data == value) {
//                 if (temp == head) {
//                     insertbeg(data);
//                     return;
//                 }

//                 newnode.next = temp.next;
//                 temp.next = newnode;

//                 if (temp == tail) {
//                     tail = newnode;
//                 }

//                 return;
//             }

//             temp = temp.next;
//         } while (temp != head);

//         System.out.println("Value not found");
//     }

//  Delete at Beginning-------------------------------------------------------------------------------------------------------------------------

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
//             tail.next = head;
//         }
//     }

// Delete at End-----------------------------------------------------------------------------------------------------------------------------

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
//             Node temp = head;

//             while (temp.next != tail) {
//                 temp = temp.next;
//             }

//             tail = temp;
//             tail.next = head;
//         }
//     }

// DeletePosition---------------------------------------------------------------------------------------------------------------------------

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

//         for (int i = 1; i < pos - 1 && temp.next != head; i++) {
//             temp = temp.next;
//         }

//         if (temp.next == head) {
//             System.out.println("Invalid position");
//             return;
//         }

//         if (temp.next == tail) {
//             deleteend();
//             return;
//         }

//         temp.next = temp.next.next;
//     }

// Delete by Value----------------------------------------------------------------------------------------------------------------------------

//     void deletevalue(int value) {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (head.data == value) {
//             deletebeg();
//             return;
//         }

//         Node temp = head;

//         do {
//             if (temp.next.data == value) {

//                 if (temp.next == tail) {
//                     deleteend();
//                     return;
//                 }

//                 temp.next = temp.next.next;
//                 return;
//             }
//             temp = temp.next;
//         } while (temp != tail);

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


// public class circularlysinglylinkedlist {
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