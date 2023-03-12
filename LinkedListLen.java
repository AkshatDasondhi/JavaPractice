class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public void sort() {
        Node curr = head;
        while (curr != null) {
            Node index = curr.next;
            while (index != null) {
                if (curr.data > index.data) {
                    int temp = curr.data;
                    curr.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void lengthOfList(){
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
}
class LinkedListLen {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(2);
        System.out.println("Original : ");
        list.display();
        list.reverse();
        System.out.println("Reversed : ");
        list.display();
        System.out.println("Sorted : ");
        list.sort();
        list.display();
        System.out.println("Length of the list : ");
        list.lengthOfList();
    }
}