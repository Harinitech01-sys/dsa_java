
//insert at beginning-----------------------------------------------------------------------------------------------------------------
// class Node {
//     int data;
//     Node next;

//     Node(int n) {
//         this.data = n;
//         this.next = null;
//     }
// }

// class MyLinkedlist {
//     Node head = null;

//     public void insertbeg(int num) {
//         Node newnode = new Node(num);
//         newnode.next = head;
//         head = newnode;
//     }

//     void Display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         Linkedlist l1 = new Linkedlist();

//         l1.insertbeg(10);
//         l1.insertbeg(20);
//         l1.insertbeg(30);

//         l1.Display();
//     }
// }

   

//INSERT AT END---------------------------------------------------------------------------------------------------------------------

// class Node {
//     int data;
//     Node next;

//     Node(int n) {
//         this.data = n;
//         this.next = null;
//     }
// }

// class MyLinkedList {
//     Node head = null;
//     Node tail = null;

//     void insertbeg(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             newnode.next = head;
//             head = newnode;
//         }
//     }

//     void insertend(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void Display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }

// public class linkedlist {
//     public static void main(String[] args) {
//         MyLinkedList list = new MyLinkedList();

//         list.insertbeg(30);
//         list.insertbeg(20);
//         list.insertbeg(10);

//         list.insertend(40);
//         list.insertend(50);

//         list.Display();
//     }
// }

//INSERT AT POSITION------------------------------------------------------------------------------------------------------------------
// class Node {
//     int data;
//     Node next;

//     Node(int n) {
//         this.data = n;
//         this.next = null;
//     }
// }

// class MyLinkedList {
//     Node head = null;
//     Node tail = null;

//     void insertbeg(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             newnode.next = head;
//             head = newnode;
//         }
//     }

//     void insertend(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void insertpos(int num, int pos) {
//         Node newnode = new Node(num);

//         if (pos == 1) {
//             insertbeg(num);
//             return;
//         }

//         Node temp = head;

//         for (int i = 1; i < pos - 1; i++) {
//             temp = temp.next;
//         }

//         newnode.next = temp.next;
//         temp.next = newnode;

//         if (newnode.next == null) {
//             tail = newnode;
//         }
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }

// public class MyList {
//     public static void main(String[] args) {

//         MyLinkedList list = new MyLinkedList();

//         list.insertend(10);
//         list.insertend(20);
//         list.insertend(30);
//         list.insertend(40);

//         list.insertpos(25, 3);

//         list.display();
//     }
// }

//Insert at a value-------------------------------------------------------------------------------------------------------------------------

// class Node:
//     def __init__(self, data):
//         self.data = data
//         self.next = None


// class LinkedList:
//     def __init__(self):
//         self.head = None

//     def insert_at_value(self, value, new_value):
//         temp = self.head

//         while temp is not None:
//             if temp.data == value:
//                 new_node = Node(new_value)
//                 new_node.next = temp.next
//                 temp.next = new_node
//                 return

//             temp = temp.next

//         print("Value not found")

//     def display(self):
//         temp = self.head
//         while temp is not None:
//             print(temp.data, end=" -> ")
//             temp = temp.next
//         print("None")



// ll = LinkedList()

// ll.head = Node(10)
// ll.head.next = Node(20)
// ll.head.next.next = Node(30)


// ll.insert_at_value(20, 25)

// ll.display()

//UPDATE NODE-----------------------------------------------------------------------------------------------------------------------

// class Node {
//     int data;
//     Node next;

//     Node(int n) {
//         this.data = n;
//         this.next = null;
//     }
// }

// class MyLinkedList {
//     Node head = null;
//     Node tail = null;

//     void insertbeg(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             newnode.next = head;
//             head = newnode;
//         }
//     }

//     void insertend(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void update(int oldValue, int newValue) {
//         Node temp = head;

//         while (temp != null) {
//             if (temp.data == oldValue) {
//                 temp.data = newValue;
//                 return; 
//             }
//             temp = temp.next;
//         }
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }
//     public class MyList {
//         public static void main(String[] args) {

//             MyLinkedList list = new MyLinkedList();

//             list.insertend(10);
//             list.insertend(20);
//             list.insertend(30);
//             list.insertend(40);

