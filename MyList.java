
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

   

//INSERT AT END

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

//INSERT AT POSITION
class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class MyLinkedList {
    Node head = null;
    Node tail = null;

    void insertbeg(int num) {
        Node newnode = new Node(num);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    void insertend(int num) {
        Node newnode = new Node(num);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    void insertpos(int num, int pos) {
        Node newnode = new Node(num);

        if (pos == 1) {
            insertbeg(num);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;

        if (newnode.next == null) {
            tail = newnode;
        }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class MyList {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insertend(10);
        list.insertend(20);
        list.insertend(30);
        list.insertend(40);

        list.insertpos(25, 3);

        list.display();
    }
}