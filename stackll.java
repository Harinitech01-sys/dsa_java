// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class StackLinkedList {
//     Node head = null;

//     void push(int data) {
//         Node newNode = new Node(data);

//         newNode.next = head;
//         head = newNode;
//     }

//     void pop() {
//         if (head == null) {
//             System.out.println("Stack is empty");
//         } else {
//             head = head.next;
//         }
//     }

//     void peek() {
//         if (head == null) {
//             System.out.println("Stack is empty");
//         } else {
//             System.out.println(head.data);
//         }
//     }
// }

// public class stackll {
//     public static void main(String[] args) {
//         StackLinkedList s = new StackLinkedList();

//         s.push(10);
//         s.push(20);
//         s.push(30);

//         s.peek();

//         s.pop();

//         s.peek();
//     }
// }


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

// class StackdoublyLinkedList {
//     Node head = null;

//     void push(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//         } else {
//            tail.next = newNode;
//             newNode.prev = tail;
//             tail = newNode;
//         }
//     }

//     }
//     void pop() {
//     if (head == null) { 
//         System.out.println("Stack is empty");
//     } 
//     else if (head == tail) {
//         head = null;
//         tail = null;
//     } 
//     else {
//         tail = tail.prev;
//         tail.next = null;
//     }
// }

//     void peek() {
//         if (head == null) {
//             System.out.println("Stack is empty");
//         } else {
//             System.out.println(tail.data);
//         }
//     }

// public class stackll {
//     public static void main(String[] args) {
//         StackdoublyLinkedList s = new StackdoublyLinkedList();

//         s.push(10);
//         s.push(20);
//         s.push(30);

//         s.peek();

//         s.pop();

//         s.peek();
//     }
// }