//             System.out.println("Before update:");
//             list.display();

//             list.update(20, 25);

//             System.out.println("After update:");
//             list.display();
//         }
//     }

//UPDATE BY VALUE------------------------------------------------------------------------------------------------------------------------------
// class Node {
//     int data;
//     Node next;

//     Node(int n) {
//         this.data = n;
//         this.next = null;
//     }
// }

// class MyLinkedList {
//     Node head = null;
//     Node tail = null;

//     void insertbeg(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             newnode.next = head;
//             head = newnode;
//         }
//     }

//     void insertend(int num) {
//         Node newnode = new Node(num);

//         if (head == null) {
//             head = newnode;
//             tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

// void updatebyvalue(int old,int cur){
//         Node temp=head;
//         while(temp!=null){
//             if(temp.data==old){
//                 temp.data=cur;
//             }
//             temp=temp.next;
//         }
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }
//     public class MyList {
//         public static void main(String[] args) {

//             MyLinkedList list = new MyLinkedList();

//             list.insertend(10);
//             list.insertend(20);
//             list.insertend(30);
//             list.insertend(40);

//             System.out.println("Before update:");
//             list.display();

//             list.update(20, 25);

//             System.out.println("After update:");
//             list.display();
//         }
//     }


//delete at beginning------------------------------------------------------------------------------------------------------------

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// class Linkedlist {
//     Node head = null;
//     Node tail = null;

//     void insert(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void deleteBeg() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         head = head.next;

//         if (head == null) {
//             tail = null;
//         }
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Linkedlist list = new Linkedlist();

//         list.insert(10);
//         list.insert(20);
//         list.insert(30);

//         list.display();
//         list.deleteBeg();
//         list.display();
//     }
// }


//delete at end------------------------------------------------------------------------------------------------------------------------------

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// class Linkedlist {
//     Node head = null;
//     Node tail = null;

//     void insert(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void deleteEnd() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (head == tail) {
//             head = tail = null;
//             return;
//         }

//         Node temp = head;

//         while (temp.next != tail) {
//             temp = temp.next;
//         }

//         temp.next = null;
//         tail = temp;
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Linkedlist list = new Linkedlist();

//         list.insert(10);
//         list.insert(20);
//         list.insert(30);

//         list.display();
//         list.deleteEnd();
//         list.display();
//     }
// }


//. Delete by value---------------------------------------------------------------------------------------------------------------------------

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// class Linkedlist {
//     Node head = null;
//     Node tail = null;

//     void insert(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void deleteValue(int value) {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (head.data == value) {
//             head = head.next;

//             if (head == null) {
//                 tail = null;
//             }
//             return;
//         }

//         Node temp = head;

//         while (temp.next != null && temp.next.data != value) {
//             temp = temp.next;
//         }

//         if (temp.next == null) {
//             System.out.println("Value not found");
//             return;
//         }

//         if (temp.next == tail) {
//             tail = temp;
//         }

//         temp.next = temp.next.next;
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Linkedlist list = new Linkedlist();

//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);

//         list.display();
//         list.deleteValue(30);
//         list.display();
//     }
// }

//Delete at a specific position------------------------------------------------------------------------------------------------------------------

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// class Linkedlist {
//     Node head = null;
//     Node tail = null;

//     void insert(int data) {
//         Node newnode = new Node(data);

//         if (head == null) {
//             head = tail = newnode;
//         } else {
//             tail.next = newnode;
//             tail = newnode;
//         }
//     }

//     void deletePos(int pos) {
//         if (pos < 1 || head == null) {
//             System.out.println("Invalid position");
//             return;
//         }

//         if (pos == 1) {
//             head = head.next;

//             if (head == null) {
//                 tail = null;
//             }
//             return;
//         }

//         Node temp = head;

//         for (int i = 1; i < pos - 1 && temp != null; i++) {
//             temp = temp.next;
//         }

//         if (temp == null || temp.next == null) {
//             System.out.println("Invalid position");
//             return;
//         }

//         if (temp.next == tail) {
//             tail = temp;
//         }

//         temp.next = temp.next.next;
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Linkedlist list = new Linkedlist();

//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);

//         list.display();
//         list.deletePos(3);
//         list.display();
//     }
// }